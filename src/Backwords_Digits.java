import java.util.Scanner;

public class Backwords_Digits {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int num = sc.nextInt();
        int hundreds = num / 100;
        int tens = num % 100 / 10;
        int ones = num % 10;
        System.out.println("Reversed: " + ones + tens + hundreds);
        }
    }