package com.test.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.model.User;

@Repository
public interface IUser extends CrudRepository<User, Integer>{

}
