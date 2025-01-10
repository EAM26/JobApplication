package com.eam26.JobApplication.job.service;

import com.eam26.JobApplication.job.JobDTO;
import com.eam26.JobApplication.job.model.Job;

import java.util.List;

public interface JobService {

    List<Job> findAll();
    void createJob(Job job);
    Job findById(Long id);
    boolean deleteJob(Long id);
    boolean updateJob(Long id, JobDTO jobDTO);
}

