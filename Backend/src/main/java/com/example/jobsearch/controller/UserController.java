package com.example.jobsearch.controller;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    // Endpoints for user login, registration, etc.
}
