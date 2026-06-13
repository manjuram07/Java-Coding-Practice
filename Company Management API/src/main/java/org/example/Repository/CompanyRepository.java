package org.example.Repository;

import org.example.DTO.CompanyDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyDTO, Integer> {



}
