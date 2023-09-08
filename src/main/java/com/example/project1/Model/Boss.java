package com.example.project1.Model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Boss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int bossId;
    String bossName;
    int age;
    float rating;
    int salary;
}
