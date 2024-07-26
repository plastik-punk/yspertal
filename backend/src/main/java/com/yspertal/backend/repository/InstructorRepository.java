package com.yspertal.backend.repository;

import com.yspertal.backend.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
    Instructor findByFirstNameAndLastName(String firstName, String lastName);

    Instructor findByLastName(String lastName);
}
