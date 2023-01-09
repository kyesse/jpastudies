package com.datajpastudy.jpahibernatestudy.controller;

import com.datajpastudy.jpahibernatestudy.course.Course;
import com.datajpastudy.jpahibernatestudy.course.CourseSpringDataJpaRepository;
import com.datajpastudy.jpahibernatestudy.course.ProductSpringDataJpaRepository;
import com.datajpastudy.jpahibernatestudy.dto.OrderRequest;
import com.datajpastudy.jpahibernatestudy.dto.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    CourseSpringDataJpaRepository courseSpringDataJpaRepository;
    ProductSpringDataJpaRepository productSpringDataJpaRepository;

    @Autowired
    public OrderController(CourseSpringDataJpaRepository courseSpringDataJpaRepository) {
        this.courseSpringDataJpaRepository = courseSpringDataJpaRepository;
    }

    public OrderController(ProductSpringDataJpaRepository productSpringDataJpaRepository) {
        this.productSpringDataJpaRepository = productSpringDataJpaRepository;
    }

    @PostMapping("/placeOrder")
    public Course placeOrder(@RequestBody OrderRequest request) {
        return courseSpringDataJpaRepository.save(request.getCourse());
    }
     @GetMapping("/findAllProducts")
    public List<Course> findAllOrders(){
        return courseSpringDataJpaRepository.findAll();
    }

    @GetMapping("/getinfo")
    public List<OrderResponse> getJointInformation(){
        return courseSpringDataJpaRepository.getJointInformation();
    }
}
