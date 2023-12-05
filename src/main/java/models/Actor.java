package models;

public class Actor {
     private String first_name;
     private String last_name;
     private int rating;
     private boolean isOscarproized;


    public Actor(String first_name, String last_name, int rating, boolean isOscarproized) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.rating = rating;
        this.isOscarproized = isOscarproized;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isOscarproized() {
        return isOscarproized;
    }

    public void setOscarproized(boolean oscarproized) {
        isOscarproized = oscarproized;
    }

    public Actor(){}

}

