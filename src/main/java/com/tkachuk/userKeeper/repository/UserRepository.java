package com.tkachuk.userKeeper.repository;


import com.tkachuk.userKeeper.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
