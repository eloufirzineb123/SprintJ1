
package fr.m2i.spring.lesson.spring.lesson.repository;

import fr.m2i.spring.lesson.spring.lesson.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;




public interface EmployeeRepository  extends JpaRepository<Employee,Long>{
    
}
