package com.eam26.JobApplication.job.services;

//import com.eam26.JobApplication.job.dtos.JobDTO;
import com.eam26.JobApplication.job.models.Job;

import java.util.List;

public interface JobService {

    List<Job> findAll();
    void createJob(Job job);
    Job findById(Long id);
    boolean deleteJob(Long id);
    boolean updateJob(Long id, Job job);
}

