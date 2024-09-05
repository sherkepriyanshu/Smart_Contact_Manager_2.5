package com.scm20.forms;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//we have passed this class object into controller as @modelAttribute UserForm userForm

//data-th-object="${userForm}"
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserForm {
    @NotBlank(message = "Usename is required")
    @Size(min =3,message = "Min 3 Charactes is required")
    private String name;
    @NotBlank(message = "Email is required")
    private String email;
    @NotBlank(message = "Password is required")
    @Size(min =6 ,message = "Min 6 Characters is required")
    private String password;
    @NotBlank(message = "Invalid Phone number")
    private String phonenumber;
    @NotBlank(message = "About is required")
    private String about;
    
}
