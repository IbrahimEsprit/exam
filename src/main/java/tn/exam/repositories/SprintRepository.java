package tn.exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.exam.entities.Sprint;

public interface SprintRepository extends JpaRepository<Sprint,Integer> {

}
