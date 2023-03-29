package com.example.PortFolio_Board_Java17.repository;


import com.example.PortFolio_Board_Java17.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}

