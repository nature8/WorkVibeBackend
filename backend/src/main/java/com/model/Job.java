package com.model;

import jakarta.persistence.*;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String languages;
    private String requirements;
    private String experience;
    private String location;
    private String lastDateToApply;

    // Constructors
    public Job() {}

    public Job(String title, String languages, String requirements, String experience, String location, String lastDateToApply) {
        this.title = title;
        this.languages = languages;
        this.requirements = requirements;
        this.experience = experience;
        this.location = location;
        this.lastDateToApply = lastDateToApply;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getLanguages() { return languages; }
    public void setLanguages(String languages) { this.languages = languages; }

    public String getRequirements() { return requirements; }
    public void setRequirements(String requirements) { this.requirements = requirements; }

    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getLastDateToApply() { return lastDateToApply; }
    public void setLastDateToApply(String lastDateToApply) { this.lastDateToApply = lastDateToApply; }
}
