package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a series of letters:");
        String userInput = input.next();
        int length1 = userInput.length();
        String output = "";
        ArrayList<String> letters = new ArrayList<>();
        int i;
        for (i = 0; i < length1; i++){
            String subStr = userInput.substring(i,i+1);
            letters.add(subStr);
        }
        //System.out.println(letters);
        //System.out.println(length1);
        int tally = 1;
        i = 0;
        int length2 = length1 - 1;
        while (i < length2){
            if (letters.get(i).equals(letters.get(i+1))){
                tally = tally + 1;
                letters.remove(i);
                length2 = length2 - 1;
                //System.out.println(letters);
            }
            else{
                String tally1 = Integer.toString(tally);
                letters.set(i,letters.get(i) + tally1);
                tally = 1;
                i+=1;
            }
        }
        String tally1 = Integer.toString(tally);
        letters.set(i,letters.get(i) + tally1);
        //System.out.println(letters);
        int length3 = letters.size();
        for (i = 0; i < length3; i++){
            output = output + letters.get(i);
        }
        int length4 = output.length();
        System.out.println(output);
        System.out.println("Original length: "+length1);
        System.out.println("New length: "+length3);
        int saved = length1-length4;
        System.out.println("You saved "+saved+" characters");
    }
}