package com.imaginology.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imaginology.ums.entity.User;


public interface UserRepository extends JpaRepository<User,Long> {

}
