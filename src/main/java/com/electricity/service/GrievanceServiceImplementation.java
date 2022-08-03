package com.electricity.service;

import com.electricity.model.Grievance;
import com.electricity.repo.GrievanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GrievanceServiceImplementation implements GrievanceService{

    @Autowired
    GrievanceRepo grievanceRepo;

    @Override
    public Map<String, Object> saveComplaint(Grievance grievance) {
        Map<String, Object> hashMap = new HashMap();
        try {
            Grievance grievance1 = this.grievanceRepo.save(grievance);
            hashMap.put("Status", "Success");
            hashMap.put("Response", grievance1);
        } catch (Exception exception) {
            hashMap.put("Status", "Failed");

        }
        return hashMap;
    }
}
