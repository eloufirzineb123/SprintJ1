/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.spring.lesson.spring.lesson.service;

import fr.m2i.spring.lesson.spring.lesson.dao.AccountDao;
import fr.m2i.spring.lesson.spring.lesson.model.Account;
import static java.util.Comparator.comparing;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author elouf
 */


@Service
public class AccountService {
    private final AccountDao accountDao;

    public AccountService(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public Optional<Account> findOldestClient() {
        return accountDao.getAllAccount().stream().min(comparing(Account::getBirthday));
    }
}
