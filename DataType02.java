//https://www.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type

public class DataType02 
{
    public void checkVal(String str)
    {
        if(str.equals("Byte"))
        {
            System.out.println("1");
        }
        else if(str.equals("Char"))
        {
            System.out.println("2");
        }
        else if(str.equals("Integer"))
        {
            System.out.println("4");
        }
        else if(str.equals("float"))
        {
            System.out.println("4");
        }
        else if(str.equals("Double"))
        {
            System.out.println("8");
        }
        else if(str.equals("Long"))
        {
            System.out.println("8");
        }
        else
        {
            System.out.println("Default");
        }
    }

    public static void main(String[] args)
    {
        DataType02 d2 = new DataType02();
        d2.checkVal("Long");
    }
}