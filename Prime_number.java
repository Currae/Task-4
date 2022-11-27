/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package task4q1.prime_number;

import java.util.Scanner;

/**
 *
 * @author Magdaline
 */
public class Prime_number {
 public static boolean isPrime (int p) {

        int prime = 0;  
        for (p = 2; p < prime; p++) {
            if (prime % p == 0) {
                return false;
            }
            if (prime == p) {
                return true;
            }
        }  
        return false;
    }

    public static void main(String[] args) {
       int i,count;
               System.out.print("Enter n value : ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
               System.out.println("Prime numbers between 1 to "+n+" are ");
	for(int p=2;p<=n;p++)
	{
	count=0;
	for(i=1;i<=p;i++)
	{
	   if(p%i==0)
	   {
	        count++;        
	   }
	}
	if(count==2)
	       System.out.print(p+"  ");     
	}
	}
}
    
