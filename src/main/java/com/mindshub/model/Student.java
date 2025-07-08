package com.mindshub.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "student")
@Table(name = "tb_student")
@Data
public class Student extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "student_xp", length = 3)
    private Integer xp;

    @Column(name = "student_level", length = 2)
    private Integer level;
}
