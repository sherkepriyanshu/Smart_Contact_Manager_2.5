package com.scm20.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contact {

        @Id
        private String id;
        private String name;
        private String email;
        private String phonenumber;
        private String address;
        private String picture;
        @Column(length=1000)
        private String description;
        private boolean favorite = false;
        private String instagramLink;
        private String facebookLink;
        private String websiteLink;
        private String linkdinLink;

        


}
