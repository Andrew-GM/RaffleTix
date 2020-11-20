package raffleticket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class RaffleTicket {

    static int TixNumber = 0;
    static String UserName = null;
    static boolean PrimeNumber = false;
    static String enterName = null;
    static int userNumber = 0;

    public static void main(String[] args) {
        boolean Win = false;
        Random random = new Random();
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            while (Win == false) {
                System.out.println("Choose an option.");
                System.out.println(" Press 1 to buy a ticket \n Press 2 to check a ticket");
                int Choice = Integer.parseInt(input.readLine());
                switch (Choice) {
                    case (1):
                        TixNumber = random.nextInt(100) + 1;
                        System.out.println("Enter your name?");
                        UserName = input.readLine();
                        System.out.println("Your ticket number is " + TixNumber);
                        break;
                    case (2):
                        System.out.println("What is your name?");
                        enterName = input.readLine();
                        System.out.println("What is your ticket number?");
                        String Input = input.readLine();
                        userNumber = Integer.parseInt(Input);
                        PrimeNumberChecker();
                        TicketChecker();
                        break;
                    default:
                        System.out.println("This is Not a valid choice");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Enter a valid option");
        }
    }

    public static void PrimeNumberChecker() {
        if ((TixNumber == 2)||(TixNumber == 3)||(TixNumber == 5)||(TixNumber == 7)||(TixNumber == 11)||(TixNumber == 13)||(TixNumber == 17)||(TixNumber == 19)||(TixNumber == 23)||(TixNumber == 29)||(TixNumber == 31)||(TixNumber == 37)|| (TixNumber == 41) || (TixNumber == 43) || (TixNumber == 47) || (TixNumber == 53) || (TixNumber == 59) || (TixNumber == 61) || (TixNumber == 67) || (TixNumber == 71) || (TixNumber == 73) || (TixNumber == 79) || (TixNumber == 83) || (TixNumber == 89) || (TixNumber == 97)) {
            PrimeNumber = true;
        } else {
            PrimeNumber = false;
        }
    }

    public static void TicketChecker() {

        if ((TixNumber < 1) || (TixNumber > 100) || (TixNumber != userNumber)) {
            System.out.println("This ticket isn't valid.");
        } else if ((PrimeNumber == true) && (!UserName.equals(" "))) {
            System.out.println("You have won the raffle.");
        } else if (PrimeNumber == false) {
            System.out.println("You didn't win the raffle.");
        } else if ((TixNumber == 0) || (enterName != UserName)) {
            System.out.println("You haven't bought a ticket.");

        }

    }
}
