package tn.exam.services;

import tn.exam.entities.Project;
import tn.exam.entities.User;

public interface ExamService {

    public void addUser(User user);
    public Project addProject (Project project);
}
