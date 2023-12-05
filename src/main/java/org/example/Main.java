package org.example;
import models.Actor;
import models.Film;
import models.Person;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Person tomHanks = new Person("Tom", "Hanks");
        Person angelinajolie = new Person("Angelina", "Jolie");

        int wynagrodzenieTOma=tomHanks.calculateSalary(300000, 4);
        int wynagrodzenieAngeliny=tomHanks.calculateSalary(1200000, 6);
        System.out.println("Wynagordzenie Toma = " + wynagrodzenieTOma + " a wynagordznie Angeliny to "+ wynagrodzenieAngeliny);









        Film pulpfiction = new Film();
        pulpfiction.setTitle("pulp fiction");
        pulpfiction.setRating(33);
        pulpfiction.setCategory('B');
        pulpfiction.setBudget(66.5);

        Film topgun = new Film();
        topgun.setTitle("top gun");
        topgun.setRating(21);
        topgun.setCategory('B');
        topgun.setBudget(8.8888888888888888888);

        double budget = topgun.getBudget();
        System.out.println(budget + " to jest budżet z topgun");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz jak masz na imie");
        String imie = scanner.nextLine();

        if (imie.equals("Donald")) {
            System.out.println("Nic z tego");
            System.exit(1);
        } else if (imie.equals("Ziomek")) {
            System.out.println("Siema " + imie + " Dobrze że jesteś");
        }
        else
        {
           System.out.println("A tu coś innego " + imie);
        }

       // System.out.println("Witaj " + imie + " inny text");




        double budzetfilmupulpfiction;
        budzetfilmupulpfiction = pulpfiction.getBudget();

        System.out.println(budzetfilmupulpfiction);

        Actor tomCruse = new Actor("Tom", "Criuse", 15, false);
        Actor tomhanks = new Actor("Tom", "Hanks", 20, true);
        Actor jasfasola = new Actor("Jas", "Fasola", 100, false);
        Actor zenekzenek = new Actor("Zenek", "FasZenek", 1, false);
        Actor cezerypazura = new Actor("Cezary", "Pazura", 2, false);


        int rankingtopgun;
        int rankingpulpfiction;
        rankingtopgun = topgun.getRating();
        rankingpulpfiction = pulpfiction.getRating();

        if (rankingtopgun > 1) {
            System.out.println("Jest OK");
            System.out.println("bo tak");
        } else if (rankingtopgun > 20) {
            System.out.println("bo nie");
        }
        else {
            System.out.println("Słabo");
        }
        System.out.println("test");
        System.out.print("test1 \n");
        System.out.println("lalalalalalalallala" + "ouauauauauaua"
        );

        String text1 ="abc";
        String text2 =" def";
        System.out.println(text1 + text2);

    int wiek=45;
    int liczba=45;
        System.out.println(text1 +  wiek + " łopanie");

        System.out.println((wiek + liczba));


    }
}
