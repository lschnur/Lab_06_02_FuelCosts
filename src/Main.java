import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double Ngallon = 0.0;
        double Feffciency = 0.0;
        double Pgallon = 0.0;
        double dis = 0;
        double mile = 0;

        System.out.println("Enter the number of gallons ");
        if (in.hasNextDouble())
        {
            System.out.println("Enter the price per gallon of gas");
            Ngallon = in.nextDouble();



        }
        if (in.hasNextDouble())
        {

            Feffciency = in.nextDouble();
            System.out.println("Enter the efficency of the vehicle ");
        }
        if (in.hasNextDouble())
        {


            Pgallon = in.nextDouble();
            dis = Ngallon * Feffciency;
            mile = Feffciency * Pgallon;
            System.out.println("You can go " + dis + " miles on a full tank of gas");
            System.out.println("100 miles of gas would cost you " + mile + " Dollars");
        }
        else
        {
            System.out.println("You have entered an invalid number");
        }



    }

}