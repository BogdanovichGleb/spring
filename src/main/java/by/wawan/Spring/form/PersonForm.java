package by.wawan.Spring.form;

import lombok.Data;

@Data
public class PersonForm {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String zip;
    private String email;
    private String phone;
}