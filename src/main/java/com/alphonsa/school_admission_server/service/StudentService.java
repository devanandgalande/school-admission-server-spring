package com.alphonsa.school_admission_server.service;

import com.alphonsa.school_admission_server.model.RequestDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {

    ResponseEntity<List<RequestDTO>> getAllStudentData();

    ResponseEntity<RequestDTO> persistStudentData(RequestDTO requestDTO);
}
