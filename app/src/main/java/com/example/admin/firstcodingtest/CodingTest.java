package com.example.admin.firstcodingtest;

/**
 * Created by Luis Aguirre on 8/29/2017.
 *
 */

public class CodingTest {
    public static void main(String[] args) {
        System.out.println("========== First algorithm ==========");
        divisible();
        System.out.println("========== Second algorithm ==========");
        duplicatedStrings();

    }

    private static void divisible(){
        boolean divisibleBy3 = false;
        boolean divisibleBy5 = false;
        for (int i=1; i<=20;i++) {

            if (i % 3 == 0) {
                divisibleBy3 = true;
            }
            if (i % 5 == 0) {
                divisibleBy5 = true;
            }

            if (!divisibleBy3 && !divisibleBy5)
                System.out.println(i);
            else {
                if (divisibleBy3 && divisibleBy5) {
                    printFizzBuss("FizzBuzz");
                } else {
                    if (divisibleBy3) {
                        printFizzBuss("Fizz");
                    } else //if (divisibleBy5 == true) {
                        printFizzBuss("Buzz");
                    //}
                }
            }
            divisibleBy3 = false;
            divisibleBy5 = false;

        }
    }

    private static void printFizzBuss(String word){
        System.out.println(word);
    }

    private static void duplicatedStrings(){
        java.util.ArrayList<String> stringArrayList = new java.util.ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("B");
        stringArrayList.add("E");
        stringArrayList.add("E");

        java.util.Map<String, Integer> letters = new java.util.HashMap<>();

        for (String letter : stringArrayList) {
            if(letters.containsKey(letter)) {
                letters.put(letter, (letters.get(letter) + 1));
            }
            else {
                letters.put(letter, 1);
            }
        }

        for(String key: letters.keySet())
            if (letters.get(key) > 1) {
                System.out.println(key);
            }
    }
}
