package tn.exam.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String title;
private String String;
@OneToMany(mappedBy = "project",cascade = CascadeType.PERSIST)
        //don't put @jsonignore cuz we used cascade
    List<Sprint> sprints;
@ManyToMany(mappedBy ="projects")
    List<User> users;

}
