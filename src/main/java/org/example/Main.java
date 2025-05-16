package org.example; //DO NOT DELETE
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        int lenStart;
        int lenEnd;
        System.out.print("What Exercise would you like to do?");
        System.out.println("1 - Further Substring Fun");
        System.out.println("2 - Run of integers");
        System.out.println("3 - Sum of a Range of Sequential Integers");
        System.out.println("4 - Repeatedly Echo a Word");
        System.out.println("5 - Words Separated by Dots");
        System.out.println("6 - Adding up Integers");
        System.out.println("7 - Shipping Cost Calculator");
        System.out.println("Which one would you like to do: ");
        int choice = input.nextInt();
        if (choice == 1){
            System.out.println("Enter a string: ");
            str = input.nextLine();
            str = input.nextLine();
            System.out.println("Enter beginning index: ");
            lenStart = input.nextInt();
            System.out.println("Enter ending index: ");
            lenEnd = input.nextInt();
            System.out.println("");
            System.out.println("Original string: ");
            System.out.println(str);
            System.out.println("");
            str = str.substring(lenStart, lenEnd);
            System.out.println("Substring: ");
            System.out.println(str);
        }else if (choice == 2){
            System.out.println("Enter a starting value: ");
            int start = input.nextInt();
            System.out.println("Enter a ending value: ");
            int end = input.nextInt();
            int count = start;
            System.out.println("");
            while (count < end+1){
                System.out.println(count);
                count = count+1;
            }
        }else if (choice == 3){
            System.out.println("Enter a low: ");
            int low = input.nextInt();
            System.out.println("Enter a high:: ");
            int high = input.nextInt();
            int count = low;
            int sum = 0;
            while (count < high+1){
                sum = sum + count;
                count = count+1;
            }
            System.out.println("Sum = " + sum);
        } else if (choice == 4){
            System.out.println("Enter a word: ");
            String word = input.nextLine();
            int len = word.length();
            int count = len;
            System.out.println("");
            while (count < len+1){
                System.out.println(word);
            }
        }else if (choice == 5){
            System.out.println("Enter first word: ");
            String wordOne = input.nextLine();
            wordOne = input.nextLine();
            System.out.println("Enter a second word: ");
            String wordTwo = input.nextLine();
            int length = wordOne.length() + wordTwo.length();
            System.out.print(wordOne);
            while (length < 30){
                System.out.print(".");
                length = length + 1;
            }
            System.out.print(wordTwo);
        }else if (choice == 6){
            System.out.println("How many integers will be added: ");
            int numCount = input.nextInt();
            int sum = 0;
            while (numCount > 0){
                System.out.println("Enter a number: ");
                int num = input.nextInt();
                sum = sum+num;
                numCount = numCount-1;
            }
            System.out.println("The sum is: " + sum);
        }else {
            int time = 1;
            while (time > 0){
            System.out.println("Enter weight of order: ");
            int weight = input.nextInt();
            double shipping = 3.00;
            if (weight > 10){
                double extraCost = (weight-10)*.25;
                shipping = shipping+extraCost;
                System.out.println("Shipping cost: " + shipping);
            }else if (weight > 0){
                System.out.println("Shipping cost: " + shipping);
            }else {
                System.out.println("bye");
                time = 0;
            }
        }
        }
    }
}
