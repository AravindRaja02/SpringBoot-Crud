package com.aravindraja.springcrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aravindraja.springcrud.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{

	//User findOne(int id);

	

	

}
