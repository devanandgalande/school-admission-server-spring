package com.alphonsa.school_admission_server.controller;

import com.alphonsa.school_admission_server.model.RequestDTO;
import com.alphonsa.school_admission_server.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/hello")
public class MainController {
    private final StudentService service;

    @Autowired
    public MainController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("{\"message\": \"Hello\" }");
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<RequestDTO>> getAllData() {
        return service.getAllStudentData();
    }

    @PostMapping("/add")
    public ResponseEntity<RequestDTO> postStudentData(@RequestBody RequestDTO requestDTO) {
        return service.persistStudentData(requestDTO);
    }
}
