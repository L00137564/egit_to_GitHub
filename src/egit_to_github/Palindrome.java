package egit_to_github;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import java.util.*;

public class Palindrome
{
   private static Scanner keyIn;

public static void main(String[]args)
   {
	  
      keyIn = new Scanner(System.in);
	  System.out.println("Please enter string for palindrome test: "); 
	  String str = keyIn.nextLine(); 
	   
      Stack<String> stack = new Stack<String>();
      Queue<String> queue = new LinkedList<String>();
   
      String s = new String();
      for (int i = 0; i < str.length( ); i++)
      {
         s = "" + str.charAt(i);
         System.out.print(s);
         queue.add(s);
         stack.push(s);
      }
      System.out.println();
      if (queue.remove().equals(stack.pop( )))
      {
         System.out.println(str + " IS A PALINDROME");
      }
      else
         System.out.println(str + " is NOT a PALINDROME");
      }
}