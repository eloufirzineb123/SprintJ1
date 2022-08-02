package fr.m2i.spring.lesson.spring.lesson.service;

import fr.m2i.spring.lesson.spring.lesson.dao.AccountDao;
import fr.m2i.spring.lesson.spring.lesson.model.Employee;
import fr.m2i.spring.lesson.spring.lesson.repository.EmployeeRepository;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author elouf
 */
@Service
@Transactional
public class EmployeeService {
    
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService (EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
    
    public Employee findByFirstName(String firstname){
        return employeeRepository.findByFirstName(firstname);
    }
    public Employee findByLastName(String lastname){
        return employeeRepository.retrieveByLastName(lastname);
    }
//    public void create (Employee employee){
//        employeeRepository.save(employee);
//    }
    
    
    // rollback avec une exception
//  @Transactional
//    public void create (Employee employee){
//       employeeRepository.save(employee);
//       throw new DataIntegrityViolationException("rollback");
//  }
    
//    @Transactional
//     public void create (Employee employee) throws SQLException{
//       employeeRepository.save(employee);
//       throw new SQLException("Rollbach for SQL");
//    }
    
//       @Transactional(rollbackFor={SQLException.class})
//     public void create (Employee employee) throws SQLException{
//       employeeRepository.save(employee);
//       throw new SQLException("Rollbach for SQL");
//    }
    
       @Transactional(noRollbackFor={SQLException.class})
     public void create (Employee employee) throws SQLException{
       employeeRepository.save(employee);
       throw new SQLException("Rollbach for SQL");
    }
}
