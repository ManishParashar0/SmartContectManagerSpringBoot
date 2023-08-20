package com.manish.Smartmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manish.Smartmanager.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
