package com.datajpastudy.jpahibernatestudy.course;

import jakarta.persistence.*;

import java.util.List;

//bean mapping
@Entity
public class Course {
    //anotação id seleciona a primary key da tabela
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private long id;
    private String name;
    private String author;
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk", referencedColumnName = "id")

    private List<Product> products;

    public Course() {

    }

    public Course(Long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name='" + name + '\'' + ", author='" + author + '\'' + '}';
    }
}
