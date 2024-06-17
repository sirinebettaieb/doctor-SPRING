package com.example.doctor.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")

public class DoctorController {
    @GetMapping("/doctor/1")
    public String doctor1() {
        return "william hartnell";
    }
    @GetMapping("/doctor/10")
    public String doctor10() {
        return "David Tennant";
    }
    @GetMapping("/doctor/13")
    public String doctor13() {
        return "Jodie Whittaker";
    }
}
