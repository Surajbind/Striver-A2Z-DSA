//https://www.geeksforgeeks.org/problems/pass-by-reference-and-value/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pass-by-reference-and-value

public class FuctionPassByReference08
{
    public int[] check(int a,int b)
    {
        return new int[]{a,b};
    }

    public static void main(String[] args)
    {
        FuctionPassByReference08 c1 = new FuctionPassByReference08();
        System.out.println(c1.check(1,2));
    }
}
