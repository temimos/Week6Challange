
package com.example.demo;

import com.example.demo.Project;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 4)
    private String name;


    @NotNull
    private String priority;

    @NotNull
    @Size(min = 2)
    private String status;

    @NotNull
    @Size(min = 2)
    private String description;

    @NotNull
    @Size(min = 2)
    private String who_sub;

    @NotNull
    @Size(min = 2)
    private String assigned;


    @NotNull
    @Size(min = 2)
    private String steps;






    @OneToMany(mappedBy = "issue",
            fetch = FetchType.EAGER,
            orphanRemoval = true)
    public Set<Project> project;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWho_sub() {
        return who_sub;
    }

    public void setWho_sub(String who_sub) {
        this.who_sub = who_sub;
    }

    public String getAssigned() {
        return assigned;
    }

    public void setAssigned(String assigned) {
        this.assigned = assigned;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public Set<Project> getProject() {
        return project;
    }

    public void setProject(Set<Project> project) {
        this.project = project;
    }
}