package tn.exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.exam.entities.Project;

import java.util.Date;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Integer> {
List<Project> findBySprintsDateAfter(Date date);

}
