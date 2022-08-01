
package fr.m2i.spring.lesson.spring.lesson.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "email")
@Entity
@Table(name ="accounts")
public class Account {
    @Id
    @GeneratedValue
    private Long id;
    
       @Column(name="first_name")
    private  String firstname;
       
       
        @Column(name="last_name")
    private  String lastname;
        
          @Column(name="email", unique=true)
    private  String email;
          
          
            @Column(name="birthday")
    private  LocalDate  birthday;
        
        @Column(name="gender")
       @Enumerated (EnumType.STRING)
       private Gender gender;
        
    @CreationTimestamp
    @Column(name="creation_time")
        private  LocalDate creationTime ;
    
    @Column(name="balance")
    private float balance =0f;

    public Account(String firstname, String lastname, String email, LocalDate birthday, Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.birthday = birthday;
        this.gender = gender;
    }
    
    
    
}
