package com.emanuel.accounts.repository;

import com.emanuel.accounts.entities.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts,Long> {
}
