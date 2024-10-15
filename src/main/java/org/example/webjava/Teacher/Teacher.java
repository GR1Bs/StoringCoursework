package org.example.webjava.Teacher;

import javax.persistence.*;

/**
 * БД преподователя
 * 1 ФИО преподователя
 * 2 Роль выбраная при регистрации
 * 3 почта преподователся
 * 4 пароль преподавателя
 */
@Entity// позволяет работать с бд
@Table(name = "teacher")//создаёт таблицу преподователи
public class Teacher {
    @Id// присваивает primary key
    @GeneratedValue(strategy = GenerationType.AUTO)//создаёт уникальный айди
    private long id;

    private String fullName;
    private String email;
    private String password;
    private String role;

}
