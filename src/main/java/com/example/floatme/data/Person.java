package com.example.floatme.data;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Person {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
}
