package com.imaginology.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imaginology.ums.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}



