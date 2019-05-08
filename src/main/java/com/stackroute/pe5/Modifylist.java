package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Modifylist {
    public ArrayList<String> modifyWords(ArrayList<String> list){
        if(list.contains("Apple"))
            list.set(list.indexOf("Apple"),"Kiwi");
        if(list.contains("Melon"))
            list.set(list.indexOf("Melon"),"Mango");
        return list;
    }
    public ArrayList<String> removeElements(ArrayList<String> list){
        list.clear();
        return list;
    }
    public static void main(String[] args){
       Modifylist modifylist=new Modifylist();
       ArrayList<String> list=new ArrayList<>();
       list.add("Apple");
       list.add("Grape");
       list.add("Melon");
       list.add("Berry");
       System.out.println("Input List: "+list);
       ArrayList<String> newList=modifylist.modifyWords(list);
       System.out.println("Output List: "+newList);
       System.out.println("ArrayList after removing all elements: "+modifylist.removeElements(list));
    }
}
