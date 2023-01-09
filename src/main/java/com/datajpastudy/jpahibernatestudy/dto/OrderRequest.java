package com.datajpastudy.jpahibernatestudy.dto;


import com.datajpastudy.jpahibernatestudy.course.Course;
import com.datajpastudy.jpahibernatestudy.course.CourseSpringDataJpaRepository;
import com.datajpastudy.jpahibernatestudy.course.ProductSpringDataJpaRepository;
import org.springframework.web.bind.annotation.RequestBody;


public class OrderRequest {
    private Course course;

    public OrderRequest(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "course=" + course +
                '}';
    }
}
