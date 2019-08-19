package com.dn.jpa.relationship.example.repository;

import com.dn.jpa.relationship.example.model.EmployeeProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeProfileRepository extends JpaRepository<EmployeeProfile,Long> {
}
