package by.wawan.Spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {

        private Long personId;
        private String firstName;
        private String lastName;
        private String street;
        private String city;
        private String zip;
        private String email;
        //private Date birthday;
        private String phone;
    }

