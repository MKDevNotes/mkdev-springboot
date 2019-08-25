package com.dn.jpa.relationship.otm.repository;

import com.dn.jpa.relationship.otm.model.DnEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DnEmployeeRepository extends JpaRepository<DnEmployee,Long> {

}
