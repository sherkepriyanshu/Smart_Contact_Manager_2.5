package com.scm20.entities;


import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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


    @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true) //cascadetype.all - if user get deleted all contact associated with the user get deleted
     private List<Contact> contacts = new ArrayList<>();




}
