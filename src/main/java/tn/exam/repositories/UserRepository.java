package tn.exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.exam.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
