package org.example.Services;

import org.example.DTO.CompanyDTO;
import org.example.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public List<CompanyDTO> getData(Integer id) {

        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid company ID");
        }

        CompanyDTO companyDTO = companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Company not found with ID: " + id));

        return List.of(companyDTO);
    }
}
