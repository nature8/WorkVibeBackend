package com.controller;

import com.model.Job;
import com.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
@CrossOrigin(origins = "*")
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    // Save new job listing
    @PostMapping("/add")
    public Job addJob(@RequestBody Job job) {
        return jobRepository.save(job);
    }

    // Fetch all job listings
    @GetMapping
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id) {
        return jobRepository.findById(id)
                .map(job -> ResponseEntity.ok(job))
                .orElse(ResponseEntity.notFound().build());
    }

    // ✅ Add new job
    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobRepository.save(job);
    }

    // ✅ Update job
    @PutMapping("/{id}")
    public ResponseEntity<Job> updateJob(@PathVariable Long id, @RequestBody Job updatedJob) {
        return jobRepository.findById(id)
                .map(job -> {
                    job.setTitle(updatedJob.getTitle());
                    job.setLanguages(updatedJob.getLanguages());
                    job.setRequirements(updatedJob.getRequirements());
                    job.setExperience(updatedJob.getExperience());
                    job.setLocation(updatedJob.getLocation());
                    job.setLastDateToApply(updatedJob.getLastDateToApply());
                    return ResponseEntity.ok(jobRepository.save(job));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJob(@PathVariable Long id) {
        if (!jobRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        jobRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/location/{location}")
    public List<Job> getJobsByLocation(@PathVariable String location) {
        return jobRepository.findByLocationContainingIgnoreCase(location);
    }

    @GetMapping("/language/{language}")
    public List<Job> getJobsByLanguage(@PathVariable String language) {
        return jobRepository.findByLanguagesContainingIgnoreCase(language);
    }

    @GetMapping("/experience/{experience}")
    public List<Job> getJobsByExperience(@PathVariable String experience) {
        return jobRepository.findByExperience(experience);
    }

    @GetMapping("/search/{keyword}")
    public List<Job> searchJobs(@PathVariable String keyword) {
        return jobRepository.findByTitleContainingIgnoreCase(keyword);
    }
    
    
}

