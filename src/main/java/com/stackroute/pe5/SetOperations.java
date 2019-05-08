package com.stackroute.pe5;

import java.util.*;

public class SetOperations {
    public void sortGiven(String inputString){
        Set<String> words=new TreeSet<>();
        String[] wordList=inputString.split("\\s");
        for (String word:wordList)
        words.add(word);
        System.out.println("Sorted Set is : "+words);
        List<String> list = new ArrayList<String>(words);
        System.out.println("Sorted list is : "+list);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputString=sc.nextLine();
        SetOperations setOperations=new SetOperations();
        setOperations.sortGiven(inputString);
    }
}
