package org.example;

import org.example.model.Movie;
import org.example.model.Director;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Director.class)
                .addAnnotatedClass(Movie.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            // У режиссера с id = 1 создаем новый фильм
//            Director director = session.get(Director.class, 1);
//            Movie movie = new Movie(director, "Battle", 2022);
//            director.getMovieList().add(movie);
//            session.save(movie);

            // Получаем из списка фильм и у него выводим режиссера
//            Movie movie = session.get(Movie.class, 12);
//            System.out.println(movie.getDirector());

            // Создаем режиссера и создаем у него новый фильм
//            Director director = new Director("Бандерчук", 51);
//            Movie movie = new Movie(director, "Вторжение", 2019);
//            director.setMovieList(new ArrayList<Movie>(Collections.singletonList(movie)));
//            session.save(director);
//            session.save(movie);

            // Режиссера с id = 4 удалить из списка
//            Director director = session.get(Director.class, 4);
//            List<Movie> movie = director.getMovieList();
//            for (Movie list : movie) {
//                list.setDirector(null);
//            }
//            session.remove(director);

            // Фильму назначаем нового директора
//            Movie movie = session.get(Movie.class, 1);
//            Director director = session.get(Director.class, 7);
//            movie.setDirector(director);

            // У директора с id = 1 выводим список фильмов
//          Director director = session.get(Director.class, 1);
//            List<Movie> list = director.getMovieList() ;
//            for(Movie movie : list) {
//                System.out.println(movie.toString());
//            }

            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}