package ru.netology.FilmManager;

import ru.netology.domain.FilmData;
    public class FilmManager {

        private FilmData[] films = new FilmData[0];
        private FilmData[] filmsReverseAdd = new FilmData[0];
        private int limit;

        public FilmManager() {
            limit = 10;
        }

        public FilmManager(int limit) {
            this.limit = limit;
        }

        public FilmData[] getFilms() {
            return films;
        }

        public void setFilms(FilmData[] films) {
            this.films = films;
        }

        public FilmData[] getFilmsReverseAdd() {
            return  filmsReverseAdd;
        }

        public void setFilmsReverseAdd(FilmData[] moviesReverseAdd) {
            this.filmsReverseAdd = moviesReverseAdd;
        }


        public void add (FilmData movie) {
            FilmData[] tmp = new FilmData[films.length + 1];
            for (int i = 0; i < films.length; i++) {
                tmp[i] = films[i];
            }
            tmp[tmp.length - 1] = movie;
            films = tmp;
        }


        public void findAll() {
            getFilms();
        }


        public void findLast() {
            int resultLength;
            if (films.length < limit) {
                resultLength = films.length;
            } else {
                resultLength = limit;
            }
            FilmData[] tmp = new FilmData[resultLength];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = films[films.length - 1- i];
            }
            filmsReverseAdd = tmp;
        }

    }
