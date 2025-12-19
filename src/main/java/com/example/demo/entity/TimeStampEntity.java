package com.example.demo.entity;

import jakata.persistence.*;
import lombok.*;
import java.util.*;
@Entity
@Data
@Getter
@Setter
@AllAgrsConstructor
@NoAgrsConstructor
public class TimeSampEntity{
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}