package com.stackroute.pe5;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FrequencyMoreThanTwo {
        public Map<String, Boolean> getCount(String[] words){
            String inputString="";
            for(String word:words)
                inputString+=word;
            Map<String, Boolean> freq =new TreeMap<>();
            for (String word:words) {
                int wordCount=0;
                Pattern pattern=Pattern.compile(word);
                Matcher matcher=pattern.matcher(inputString);
                while (matcher.find()){
                    wordCount++;
                }
                if(wordCount>=2)
                    freq.put(word,true);
                else
                    freq.put(word,false);
            }
            return freq;
        }

        /*public static void main(String[] args){
            FrequencyMoreThanTwo frequencyMoreThanTwo=new FrequencyMoreThanTwo();
            Map<String,Integer> freq=frequencyMoreThanTwo.getCount();
            System.out.println(freq);
        }*/
}

