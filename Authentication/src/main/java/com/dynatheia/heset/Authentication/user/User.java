package com.dynatheia.heset.Authentication.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jdk.jfr.Name;
import lombok.*;
import org.springframework.format.annotation.NumberFormat;

@Entity(name = "User")
@Table(
        name = "users",
        uniqueConstraints = {
                @UniqueConstraint(name = "user_email_unique", columnNames = "email")
        }
)
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@Getter
//@Setter
@AllArgsConstructor
@Data
public class User {

    @Id
    @SequenceGenerator(
            name = "user_uuid",
            sequenceName = "user_uuid"
    )
    @GeneratedValue(
            strategy = GenerationType.TABLE,
            generator = "user_uuid"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String firstName;

    @Column(
            name = "last_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String lastName;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    @Email
    private String email;

    @Column(
            name = "age",
            nullable = false

    )
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer age;

    public User(String firstName, String lastName, String email, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
}