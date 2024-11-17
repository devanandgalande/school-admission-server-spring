package com.alphonsa.school_admission_server.service;

import com.alphonsa.school_admission_server.dao.StudentData;
import com.alphonsa.school_admission_server.dao.StudentRepository;
import com.alphonsa.school_admission_server.model.RequestDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository repository;
    private final static String PREFIX = "N";

    @Autowired
    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<List<RequestDTO>> getAllStudentData() {
        List<StudentData> allStudentData = repository.findAll();
        List<RequestDTO> resposeList = allStudentData.stream().map(this::toRequestDTO).toList();
        return ResponseEntity.ok(resposeList);
    }

    @Override
    public ResponseEntity<RequestDTO> persistStudentData(RequestDTO requestDTO) {
        StudentData studentData = toStudentData(requestDTO);
        StudentData saved = repository.saveAndFlush(studentData);
        RequestDTO response = toRequestDTO(saved);
        return ResponseEntity.ok(response);
    }

    private RequestDTO toRequestDTO(StudentData studentData) {
        RequestDTO requestDTO = new RequestDTO();
        BeanUtils.copyProperties(studentData, requestDTO);
        requestDTO.setRegNo(PREFIX + String.format("%05d", studentData.getRegNo()));
        return requestDTO;
    }

    private StudentData toStudentData(RequestDTO requestDTO) {
        StudentData studentData = new StudentData();
        BeanUtils.copyProperties(requestDTO, studentData);
        return studentData;
    }
}
