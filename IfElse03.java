// https://www.geeksforgeeks.org/problems/java-if-else-decision-making0924/0?category%255B%255D=Java&difficulty%255B%255D=-2&page=1&query=category%255B%255DJavadifficulty%255B%255D-2page1category%255B%255DJava

public class IfElse03
{

    public String checkData(int n,int m)
    {
        /*
        if(n>m)
        {
            System.out.println("Greater");
        }
        else if(n<m)
        {
            System.out.println("Lesser");
        }
        else
        {
            System.out.println("Equals");
        }
        */

        return (n>m) ? "Greater" : (n<m) ? "Lesser" : "Equals";
    }

    public static void main(String[] args)
    {
        IfElse03 i3 = new IfElse03();
        i3.checkData(4,4);
          System.out.println(i3.checkData(4, 4));  
    }
}