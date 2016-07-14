/**
 * Created by caizhongmou on 7/13/16.
 */
package com.geekschool.multiplicationtable;

public class Multiplicationtable
{
    public static void main(String[] argc)
    {
        for(int i=1;i<10;++i)
        {
            for(int j=1;j<=i;++j)
            {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }

}
