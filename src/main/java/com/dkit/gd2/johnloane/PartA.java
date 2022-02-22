package com.dkit.gd2.johnloane;

/**
 *
 * @author John Loane
 */
public class PartA
{

    public static void main(String[] args)
    {
        int[][] magicSquare =
        {
            {
                2, 7, 6
            }, 
            {
                9, 5, 1
            },
            {
                4, 3, 8
            }
        }; 

        System.out.println("");
        if (checkIfMagicSquare(nums))
        {
            System.out.println("\nData is in a magic square");
        }
        else
        {
            System.out.println("\nData is NOT in a magic square");
        }
        System.out.println("");
    }
}
