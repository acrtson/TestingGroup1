package com.jalasoft.selenium;

class Rental {

    private final Movie movie;

    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public double calculateCharge() {
        return movie.calculateCharge(daysRented);
    }

    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }

    public Movie getMovie() {
        return movie;
    }
}