package org.example.Services;

import org.example.DTO.CompanyDTO;

import java.util.List;

public interface CompanyService {

    public List<CompanyDTO> getData(Integer id);
}
