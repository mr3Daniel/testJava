package com.test.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.interfaceService.IUserService;
import com.test.demo.interfaces.IUser;
import com.test.demo.model.User;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private IUser usrData;
	
	@Override
	public List<User> list() {
		return (List<User>) usrData.findAll();
	}

	@Override
	public Optional<User> listId(int id) {
		return usrData.findById(id);
	}

	@Override
	public int save(User usr) {
		usrData.save(usr);
		return usr.equals(null) ? 0 : -1;
	}

	@Override
	public void delete(int id) {
		usrData.deleteById(id);
	}

}
