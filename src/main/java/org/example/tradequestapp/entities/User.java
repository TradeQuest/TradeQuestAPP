package org.example.tradequestapp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "User")
public class User {

    enum Role {
        ADMIN, STUDENT
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false, unique = true)
    private Long user_id;

    @Column(name = "nickname", nullable = false, unique = true)
    private String nickname;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "role", nullable = false)
    private Role user_role;

    @Column(name = "level")
    private int level;

    @Column(name = "current_lesson")
    private int current_lesson;

    public User(Long user_id, String nickname, String name, String surname, String password, String email, Role user_role, int level, String current_lesson) {
        this.user_id = user_id;
        this.nickname = nickname;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.user_role = Role.STUDENT;
        this.level = 0;
        this.current_lesson = 0;
    }
}
