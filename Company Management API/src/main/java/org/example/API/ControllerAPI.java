package org.example.API;

import jakarta.validation.Valid;
import org.example.DTO.CompanyDTO;
import org.example.Services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/")
public class ControllerAPI {

    @Autowired
    private CompanyDTO companyDTO;

    @Autowired
    private CompanyService companyService;

    @GetMapping(value = "/company/{id}")
    public ResponseEntity<List<CompanyDTO>> getData(@Valid @PathVariable Integer id)
    {
        List<CompanyDTO> data = companyService.getData(id);

        return new ResponseEntity<>(data, HttpStatus.OK);
    }

}
