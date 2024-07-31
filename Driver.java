package message;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10]; // Initial array size
        int count = 0;
        boolean r = true;

        System.out.println("Type your numbers: (type quit to end the program!)");

        while (r && count < a.length) {
            if (input.hasNextInt()) {
                a[count] = input.nextInt();
                count++;
            } else {
                String q = input.next();
                if (q.equalsIgnoreCase("quit")) {
                    r = false;
                } else {
                    System.out.println("Undefined input...");
                }
            }
        }

        input.close();

        if (count > 0) {
            printAverage(a, count);
        } else {
            System.out.println("No numbers entered.");
        }
    }

    public static int Average(int[] a, int count) {
        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += a[i];
        }

        return sum / count;
    }

    public static void printAverage(int[] a, int count) {
        try {
            int avg = Average(a, count);
            System.out.println("Average is: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error calculating average");
        } catch (Exception e) {
            System.out.println("Undefined inputs...");
        }
    }
}

