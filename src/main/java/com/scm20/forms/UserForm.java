package com.scm20.forms;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class UserForm {

    private String name;
    private String email;
    private String password;
    private String phonenumber;
    private String about;
    
}
