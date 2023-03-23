package tn.exam.Controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.exam.entities.Project;
import tn.exam.entities.User;
import tn.exam.services.ExamService;

@RestController
@RequiredArgsConstructor
public class examcontroller {
private final ExamService examService;

@PostMapping("user/adduser/")
public void addUser(@RequestBody User user) {
 examService.addUser(user);
}
@PostMapping("project/addproject")
public Project addProject(@RequestBody Project project) {
    return examService.addProject(project);
}



}
