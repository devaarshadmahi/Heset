package com.dynatheia.heset.Authentication.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;
import jdk.jfr.Name;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.sql.Date;

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
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@EqualsAndHashCode
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
    @NotNull
    private String firstName;

    @Column(
            name = "last_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    @NotNull
    private String lastName;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    @Email
    @NotNull
    private String email;

    @Column(
            name = "age",
            columnDefinition = "",
            nullable = false
    )
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    @NotNull
    private Integer age;


    @Column(
            name = "creation_date",
            nullable = false
    )
    @CreationTimestamp
    //@PastOrPresent
    private Date accountCreated;

//    public User(@JsonProperty("first_name") String firstName,
//                @JsonProperty("last_name")String lastName,
//                @JsonProperty("email")String email,
//                @JsonProperty("age")Integer age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.age = age;
//    }
public User(String firstName,
            String lastName,
            String email,
            Integer age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.age = age;
}
}