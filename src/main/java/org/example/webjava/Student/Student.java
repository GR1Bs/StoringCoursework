package org.example.webjava.Student;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //Позволяет рабоать с базами данных
public class Student {

   @Id //Обозначает первичный ключ primary key (оьязательная анатация,присваевает уникальный ключь)
    private long id;
    private String email;
    private String password;
    private String fiel;

    private String name="asdasd";
}

