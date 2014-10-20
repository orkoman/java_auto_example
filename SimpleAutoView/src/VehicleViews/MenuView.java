package VehicleViews;

//import AutoController.CarController;
//import AutoController.IVehicleController;
//import AutoController.VehicleControllerManager;

import java.util.Scanner;

/**
 * Created by orkoman on 19.10.2014.
 */
public class MenuView {

    public MenuView()
    {}

    public void showMenuView()
    {
        //Menu
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("CarControl");
        System.out.println("-------------------------------");
        System.out.println("Main menu");
        System.out.println("1)Show vehicles");
        System.out.println("2)New car");
        System.out.println("3)New motorcycle");
        System.out.println("0)End Program");
        System.out.println("-------------------------------");

    }

    public void show(String text)
    {
        System.out.println(text);
    }

    public int showInputView()
    {
        int choice = 0;
        try
        {
            System.out.print("Make a choice: ");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println("Your choice: " + choice);
        }
        catch (Exception e)
        {
            System.out.println("Wrong input!!!");
            return -1;
        }

        return choice;
    }

    public void showEndMenu()
    {
        System.out.println("Press any key and enter.");

        try
        {
            Scanner scanner = new Scanner(System.in);
            scanner.next();
        }
        catch (Exception e)
        {
            System.out.println("Wrong input!!!");
        }
    }
}
