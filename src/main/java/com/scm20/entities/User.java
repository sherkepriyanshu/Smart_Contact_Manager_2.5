package com.scm20.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name ="user")

@Table(name="users ")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String userId;  //no need for generativevalue for id , we manually generate the id of user
    @Column(name ="")
    private String name;
    @Column(nullable = false,unique = true)
    private String email;
    private String password;
    @Column(length=1000)
    private String about;
    @Column(length=1000)
    private String profilePic;
    private String phonenumber;

    //information
    private boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    //SELF , GOOGLE , FACEBOOK, TWITTER ,LINKEDIN ,GITHUB
    private Providers  provider = Providers.SELF;
    private String providerUserID;


    

}
