package com.electricity.service;

import com.electricity.model.Grievance;

import java.util.Map;

public interface GrievanceService {
    public Map<String, Object> saveComplaint(Grievance grievance);
}
