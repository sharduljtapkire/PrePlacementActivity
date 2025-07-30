///////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   program64.java
//  Descreption :   to print the pattern
//  Input       :   3    z
//  Output      :   z   z   z
//  Author      :   Shardul Tapkire
//  Date        :   17/07/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Patterns
{
    void Display(int iNo , char ch)
    {
        int iCnt = 0 ;

        if(iNo < 0)         //updator
        {
            iNo = -iNo;
        }

        for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
        {
            System.out.print(ch+"\t");
        }

        System.out.println("");
    }
}

class Program64
{
    public static void main(String A[])
    {
        int iValue = 0 ;
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Frequency :");
        iValue = sobj.nextInt();

        System.out.println("Enter The Frequency :");
        cValue = sobj.nextLine();

        Patterns pobj = new Patterns();
        pobj.Display(iValue,cValue);
    }
}