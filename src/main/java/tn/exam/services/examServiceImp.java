package tn.exam.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.exam.entities.Project;
import tn.exam.entities.Sprint;
import tn.exam.entities.User;
import tn.exam.repositories.ProjectRepository;
import tn.exam.repositories.SprintRepository;
import tn.exam.repositories.UserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class examServiceImp implements ExamService {
    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;
    private final SprintRepository sprintRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public Project addProject(Project project) {
        if (project.getSprints()!=null) {
            projectRepository.saveAndFlush(project);
            project.getSprints().forEach(sprint -> {
                sprint.setProject(project);
            });
        }
        return project;
    }

}
