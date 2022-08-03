package com.electricity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grievance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long grievanceId;
    String grievance;

    public Long getGrievanceId() {
        return grievanceId;
    }

    public void setGrievanceId(Long grievanceId) {
        this.grievanceId = grievanceId;
    }

    public String getGrievance() {
        return grievance;
    }

    public void setGrievance(String grievance) {
        this.grievance = grievance;
    }

    @Override
    public String toString() {
        return "Grievance{" +
                "grievanceId=" + grievanceId +
                ", grievance='" + grievance + '\'' +
                '}';
    }
}
