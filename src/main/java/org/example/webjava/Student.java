package org.example.webjava;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //Позволяет рабоать с базами данных
public class Student {

   @Id //Обозначает первичный ключ primary key (оьязательная анатация,присваевает уникальный ключь)
    private long id;
    private String email;
    private String password;
    private String fiel;
}
