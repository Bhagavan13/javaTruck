/*
 *Concatination programm
 *author bhagavan
*/

import java.util.*;

public class ConcatPro
   {
       public static void main(String args[])
       {
         String s1,s2;
         char c;
         int count=0;
         Scanner in = new Scanner(System.in);
	 System.out.println("Enter the string");
         s1=in.next();
         //System.out.println("Enter the character");
         //s2=in.next();
         System.out.println("Enter the character");
         c=in.next().charAt(0);
         char ch[]=s1.toCharArray();
         //System.out.println("After concatination is"+s1.concat(s2));
	 for(int i=0;i<ch.length-1;i++)
            {
              if(s1.charAt(i)==c)
                {
                   count++;
                }

            }
         System.out.println("The no.of times the character repeated in the string is \n"+count);
       
       }
   
   } 

