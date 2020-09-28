package com.test.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.demo.interfaceService.IUserService;
import com.test.demo.model.User;

@Controller
@RequestMapping
public class UserController {
	
	@Autowired	
	private IUserService usrService;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<User> users = usrService.list();
		model.addAttribute("users", users);
		return "index";
	}
	
	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("user", new User());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated User usr, Model model) {
		usrService.save(usr);
		return "redirect:/list";
	}
	
	@GetMapping("/modify/{id}")
	public String modify(@PathVariable int id, Model model) {
		Optional<User> user = usrService.listId(id);
		model.addAttribute("user", user);
		return "form";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		usrService.delete(id);
		return "redirect:/list";
	}
}
