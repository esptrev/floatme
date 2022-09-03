package com.example.floatme.data;
import lombok.*;
import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

@Table(name = "jobs")
public class Job {
@Generated
private long id;

@Column(nullable = false)
private String title;
private int salary;

}
