import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthYear,horoscope;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth year: ");
        birthYear = input.nextInt();
        horoscope = birthYear % 12 ;
        System.out.println(horoscope);
        switch (horoscope){
            case 0 :
                System.out.println("Your Horoscope is Monkey ");
                break;
            case 1  :
                System.out.println("Your horoscope is Cockerel");
                break;
            case 2 :
                System.out.println("Your horoscope is Dog");
                break;
            case 3 :
                System.out.println("Your horoscope is Pig");
                break;
            case 4:
                System.out.println("Your horoscope is Mouse");
                break;
            case 5:
                System.out.println("Your horoscope is Ox");
                break;
            case 6:
                System.out.println("Your horoscope is Tiger");
                break;
            case 7:
                System.out.println("Your horoscope is Rabbit");
                break;
            case 8 :
                System.out.println("Your horoscope is Dragon");
                break;
            case 9 :
                System.out.println("Your horoscope is Snake");
                break;
            case 10:
                System.out.println("Your horoscope is Horse ");
                break;
            case 11:
                System.out.println("Your horoscope is Sheep");
                break;
            default:
                System.out.println("İnvalid date Please try again later");
        }
    }
}