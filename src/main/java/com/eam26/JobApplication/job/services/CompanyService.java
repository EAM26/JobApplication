package com.eam26.JobApplication.job.services;

import com.eam26.JobApplication.job.models.Company;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();
    Company findById(Long id);
    void createCompany(Company company);
    boolean updateCompany(Long id, Company company);
    boolean deleteCompany(Long id);
}
