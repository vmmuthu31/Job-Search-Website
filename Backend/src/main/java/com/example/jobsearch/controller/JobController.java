package com.example.jobsearch.controller;

@RestController
@RequestMapping("/api")
public class JobController {
    @Autowired
    private JobService jobService;

    // Endpoints for posting jobs, getting jobs, etc.
}
