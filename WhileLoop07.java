//https://www.geeksforgeeks.org/problems/while-loop-printtable-java/1

import java.util.*;



public class WhileLoop07
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int n = sc.nextInt();
        int ns = n;
         n = n * 10;
 System.out.println("  ************     ");

        while(n>0)
        {
            System.out.println(n);
            n = n-ns;
        }
    }
}