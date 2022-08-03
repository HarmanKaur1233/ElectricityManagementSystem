package com.electricity.repo;

import com.electricity.model.Grievance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrievanceRepo extends JpaRepository<Grievance,Long> {
}
