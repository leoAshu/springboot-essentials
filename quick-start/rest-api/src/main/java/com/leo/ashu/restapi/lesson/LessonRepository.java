package com.leo.ashu.restapi.lesson;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, String> {

    public List<Lesson> findByCourseId(String courseId);
}
