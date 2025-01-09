package com.eam26.JobApplication.job.service;

import com.eam26.JobApplication.job.model.Job;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImp implements JobService{

    private List<Job> jobs = new ArrayList<>();
    private Long id = 0L;

    @Override
    public List<Job> findAll() {
        System.out.println("Normal running.");
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(id++);
        jobs.add(job);
    }

    @Override
    public Job findById(Long id) {
        int idInt = id.intValue();
        return jobs.get(idInt);
    }
}
