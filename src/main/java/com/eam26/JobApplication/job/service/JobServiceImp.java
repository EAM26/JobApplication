package com.eam26.JobApplication.job.service;

import com.eam26.JobApplication.job.JobDTO;
import com.eam26.JobApplication.job.model.Job;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class JobServiceImp implements JobService{

    private final List<Job> jobs = new ArrayList<>();
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
        for(Job job: jobs) {
            if(job.getId().equals(id)) {
                return job;
            }
        }
        return null;
    }

    @Override
    public boolean deleteJob(Long id) {
        Iterator<Job> iterator = jobs.iterator();
        while (iterator.hasNext()) {
            Job job = iterator.next();
            if(job.getId().equals(id)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateJob(Long id, JobDTO jobDTO) {
        for (Job job : jobs) {
            if (job.getId().equals(id)) {
                job.setTitle(jobDTO.getTitle());
                job.setDescription(job.getDescription());
                job.setMaxSalary(jobDTO.getMaxSalary());
                job.setMinSalary(jobDTO.getMinSalary());
                job.setLocation(jobDTO.getLocation());
                return true;
            }
        }
        return false;
    }

}
