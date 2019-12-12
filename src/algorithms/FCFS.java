package algorithms;

import java.util.*;

public class FCFS {
    public static void main(String[] args) {
        System.out.print("Enter the head cylinder: ");
        int head, totalCylinders;
        Scanner input = new Scanner(System.in);
        head = input.nextInt();

        System.out.print("Enter the number of cylinders to service: ");
        totalCylinders = input.nextInt();

        int[] values = new int[totalCylinders];
        int length = 0;
        int distance = 0;
        int i;

        System.out.println("Enter the values of cylinders: ");
        for(i = 0; i < totalCylinders; i++)
            values[i] = input.nextInt();
        length = head;

        for(i = 0; i < totalCylinders; i++)
        {
            length = Math.abs(length - values[i]);
            distance += length;
            length = values[i];
        }
        System.out.println("Time it takes: " + distance);
    }
}