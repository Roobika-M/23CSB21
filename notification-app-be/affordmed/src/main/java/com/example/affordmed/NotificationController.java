package main.java.com.example.affordmed;

@RestController
@RequestMapping("/notifications")

public class NotificationController {
    private final NotificationRepo notifyRepo;
    public NotificationController(NotificationRepo notifyRepo){
        this.notifyRepo = notifyRepo;
    }

    @PostMapping
    public Notification addNotify(@RequestBody Notification notify){
        notifyRepo.save(notify);
    }

    @GetMapping
    public List<Notification> showNotify(){
        notifyRepo.findAll();
    }
}