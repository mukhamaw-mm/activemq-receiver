package com.mukham.activemq.receiver.repository;

import com.mukham.activemq.receiver.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Mu Kham Aw.
 * @Description this is to access database layer.
 */

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
