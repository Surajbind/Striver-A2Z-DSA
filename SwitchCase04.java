import java.util.Scanner;

public class SwitchCase04
{
    public static void main(String [] args)
    {
        java.util.Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Choice:");
        int num = sc.nextInt();


        switch (num) {
            case 1:
                System.out.println("Enter Radius");
                double r = sc.nextDouble();
                double val = r * r * 3.14;

                System.out.println("Radius is: "+val);
                break;
                case 2:
                System.out.println("Enter Length");
                double l = sc.nextDouble();

                System.out.println("Enter Height ");
                double h = sc.nextDouble();

                double area = l * h ;
                System.out.println("Area is: "+area);
                break;
        
            default:
                break;
        }
    }
}