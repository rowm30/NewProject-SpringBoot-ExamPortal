package com.exam.model.exam;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "catagory")
public class Catagory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cid;

    private String title;

    private String description;

    public Catagory(){

    }

    public Catagory(String title, String description){
        this.title = title;
        this.description =description;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public Set<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(Set<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(mappedBy = "catagory",fetch =FetchType.EAGER,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Quiz> quizzes = new LinkedHashSet<>();
}
