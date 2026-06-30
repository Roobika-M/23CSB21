package com.example.notify;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/notifications")

public class NotificationController {
    private final NotificationRepo notifyRepo;
    public NotificationController(NotificationRepo notifyRepo){
        this.notifyRepo = notifyRepo;
    }

    @PostMapping
    public Notification addNotify(@RequestBody Notification notify){
        return notifyRepo.save(notify);
    }

    @GetMapping
    public List<Notification> showNotify(){
        return notifyRepo.findAll();
    }
}