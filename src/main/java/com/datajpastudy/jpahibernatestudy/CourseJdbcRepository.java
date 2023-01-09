package com.datajpastudy.jpahibernatestudy;

import com.datajpastudy.jpahibernatestudy.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    private JdbcTemplate springJdbcTemplate;

    @Autowired
    CourseJdbcRepository(JdbcTemplate springJdbcTemplate) {
        this.springJdbcTemplate = springJdbcTemplate;
    }

    private static String INSERT_QUERY =
            """
                    INSERT INTO COURSE (ID, NAME, AUTHOR)
                    VALUES(?, ?,?);
                    """;

    private static String DELETE_QUERY =
            """
                    delete from course
                    where id = ?
                     """;

    private static String SELECT_QUERY =
            """
                    SELECT * from course
                    where id = ?
                     """;


    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(Long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(Long id) {
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }
}
