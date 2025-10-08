//https://www.naukri.com/code360/problems/nth-fibonacci-number_74156?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


public class ForLoops06
{
    //recursive ways
    // public int fibo(int n)
    // {
    //     if(n==1|| n==2)
    //     {
    //         return 1;
    //     }
    //     return (fibo(n-1)+fibo(n-2));
    // }

    public int fibo(int n)
    {
        int a = 1, b = 1;
        for(int i=3;i<=n;i++)
        {
            int c = a + b ;

            a = b;
            b = c ; 
        }
        return b;
    }

    public static void main(String[] args) {
        ForLoops06 f1 = new ForLoops06();
        	System.out.println(f1.fibo(6));
    }
}