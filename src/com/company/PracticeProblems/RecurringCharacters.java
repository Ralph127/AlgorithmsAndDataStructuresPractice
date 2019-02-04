package com.company.PracticeProblems;


import java.util.Hashtable;

public class RecurringCharacters {

    public static void main(String[] args) {
        String ee = "ADBBA";

        Character answer = sort(ee);

        System.out.println(answer);
    }

    // heard that a hashset would be a better implementation because of not allowing identical objects
    public static Character sort(String array) {
        Hashtable<Character, Integer> count = new Hashtable<>();

        for(char ch : array.toCharArray()) {
            if(count.containsKey(ch)) {
                return ch;
            }
            else{
                count.put(ch, 1);
            }
        }
        return null;
    }

}
