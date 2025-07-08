package com.mindshub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity(name = "teacher")
@Table(name = "tb_teacher")
@Data
public class Teacher extends User {

}
