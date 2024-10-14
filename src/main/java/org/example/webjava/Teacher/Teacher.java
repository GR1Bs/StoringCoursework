package org.example.webjava.Teacher;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
    @Id
    private long id;
    private String email;
    private String password;
    private String roll;

}
