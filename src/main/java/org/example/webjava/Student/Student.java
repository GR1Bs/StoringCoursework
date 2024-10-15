package org.example.webjava.Student;


import javax.annotation.processing.Generated;
import javax.persistence.*;

/**
 * БД студента
 * 1 IDстудента
 * 2 ФИО студента
 * 3 Группа студента
 * 4 Пароль студента
 * 5 Почта студента
 * 6 Роль присваемая при регистрации
 */

@Entity //Позволяет рабоать с базами данных
@Table(name="student")//создаёт таблицу студентов
public class Student {

   @Id //Обозначает первичный ключ primary key (оьязательная анатация,присваевает уникальный ключь)
   @GeneratedValue(strategy = GenerationType.AUTO)//автоматически бкдет делать ID
   private long id;
    private String fullName;
    private String group;
    @Column(nullable = false)//позволяет произвести более тонкую настройку проецирования свойства email класса в колонку таблицы БД
    private String email;
    private String password;
    private String role;

}

