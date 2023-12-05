package models;

public class Person {
    private String firstname;
    private String lasttname;

    public Person(String angelina, String jolie) {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasttname() {
        return lasttname;
    }

    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }

    public int calculateSalary(int stawka, int iloscFilmow) {
        int rezultat = stawka * iloscFilmow;
        return rezultat;
    }

    public int giveBonus(int rating, int salary) {
        int rezultat2;

        if (rating < 11) {
            rezultat2 = salary * 2;
        } else {
            rezultat2 = salary;
        }
        return rezultat2;

    }
}
