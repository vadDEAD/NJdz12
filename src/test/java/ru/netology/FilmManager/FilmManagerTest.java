package ru.netology.FilmManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmData;

public class FilmManagerTest {

    FilmData movie1 = new FilmData(1, "Бладшот");
    FilmData movie2 = new FilmData(2, "Вперёд");
    FilmData movie3 = new FilmData(3, "Отель Белград");
    FilmData movie4 = new FilmData(4, "Джентельмены");
    FilmData movie5 = new FilmData(5, "Человек-невидимка");
    FilmData movie6 = new FilmData(6, "Тролли. Мировой тур");
    FilmData movie7 = new FilmData(7, "Номер один");
    FilmData movie8 = new FilmData(8, "Лучшее предложение");
    FilmData movie9 = new FilmData(9, "Семь");
    FilmData movie10 = new FilmData(10, "Зодиак");

    FilmData[] filmsTestList0 = new FilmData[0];
    FilmData[] filmsTestList1 = {
            movie1};
    FilmData[] filmsTestList2 = {
            movie1,
            movie2};
    FilmData[] filmsTestList3 = {
            movie1,
            movie2,
            movie3};
    FilmData[] filmsTestList4 = {
            movie1,
            movie2,
            movie3,
            movie4};
    FilmData[] filmsTestList5 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5};
    FilmData[] filmsTestList6 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5,
            movie6};
    FilmData[] filmsTestList7 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5,
            movie6,
            movie7};
    FilmData[] filmsTestList8 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5,
            movie6,
            movie7,
            movie8};
    FilmData[] filmsTestList9 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5,
            movie6,
            movie7,
            movie8,
            movie9};
    FilmData[] filmsTestList10 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5,
            movie6,
            movie7,
            movie8,
            movie9,
            movie10
    };

    FilmData[] filmsExpectedAdd1 = {
            movie1};
    FilmData[] filmsExpectedAdd2 = {
            movie1,
            movie2};
    FilmData[] filmsExpectedAdd6 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5,
            movie6,
    };
    FilmData[] filmsExpectedAdd8 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5,
            movie6,
            movie7,
            movie8

    };

    FilmData[] filmsExpectedFindAll0 = new FilmData[0];
    FilmData[] filmsExpectedFindAll1 = {
            movie1};
    FilmData[] filmsExpectedFindAll5 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5};
    FilmData[] filmsExpectedFindAll10 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5,
            movie6,
            movie7,
            movie8,
            movie9,
            movie10
    };

    FilmData[] filmsExpectedFindLast0DefaultCount = new FilmData[0];
    FilmData[] filmsExpectedFindLast1DefaultCount = {
            movie1};
    FilmData[] filmsExpectedFindLast5DefaultCount = {
            movie5,
            movie4,
            movie3,
            movie2,
            movie1};
    FilmData[] filmsExpectedFindLast10DefaultCount = {
            movie10,
            movie9,
            movie8,
            movie7,
            movie6,
            movie5,
            movie4,
            movie3,
            movie2,
            movie1
    };

    FilmData[] filmsExpectedFindLast10Count0 = new FilmData[0];

    FilmData[] filmsExpectedFindLast10Count5 = {
            movie10,
            movie9,
            movie8,
            movie7,
            movie6
    };
    FilmManager manager = new FilmManager();
    FilmManager managerCountNull = new FilmManager(0);
    FilmManager managerCount5 = new FilmManager(5);

    @Test
    void shouldAddNullMovies() {
        FilmData[] expected = filmsExpectedAdd1;
        manager.setFilms(filmsTestList0);
        manager.add(movie1);
        Assertions.assertArrayEquals(expected, manager.getFilms());
    }

    @Test
    void shouldAddOneFilms() {
        FilmData[] expected = filmsExpectedAdd2;
        manager.setFilms(filmsTestList1);
        manager.add(movie2);
        Assertions.assertArrayEquals(expected, manager.getFilms());
    }

    @Test
    void shouldAddFiveFilms() {
        FilmData[] expected = filmsExpectedAdd6;
        manager.setFilms(filmsTestList5);
        manager.add(movie6);
        Assertions.assertArrayEquals(expected, manager.getFilms());
    }

    @Test
    void shouldAddTenFilms() {
        FilmData[] expected = filmsExpectedAdd8;
        manager.setFilms(filmsTestList7);
        manager.add(movie8);
        Assertions.assertArrayEquals(expected, manager.getFilms());
    }

    @Test
    void shouldFindAllNullFilms() {
        FilmData[] expected = filmsExpectedFindAll0;
        manager.setFilms(filmsTestList0);
        manager.findAll();
        Assertions.assertArrayEquals(expected, manager.getFilms());
    }

    @Test
    void shouldFindAllOneFilms() {
        FilmData[] expected = filmsExpectedFindAll1;
        manager.setFilms(filmsTestList1);
        manager.findAll();
        Assertions.assertArrayEquals(expected, manager.getFilms());
    }

    @Test
    void shouldFindAllFiveFilms() {
        FilmData[] expected = filmsExpectedFindAll5;
        manager.setFilms(filmsTestList5);
        manager.findAll();
        Assertions.assertArrayEquals(expected, manager.getFilms());
    }

    @Test
    void shouldFindAllTenFilms() {
        FilmData[] expected = filmsExpectedFindAll10;
        manager.setFilms(filmsTestList10);
        manager.findAll();
        Assertions.assertArrayEquals(expected, manager.getFilms());
    }

    @Test
    void shouldFindLastNullFilmsDefaultCount() {
        FilmData[] expected = filmsExpectedFindLast0DefaultCount;
        manager.setFilms(filmsTestList0);
        manager.findLast();
        Assertions.assertArrayEquals(expected, manager.getFilmsReverseAdd());
    }

    @Test
    void shouldFindLastOneFilmsDefaultCount() {
        FilmData[] expected = filmsExpectedFindLast1DefaultCount;
        manager.setFilms(filmsTestList1);
        manager.findLast();
        Assertions.assertArrayEquals(expected, manager.getFilmsReverseAdd());
    }

    @Test
    void shouldFindLastFiveFilmsDefaultCount() {
        FilmData[] expected = filmsExpectedFindLast5DefaultCount;
        manager.setFilms(filmsTestList5);
        manager.findLast();
        Assertions.assertArrayEquals(expected, manager.getFilmsReverseAdd());
    }

    @Test
    void shouldFindLastTeFilmsDefaultCount() {

        FilmData[] expected = filmsExpectedFindLast10DefaultCount;
        manager.setFilms(filmsTestList10);
        manager.findLast();
        Assertions.assertArrayEquals(expected, manager.getFilmsReverseAdd());
    }

    @Test
    void shouldFindLastTenFilmsCountNull() {
        FilmData[] expected = filmsExpectedFindLast10Count0;
        managerCountNull.setFilms(filmsTestList10);
        managerCountNull.findLast();
        Assertions.assertArrayEquals(expected, managerCountNull.getFilmsReverseAdd());
    }

    @Test
    void shouldFindLastTenFilmsCount5() {
        FilmData[] expected = filmsExpectedFindLast10Count5;
        managerCount5.setFilms(filmsTestList10);
        managerCount5.findLast();
        Assertions.assertArrayEquals(expected, managerCount5.getFilmsReverseAdd());
    }

}