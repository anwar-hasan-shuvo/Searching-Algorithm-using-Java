package searching;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int count=0;
        
        ArrayList<Integer> numberList = new ArrayList<>(); //ArrayList has been used to store the number
        
        System.out.println("How many numbers do you want to add in the list?");
        int choice = scanner.nextInt();
        
        System.out.println("\nInsert the numbers ");
        for(int i=0;i<choice;i++)
        {
            int number = scanner.nextInt();
            numberList.add(number);
        }
        
        System.out.println("Enter a number to find in the list: ");
        int find = scanner.nextInt();
        
        for(int i=0;i<numberList.size();i++)
        {
            if(numberList.get(i) == find)
            {
                count++; //If the value is found, the value of count will be increased by 1.
                break;
            }
        }
        
        if(count == 1)
        {
            System.out.println("\nThe value has been found in the list");
        }
        else
        {
            System.out.println("\nThe value hasn't been found in the list");
        }
        
    }    
}
