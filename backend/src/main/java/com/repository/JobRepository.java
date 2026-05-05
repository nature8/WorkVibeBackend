package com.repository;


import com.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
	List<Job> findByLocation(String location);
    List<Job> findByExperience(String experience);
    List<Job> findByTitle(String title);

    List<Job> findByLanguagesContainingIgnoreCase(String language);
    List<Job> findByTitleContainingIgnoreCase(String keyword);
    List<Job> findByLocationContainingIgnoreCase(String location);
}

