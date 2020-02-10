package com.vz.uhh.controller;

import com.vz.uhh.model.Members;
import com.vz.uhh.repository.UHHRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Member;
import java.util.List;

import static org.springframework.http.HttpMethod.GET;

@RestController
@RequestMapping("/api/v1")
public class testController {

    @Autowired
    private UHHRepository uhhRepository;

    @GetMapping("/hi")
    public String getEmployeeById() {
        return "HI";
    }

    @GetMapping("/members")
    public Members getMember(){
        return new Members("Srinivas", "Mamidi", "Srinukv33@gmail.com");
    }

    @GetMapping("/membersList")
    public List<Members> getAllEmployees() {
        return uhhRepository.findAll();
    }

    @PostMapping("/createmember")
    public Members createEmployee(@Valid @RequestBody Members employee) {
        return uhhRepository.save(employee);
    }

}
