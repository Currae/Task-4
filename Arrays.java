/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package task4q1.arrays;

/**
 *
 * @author Magdaline
 */
public class Arrays {

    public static void main(String[] args) {
         int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    int toFind = 3;
    boolean found = false;

    for (int n : num) {
      if (n == toFind) {
        found = true;
        break;
      }
    }
    
    if(found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " is not found.");
  }
    }
