package org.example.model;

import javax.persistence.*;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Entity
@Table(name = "Director")
public class Director {

    @Id
    @Column(name = "director_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int director_id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @OneToMany(mappedBy = "director")
    List<Movie> movieList;

    public Director() {}

    public Director(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public int getDirector_id() {
        return director_id;
    }

    public void setDirector_id(int id) {
        this.director_id = director_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "director_id=" + director_id + ", name='" + name + ", age=" + age;
    }
}