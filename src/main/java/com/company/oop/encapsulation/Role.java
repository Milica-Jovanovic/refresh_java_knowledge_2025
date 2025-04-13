package com.company.oop.encapsulation;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Role {
    private long id;
    private String description;


    // boilerplate code
    /* public Role() {
    }

    public Role(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    } */

    // Instead of boilerplate code we will use LOMBOK
    // lombok dependency needs to be added into maven pom.xml file
    // Lombok plagin needs to be installed
    // Enable Annotation processing
}
