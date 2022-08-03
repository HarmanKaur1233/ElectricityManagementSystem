package com.electricity.controller;

import com.electricity.model.Grievance;
import com.electricity.service.GrievanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GrievanceController {

    @Autowired
    GrievanceService grievanceService;

    @PostMapping("/complaint")
    public ResponseEntity<?> grievanceApi(@RequestBody Map<String, String> requestPayload) {
        Grievance grievance = new Grievance();
        if (requestPayload.get("grievance") != null) {
            grievance.setGrievance(requestPayload.get("grievance"));
        }

        return ResponseEntity.ok(this.grievanceService.saveComplaint(grievance));
    }
}
