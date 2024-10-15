package org.example.webjava.Projeck;

import javax.persistence.*;

@Entity
@Table(name = "projects")

public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
