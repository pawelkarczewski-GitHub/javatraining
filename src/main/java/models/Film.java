package models;

public class Film {
    //składniki klasy
    private String title; //text "opis"
    private int rating; // liczby całkowite -2 do +2 mld
     private char category; // jeden znak 'A'
    private double budget; //zmienno przecinkowe 55.1
    private boolean isMovePrized; // true , false
//pola
//konstruktory


        public Film(String title, int rating, long duzaliczba, char category, double budget, boolean isMovePrized) {
        this.title = title;
        this.rating = rating;
        this.category = category;
        this.budget = budget;
        this.isMovePrized = true;
       }

    public Film() {

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public boolean isMovePrized() {
        return isMovePrized;
    }

    public void setMovePrized(boolean movePrized) {
        isMovePrized = movePrized;
    }

    public Film(String title) {
        this.title = title;

        //metody
        //getter - jak uzywac pola
        //setter - jak ustawic wartosc pola


    }
}

