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
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int id;
private String email;
private String pwd;
private String fname;
private String lname;

@Enumerated(EnumType.STRING)
public Role role;
@ManyToMany
    List<Project> projects;
@OneToMany
    List<Project> projectlist;

}
