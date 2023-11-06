package com.example.jobsearch.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role; // "recruiter" or "student"

    @OneToMany(mappedBy = "postedBy", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Job> jobs = new HashSet<>();

    // Constructors, getters, and setters
    // Standard constructors, getters, and setters are omitted for brevity
}
