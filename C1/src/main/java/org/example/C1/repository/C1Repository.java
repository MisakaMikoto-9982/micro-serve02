package org.example.C1.repository;

import org.example.C1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface C1Repository extends JpaRepository <Student, String> {
}