package com.tkachuk.UserKeeper.repository;

import com.tkachuk.UserKeeper.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
