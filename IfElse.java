    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class IfElse {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            if((n>=1)||(n<=100))
            {
                if(n%2==1)
                {
                    System.out.println("Weird");
                }
                else
                {
                    if((n%2==0)&&((n>=2&&n<=5)||n>20))
                    {
                         System.out.println("Not Weird");
                    }
                     else if((n%2==0)&&(n>=6&&n<=20))
                     {
                         System.out.println("Weird");
                     }
                } 
            }
        }
    }
