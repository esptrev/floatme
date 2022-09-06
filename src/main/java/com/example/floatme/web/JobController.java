package com.example.floatme.web;
import com.example.floatme.data.*;
import com.example.floatme.data.JobRepository;
import com.example.floatme.data.PersonRepository;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "api/jobs", headers = "Accept=application/json")
public class JobController {
 private final JobRepository jobRepository;
 private final PersonRepository personRepository;

    public JobController(JobRepository jobRepository, PersonRepository personRepository) {
        this.jobRepository = jobRepository;
        this.personRepository = personRepository;
    }

    @PostMapping("create")
    public void createJob(@RequestBody Job newJob){
        newJob.setSalary(newJob.getSalary());
        newJob.setTitle(newJob.getTitle());
    }

}
