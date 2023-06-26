package com.kevcode.fullstackbackend.repository;

import com.kevcode.fullstackbackend.model.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
