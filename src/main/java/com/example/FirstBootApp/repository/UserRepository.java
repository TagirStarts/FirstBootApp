package com.example.FirstBootApp.repository;

import com.example.FirstBootApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
