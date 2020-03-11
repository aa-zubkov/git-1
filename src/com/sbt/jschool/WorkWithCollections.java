package com.sbt.jschool;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WorkWithCollections {

    private HashMap<String, Integer> wordsMap = new HashMap<>();
    private ArrayList<String> stringsList = new ArrayList<>();

    public WorkWithCollections(String str)
    {
        String lines[] = str.split("\\r?\\n");

        for (String line : lines)
        {
            stringsList.add(line);
            String[] words = line.split(("\\W"));
            for (String word : words) {
                if (word.isEmpty() || word == null)
                    continue;

                if (wordsMap.containsKey(word)) {
                    wordsMap.put(word, wordsMap.get(word) + 1);
                } else {
                    wordsMap.put(word, 1);
                }
            }
        }
    }

    public WorkWithCollections(FileReader file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(file);

        String line;
        while (( line = bufferedReader.readLine()) != null) {
            stringsList.add(line);
            String[] words = line.split(("\\W"));
            for (String word : words) {
                if (word.isEmpty() || word == null)
                    continue;

                if (wordsMap.containsKey(word)) {
                    wordsMap.put(word, wordsMap.get(word) + 1);
                } else {
                    wordsMap.put(word, 1);
                }
            }
        }
    }

    // Task 1
    public int uniqueWordsCount()
    {
        return wordsMap.size();
    }

    // Task 2
    public void compareWords()
    {
        ArrayList<String> words = new ArrayList<>();
        wordsMap.forEach((k,v) -> words.add(k));

        //Comparator<String> myComparator = Comparator.comparingInt(String::length);
        Comparator<String> myComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Collections.sort(words, myComparator);
        for(String word : words) {
            System.out.println(word);
        }
        System.out.println();

        Collections.sort(words);
        for(String word : words) {
            System.out.println(word);
        }
        System.out.println();
    }

    // Task 3
    public void wordsCount()
    {
        wordsMap.forEach((k,v) -> System.out.println("word: "+k+" count:"+v));
        System.out.println();
    }

    // Task 4-5
    public void reversStrings()
    {
        ListIterator<String> listIter = stringsList.listIterator(stringsList.size());
        while (listIter.hasPrevious()) {
            String prev = listIter.previous();
            System.out.println(prev);
        }

        System.out.println();
    }

    // Task 6
    public void printLine(int n)
    {
        if (n > stringsList.size())
            return;

        System.out.println(stringsList.get(n-1));
        System.out.println();
    }
}
