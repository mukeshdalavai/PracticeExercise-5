package com.stackroute.pe5;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindCounts {
    public Map<String, Integer> getCount(){
        int oneCount=0,twoCount=0,threeCount=0;
        String inputString;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input String: ");
        inputString=sc.nextLine();
        Map<String, Integer> freq =new TreeMap<>();
        Pattern one=Pattern.compile("one");
        Pattern two=Pattern.compile("two");
        Pattern three=Pattern.compile("three");
        Matcher oneMatch=one.matcher(inputString);
        Matcher twoMatch=two.matcher(inputString);
        Matcher threeMatch=three.matcher(inputString);
        while (oneMatch.find())
            oneCount++;
        while (twoMatch.find())
            twoCount++;
        while (threeMatch.find())
            threeCount++;
        freq.put("one",oneCount);
        freq.put("two",twoCount);
        freq.put("three",threeCount);
        return freq;
    }
    public static void main(String[] args){
        FindCounts findCounts=new FindCounts();
        Map<String,Integer> freq=findCounts.getCount();
        System.out.println(freq);
    }
}
