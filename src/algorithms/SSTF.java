package algorithms;

import java.util.*;

public class SSTF {

    public static void main(String []args)
    {
        System.out.print("Enter the current cylinder: ");
        int head;
        int count;

        Scanner input = new Scanner(System.in);
        head = input.nextInt();

        System.out.print("Enter the number of cylinders: ");
        count = input.nextInt();

        int[] values = new int[count];
        int var = 0, distance = 0, i, n;

        System.out.println("Enter the values of cylinders: ");

        for(i = 0; i < count; i++)
            values[i] = input.nextInt();

        int[] done = new int[count+1];
        for(i = 0; i < count; i++)
        {
            int r = 10000;
            int s = 0;
            for(n = 0; n < count; n++)
            {
                if(Math.abs(values[n] - head) < r)
                {
                    if(done[n] == 0)
                    {
                        r = Math.abs(values[n] - head);
                        s = n;
                    }
                }
            }
            done[s] = 1;
            distance += Math.abs(values[s] - head);
            head = values[s];
        }
        System.out.println("Time it takes: " + distance);
    }
}
