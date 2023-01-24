package package_game;
import java.util.*;

public class game_code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Welcome to my programme!!" +
                "\n Guess The Number!");
        System.out.println("Note- Your intelligence is judged by the number of your tries as follows:");
        System.out.println("\ta)1 to 5: Genius.\n\t" +
                "b)5 to 10: Intelligent.\n\t" +
                "c)10 to 20: Good.\n\t" +
                "d)Else: Better luck next time.");
        int res = 1;
        try {
            while (res == 1) {
                int tries = 0;
                int num = rd.nextInt(100);
                System.out.println("Note-\n\t" +
                        "1)You hava to guess the number that computer knows!\n" +
                        "\t2)The number range is 0 to 100");
                System.out.println("Let's test your intelligence!!!");
                System.out.print("Hint - ");
                if (num <= 50) {
                    System.out.println("The number is less than or equal to 50.");
                } else {
                    System.out.println("The number is greater than 50.");
                }
                while (true) {
                    System.out.print("Guess the number.\n\tYour Response: ");
                    int gn = sc.nextInt();
                    if (gn == num) {
                        System.out.println("Congratulations!!!\n\tYou won!!!");
                        break;
                    } else if (gn < num) {
                        System.out.println("The entered number is smaller than the number!");
                        if (num - gn <= 10) {
                            System.out.println("You are very close to the number!\n\tKeep trying!!");
                        } else if (num - gn <= 20 && num - gn > 10) {
                            System.out.println("You are close to the number!\n\tKeep trying!!");
                        } else if (num - gn > 20) {
                            System.out.println("Your are far from the number!\n\tKeep trying!!");
                        }
                    } else if (gn > num) {
                        System.out.println("The entered number is bigger than the number!");
                        if (gn - num <= 10) {
                            System.out.println("You are very close to the number!\n\tKeep trying!!");
                        } else if (gn - num <= 20 && gn - num > 10) {
                            System.out.println("You are close to the number!\n\tKeep trying!!");
                        } else if (gn - num > 20) {
                            System.out.println("Your are far away from the number!\n\tKeep trying!!");
                        }
                    }
                    tries++;
                }
                if (tries <= 5) {
                    System.out.println("Your number of tries is " + tries);
                    System.out.println("You are a Genius!!!");
                } else if (tries > 5 && tries <= 10) {
                    System.out.println("Your number of tries is " + tries);
                    System.out.println("You are a Intelligent!!!");
                } else if (tries > 10 && tries <= 20) {
                    System.out.println("Your number of tries is " + tries);
                    System.out.println("You are a Good!!!");
                } else {
                    System.out.println("Your number of tries is " + tries);
                    System.out.println("Better luck next time!!");
                }
                System.out.print("Do you want to continue with the game?[1-Yes, 2-No]\nYour Response-");
                res = sc.nextInt();
            }
            System.out.println("Thank-you!!\n\tHope you enjoyed!");
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input!");
        }
    }

}