package com.leo.ashu.restapi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
            new Topic("spring", "Spring Framework", " Spring Framework Description"),
            new Topic("springboot", "Spring Boot Framework", "Spring Boot Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javascript", "javaScript", "JavaScript Description")
        );
    }
}
