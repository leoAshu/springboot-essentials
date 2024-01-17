package com.leo.ashu.restapi.lesson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leo.ashu.restapi.course.Course;

@RestController
public class LessonController {

    @Autowired
    private LessonService lessonService;
    
    @GetMapping("/topics/{topicId}/courses/{courseId}/lessons")
    public List<Lesson> getAllLessons(@PathVariable String courseId) {
        return lessonService.getAllLessons(courseId);
    }

    @GetMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
    public Lesson getLesson(@PathVariable String id) {
        return lessonService.getLesson(id);
    }

    @PostMapping("/topics/{topicId}/courses/{courseId}/lessons")
    public void addLesson(@PathVariable String topicId, @PathVariable String courseId, @RequestBody Lesson lesson) {
        Course course = new Course(courseId, "", "", topicId);
        lesson.setCourse(course);
        lessonService.addLesson(lesson);
    }
}
