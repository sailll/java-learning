/**
 * Created by caizhongmou on 7/13/16.
 */
package com.geekschool.arraymax;

public class ArrayMax
{

    public static void main(String[] argc)
    {
        int[] a={2,3,4,5,7,8};
        System.out.println(max(a));
    }

    private static int max(int[] a)
    {
        int tmp=a[0];
        for(int i=0;i<a.length;++i)
        {
            if(a[i]>tmp)
            {
                tmp=a[i];
            }
        }
        return tmp;
    }


}
