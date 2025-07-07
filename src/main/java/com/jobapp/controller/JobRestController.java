package com.jobapp.controller;


import com.jobapp.model.JobPost;
import com.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobRestController {

    @Autowired
    private JobService service;


    @GetMapping("/load")
    public String loadData() {
        service.load();
        return "success";
    }


    @GetMapping("/jobPosts")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("/jobpost/{postId}")
    public JobPost getJob(@PathVariable int postId){
        return service.getJob(postId);
    }

    @PostMapping("/jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());

    }

    @PutMapping("/jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("/jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){

        service.deleteJob(postId);
        return "deleted";
    }
}

