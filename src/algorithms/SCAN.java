package algorithms;

import java.util.*;

public class SCAN {
    public static void main(String []args)
    {
        System.out.println("Enter the head cylinder: ");
        int head;

        Scanner input = new Scanner(System.in);
        head = input.nextInt();

        System.out.println("Enter the max number of the number line: ");
        int tail;
        tail = input.nextInt();

        System.out.println("Enter the number of cylinders: ");
        int num;
        num = input.nextInt();

        int[] values = new int[num];
        int var = 0, distance = 0, i, l, f = 0;
        System.out.println("Enter Values Of Cylinders: ");
        for(i = 0; i < num; i++)
            values[i] = input.nextInt();

        int[] done = new int[num+1];
        for(i = 0; i < num; i++)
        {
            int r = -1;
            int min = 10000;
            for(l = 0; l < num; l++)
            {
                if(f == 0)
                {
                    if(values[l] > head && min > Math.abs(values[l] - head) && done[l] == 0)
                    {
                        min = Math.abs(values[l] - head);
                        r = l;
                    }
                }

                else if(f == 1)
                {
                    if(values[l] <= head && min > Math.abs(values[l] - head) && done[l] == 0)
                    {
                        r = l;
                        min = Math.abs(values[l] - head);
                    }
                }
            }
            if(r == -1)
            {
                if(f == 0)
                {
                    f = 1;
                    distance += Math.abs(tail - head);
                    head = tail;
                }
                else
                {
                    f = 0;
                    distance += Math.abs(0 - head);
                    head = 0;
                }
                i--;
                continue;
            }
            done[r] = 1;
            distance += Math.abs(values[r] - head);
            head = values[r];
        }
        System.out.println("Time it takes: " + distance);
    }
}
