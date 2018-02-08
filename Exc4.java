package Exc4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Exc4
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
        {
            list.add((int)(Math.random()*15)+1);
        }

        System.out.println(partition(list, 5));
    }

    private static List<Integer> partition (List<Integer> list, Integer e)
    {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        for (Integer i:list)
        {
            if (i < e)
            {
                list1.add(i);
            }
            else
            {
                list2.add(i);
            }
        }
        list1.addAll(list2);
        return list1;
    }
}
