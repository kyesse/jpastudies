package com.datajpastudy.jpahibernatestudy.course;

import com.datajpastudy.jpahibernatestudy.dto.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

   @Query("SELECT new com.datajpastudy.jpahibernatestudy.dto.OrderResponse(c.name, p.productName) FROM Course ")
    public List<OrderResponse> getJointInformation();

}
