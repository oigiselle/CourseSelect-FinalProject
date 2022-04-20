package com.ggslvdr.courseselect_finalproject.model;

public class Courses {
    private String name;
    private String code;
    private String description;
    private String professor;

    public Courses(String name, String code, String description, String professor) {
        this.name = name;
        this.code = code;
        this.description = description;
        this.professor = professor;
    }

    public Courses() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
