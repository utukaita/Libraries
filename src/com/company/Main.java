package com.company;

import java.util.SortedMap;

import static java.lang.Math.*;
import static ibio.Helpers.*;

public class Main {

    public static void main(String[] args) {
        // Homework 1
        for(int i = 0; i <= 10; i++){
            double a = i * PI * 0.2;
            System.out.println(a + ", " + Math.sin(a) + ", " + Math.cos(a));
        }
        // Homework 2
        boolean running = true;
        while(running){
            String operation = input("Give operation: ");
            if (operation.equalsIgnoreCase("end"))
                running = false;
            else{
                int a = Integer.parseInt(input("Give first integer operand: "));
                int b = Integer.parseInt(input("Give second integer operand: "));
                if(operation.equalsIgnoreCase("add"))
                    output(a+b);
                else if(operation.equalsIgnoreCase("sub"))
                    output(a-b);
                else
                    output("Unknown operation");
            }
        }
        // Homework 3
        String first = args[0];
        String second = args[1];
        int badge = 0;
        for(int i = 0; i < first.length(); i++){
            if (first.substring(i, second.length()+i).equalsIgnoreCase(second)){
                for (int j = badge; j < i; j++)
                    System.out.print(first.substring(j));
                System.out.println("");
                badge = second.length() + i+1;
            }


        }
    }
}
