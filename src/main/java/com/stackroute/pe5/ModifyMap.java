package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModifyMap {
        public Map<String, String> replaceMap(Map<String,String> inputMap) {
            if (inputMap.get("val1").isBlank() == false) {
                inputMap.replace("val2", inputMap.get("val1"));
                inputMap.replace("val1", "");
            }
            return inputMap;
        }

        public static void main(String[] args){
            ModifyMap modifyMap=new ModifyMap();
            Map<String,String> inputMap=new TreeMap<>();
            inputMap.put("val1","java");
            inputMap.put("val2","c++");
            System.out.println("Input:\t"+inputMap);
            System.out.println("Output:\t"+modifyMap.replaceMap(inputMap));
        }
}
