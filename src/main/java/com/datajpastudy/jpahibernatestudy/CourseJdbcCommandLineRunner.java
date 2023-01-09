package com.datajpastudy.jpahibernatestudy;

import com.datajpastudy.jpahibernatestudy.course.Course;
import com.datajpastudy.jpahibernatestudy.course.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    //  private CourseJdbcRepository repository;

    //   @Autowired
    //  CourseJdbcCommandLineRunner(CourseJdbcRepository repository){
    //    this.repository=repository;
    // }
    private CourseSpringDataJpaRepository repository;

    @Autowired
    CourseJdbcCommandLineRunner(CourseSpringDataJpaRepository repository) {
        this.repository = repository;
    }

    /*
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1L, "Fellowship of the ring", "Tolkien"));
        repository.insert(new Course(2L, "Two Towers", "Tolkien"));
        repository.insert(new Course(3L, "Return of the king", "Tolkien"));

        repository.deleteById(1l);
        repository.findById(3l);

    } */

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1L, "Fellowship of the ring", "Tolkien"));
        repository.save(new Course(2L, "Two Towers", "Tolkien"));
        repository.save(new Course(3L, "Return of the king", "Tolkien"));

        repository.deleteById(1l);
        repository.findById(3l);

    }

    public void findById(long id) {

    }
}
