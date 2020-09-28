package com.test.demo.interfaceService;

import java.util.Optional;
import java.util.List;

import com.test.demo.model.User;

public interface IUserService {
	public List<User> list();
	public Optional<User> listId(int id);
	public int save(User usr);
	public void delete(int id);
}
