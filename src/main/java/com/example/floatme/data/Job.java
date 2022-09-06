package com.example.floatme.data;
import lombok.*;
import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @Generated
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private int salary;

}
