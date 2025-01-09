package com.eam26.JobApplication.job.controller;

import com.eam26.JobApplication.job.model.Job;
import com.eam26.JobApplication.job.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> findAll() {
        return jobService.findAll();
    }

    @GetMapping("/jobs/{id}")
    public Job findJobById(@PathVariable Long id){
        return jobService.findById(id);
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return "Job successfully added.";
    }




}
