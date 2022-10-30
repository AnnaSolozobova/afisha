package ru.netology.domain;

public class MoviesManager {
    private int limitMovies = 10;//вего 10
    private Movies[] moviesList = new Movies[0];//массив

    public MoviesManager() {// менеджер кинох
    }

    public MoviesManager(int limitMovies) {
        this.limitMovies = limitMovies;
    }

    public Movies[] getMoviesList() {//дай
        return moviesList;
    }

    public void setMoviesList(Movies[] moviesList) {
        this.moviesList = moviesList;
    }

    public int getLimitMovies() {//конструктор пустой
        return limitMovies;
    }

    public void setLimitMovies(int limitMovies) {
        this.limitMovies = limitMovies;
    }

    public void addMovie(Movies movieAdd) { // Добавляем. lenght длина
        int lenght = moviesList.length + 1;
        Movies[] tmp = new Movies[lenght];
        //скопировать элементы из одного массива в другой:
        System.arraycopy(moviesList, 0, tmp, 0, moviesList.length);
        int addFilm = tmp.length - 1;
        tmp[addFilm] = movieAdd;
        moviesList = tmp;
    }

    public Movies[] findLast() { // вывод в обратном от добавления порядке
        int resultLenght;
        if (moviesList.length <= limitMovies) {
            resultLenght = moviesList.length;
        } else {
            resultLenght = limitMovies;
        }
        Movies[] result = new Movies[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            int index = moviesList.length - i - 1;
            result[i] = moviesList[index];
        }
        return result;
    }

    public Movies[] findAll() {//Вывод всех фильмов в порядке добавления (findAll)
        Movies[] result = new Movies[moviesList.length];
        //скопировать элементы из одного массива в другой:
        System.arraycopy(moviesList, 0, result, 0, result.length);
        return result;
    }
}
