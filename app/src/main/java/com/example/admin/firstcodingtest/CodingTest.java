package com.example.admin.firstcodingtest;
import java.util.Hashtable;
import java.util.Set;
import java.util.Iterator;
/**
 * Created by Admin on 8/29/2017.
 */

public class CodingTest {
    public static void main(String[] args) {
        boolean divisibleby3 = false;
        boolean divisibleby5 = false;
        for (int i=1; i<=20;i++){

            if (i%3==0){
                divisibleby3 = true;
            }
            if (i%5==0){
                divisibleby5 = true;
            }

            if (divisibleby3 == false && divisibleby5 == false  )
                System.out.println(i);
            else{
                if (divisibleby3 == true && divisibleby5 == true){
                    printFizzBuss("FizzBuzz");
                }else{
                    if(divisibleby3==true){
                        printFizzBuss("Fizz");
                    }else if (divisibleby5==true){
                        printFizzBuss("Buzz");
                    }
                }
            }
            divisibleby3 = false;
            divisibleby5= false;




        }
        duplicatedStrings();

    }

    public static void printFizzBuss(String word){
        System.out.println(word);
    }

    public static void duplicatedStrings(){
        java.util.ArrayList<String> stringArrayList = new java.util.ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("B");
        stringArrayList.add("E");

        java.util.Hashtable hcounter = new java.util.Hashtable();
        String value = "";
        String str;


        for (int i = 0; i< stringArrayList.size();i++){
            value = stringArrayList.get(i);
            int result = (int) hcounter.get(value);


            if (hcounter.contains(value)){
                hcounter.put(value,  result + 1);
            }else{
                hcounter.put(value, 1);
            }
        }
        System.out.println("Here");
        Set<String> keys = hcounter.keySet();
        Iterator<String> itr = keys.iterator();

        while (itr.hasNext()) {
            str = itr.next();
            if ((int)hcounter.get(str) > 1){
                System.out.println(hcounter.get(str));
            }
        }




    }

}
