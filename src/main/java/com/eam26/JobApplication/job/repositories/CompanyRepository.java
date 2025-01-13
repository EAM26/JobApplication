package com.eam26.JobApplication.job.repositories;

import com.eam26.JobApplication.job.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
