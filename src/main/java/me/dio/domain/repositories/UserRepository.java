package me.dio.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

    boolean existsByAccountNumber(String accountNumber);

}
