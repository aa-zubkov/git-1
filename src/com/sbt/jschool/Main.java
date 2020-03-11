package com.sbt.jschool;

public class Main {
    public static void main(String[] args) {

//region Firs homework
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
//endregion

//region second homework
        String str = "Constructor ok \n" +
                "Check sysytem support\n" +
                "Check sysytem support ok\n" +
                "new memory for mRegData\n" +
                "call GetCdRomRegistryInfo\n" +
                "Check sysytem support\n" +
                "Check sysytem support ok\n" +
                "call GetGuidRegistryInfo(CdRomClassGuid)\n" +
                "Check sysytem support\n" +
                "Check sysytem support ok\n" +
                "call LoadTxModeSetting\n" +
                "Deconstructor ok \n" +
                "Deconstructor ok ";

        WorkWithCollections workWithCollections = new WorkWithCollections(str);

        // 1
        System.out.println("Unique words in text " + workWithCollections.uniqueWordsCount() + "\n");
        // 2
        workWithCollections.compareWords();

        // 3
        workWithCollections.wordsCount();

        // 4-5
        workWithCollections.reversStrings();

        //6
        workWithCollections.printLine(8);

//endregion
    }
}
