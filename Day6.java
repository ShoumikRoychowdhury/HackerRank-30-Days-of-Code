package com.ThirtyDaysCode;
import java.io.*;
import java.util.*;

public class Day6 {
    String line = "";
    char[] charArray;

    public Day6(String line){
        this.line = line;
        charArray = line.toCharArray(); 
    }

    public String EvenHacker(){
        String output = "";
        for(int i = 0; i < charArray.length; i++){
            if(i%2==0){
                output = output + charArray[i];
            }
           
        }    
        return output;
    }

    public String OddHacker(){
        String output = "";
        for(int i = 0; i < charArray.length; i++){
            if(i%2!=0){
                output = output + charArray[i];
            }
           
        }    
        return output;
    }



public static void main(String[] args) {

           // File file = new File("stdin");
                Scanner scan = new Scanner(System.in);
                int T = scan.nextInt();
                scan.nextLine();
                for(int i = 0; i< T; i++){
                    String line = scan.nextLine();
                    Day6 solution1 = new Day6(line);
                    System.out.print(solution1.EvenHacker()+" ");
                    
                    System.out.print(solution1.OddHacker()+" ");
                    System.out.println();
                    
                }

    }
}
       