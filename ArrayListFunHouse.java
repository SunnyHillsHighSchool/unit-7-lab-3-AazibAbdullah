//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Aazib Abdullah

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
   // Declare an ArrayList
   ArrayList<Integer> factors = new ArrayList<Integer>();
  // Activate a for loop, set i to 2, and go up to the number before number, and add i.
  for (int i = 2; i < number; i++)
  {
    // If the remainder of i is 0, add that value to i.
    if (number % i == 0)
    {
      // add the value to i
      factors.add(i);
    }
  }
  // Return the ArrayList.
  return factors;
 }
 
 public static void keepOnlyCompositeNumbers(List<Integer> nums)
 {
   // Declare a variable and set the value to 0
   int n = 0;
   // Activate the for loop traversing nums from size -1 to 0.
   for (int i = nums.size()-1; i >= 0; i--)
   {
     // Initialize nums to nums.get(i).
     n = nums.get(i);
     // Create a new ArrayList called compositeFactors and set it to getListOfFactors with n inside of it
     ArrayList<Integer> compositeFactors = getListOfFactors(n);
     // If the ArrayList is empty, remove the i from the value.
     if (compositeFactors.size() == 0)
     {
       nums.remove(i);
     }
    }
  }
}