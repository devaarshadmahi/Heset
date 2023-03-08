package com.dynatheia.heset.Authentication.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

//@Entity(name = "User")
@Entity
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
@Builder
@EqualsAndHashCode
public class User implements UserDetails {

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
            name = "password",
            nullable = false,
            columnDefinition = "TEXT"
    )
    @NotNull
    private String password;

    @Column(
            name = "age",
            columnDefinition = ""
    )
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer age;

    @Column(
            name = "role",
            columnDefinition = "TEXT"
    )


    @Enumerated(EnumType.STRING)
    private Role role;


    @Column(
            name = "creation_date",
            nullable = false
    )
    @CreationTimestamp
    //@PastOrPresent
    private Date accountCreated;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<Note> notes;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Food> food;

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
                String password,
                Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}