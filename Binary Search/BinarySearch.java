package searhing;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class BinarySearch {
    
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
        
        Collections.sort(numberList); //Sorted the list in ascending order
        
        int first, last, mid=0;
        first = 0;
        last = numberList.size()-1;
        
        //Searching Process 
        while(first<=last)
        {
            mid=(first+last)/2;
    
            if(find==numberList.get(mid))
            {
            count++;
            break;
            }
            else if(find>numberList.get(mid))
            {
                first=mid+1;
            } 
            else
            {
                last=mid-1;
            }
        }
        
        if(count==1)
        {
            System.out.printf("\nThe number has been found and its position is %d\n",mid+1);
        }
        else
        {
            System.out.printf("\nThe number has not been found\n");
        }
        
    }    
}
