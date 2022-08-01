/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.spring.lesson.spring.lesson.dao.impl;

import fr.m2i.spring.lesson.spring.lesson.dao.AccountDao;
import fr.m2i.spring.lesson.spring.lesson.model.Account;
import fr.m2i.spring.lesson.spring.lesson.model.Gender;
import java.time.LocalDate;
import static java.time.LocalDate.now;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author elouf
 */
@Component 
public class FakeAccountDaoImpl implements AccountDao {

    @Override
    public List<Account> getAllAccount() {
        List<Account> acoounts = new ArrayList<>();
        
        acoounts.add(new Account("Mark","Dean", "eloufir@gmaim.com", LocalDate.now(), Gender.MALE));
        acoounts.add(new Account("Mark2","Dean2", "eloufir2@gmaim.com", LocalDate.now(), Gender.MALE));
        
        return acoounts ;
    }
    
    
}
