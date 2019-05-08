package test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.stackroute.pe5.*;
import static org.junit.Assert.assertEquals;
import java.util.*;
import java.lang.*;
import java.io.*;

public class FrequencyMoreThanTwoTestGivenStringMap {
        FrequencyMoreThanTwo frequencyMoreThanTwo=new FrequencyMoreThanTwo();
        @Before
        public void setup() {
            /* EvenNumTest en=new EvenNumTest();*/
            // This methods runs, before running any one of the test case
            // This method is used to initialize the required variables

        }

        @After
        public void teardown() {
            // This method runs, after running all the test cases
            // This method is used to clear the initialized variables
            /* en=null;*/
        }

        @Test
        public void testgetCount() {
            String[] words={"a","b","c","d","a","c","c"};
            Map<String,Boolean> letterMap=new TreeMap<>();
            letterMap.put("a",true);
            letterMap.put("b",false);
            letterMap.put("c",true);
            letterMap.put("d",false);
            assertEquals("Refactor",letterMap,frequencyMoreThanTwo.getCount(words));
        }
    }

