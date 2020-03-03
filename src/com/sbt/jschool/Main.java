package com.sbt.jschool;

public class Main {
    public static void main(String[] args) {
        Person firstMan = new Person(true, "Nick");
        Person firstWoman = new Person(false, "Alice");
        Person secondMan = new Person(true, "Bob");;
        Person secondWoman = new Person(false, "Jennifer");

        System.out.println(firstMan.marry(secondMan));
        System.out.println(firstWoman.marry(secondWoman));

        System.out.println(firstMan.marry(firstWoman));
        System.out.println(secondMan.marry(secondWoman));

        System.out.println(firstMan.marry(secondWoman));
        System.out.println(secondMan.marry(firstWoman));
    }
}
