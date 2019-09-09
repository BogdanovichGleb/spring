package by.wawan.Spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.hibernate.annotations.Entity;

import javax.persistence.*;

@Data
@Entity
@Table(name = "person")
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name="name")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "zip")
    private String zip;
    @Column(name = "email")
    private String email;
   // @Column(name = "bday")
   // private Date birthday;
    @Column(name = "phone")
    private String phone;

}