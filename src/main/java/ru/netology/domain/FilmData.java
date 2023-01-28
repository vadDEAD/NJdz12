package ru.netology.domain;

public class FilmData {

    private int id;
    private String filmName;

    public FilmData() {
    }

    public FilmData(int id, String filmName) {
        this.id = id;
        this.filmName = filmName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return filmName;
    }

    public void setMovieName(String filmName) {
        this.filmName = filmName;
    }


}