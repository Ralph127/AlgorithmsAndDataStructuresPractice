package com.company.PracticeProblems;

public class RemovingDashes {
// restructure a string to take out the dashes and then add the dashes to the correct areas
// S = string, K = dash location

    public static void main(String args[]) {
        String S = "fjg-eer-sas-f";
        int k = 3;
        System.out.println(createNewString(removeDashes(S), k));
    }

    public static String removeDashes(String s) {
        return s.replaceAll("-","");
    }

    public static String createNewString(String s, int k){
        String output = "";
        int i = 0;
        for(char ch : s.toCharArray()) {
            if(i == k) {
              output += "-";
              i = 0;
            } else {
                output += ch;
                i++;
            }
        }
        return output;
    }
}
