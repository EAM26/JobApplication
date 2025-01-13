package com.eam26.JobApplication.job.repositories;

import com.eam26.JobApplication.job.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
