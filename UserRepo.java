package com.example.Springboot.app;

import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepo extends JpaRepository<User,Integer> {

}
