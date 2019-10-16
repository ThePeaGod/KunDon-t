//Nicholas Barnes 10/15/19 binaryFormOfNonNegativeInteger
import java.util.*;
import java.io.*;

public class binaryFormOfNonNegativeInteger
{
	public static void main(String[] args)
	{
		testBinaryForm();
		powersOf2AndTheirBinaryForms();
	}
	public static String binaryForm(int nonNegativeInt)
	{
		if(nonNegativeInt > 0)
		{
			int remainder = nonNegativeInt % 2;
			String binary = "" + remainder;
			/*System.out.println("nonNegativeInt = "
			+ nonNegativeInt + " remainder = "
			+ remainder + " binary = " + binary);
			*/
			for(int quotient = nonNegativeInt/2;quotient > 0;quotient /= 2)
			{
				remainder = quotient%2;
				binary = remainder + binary;
				/*System.out.println("quotientInDivBy2 = " + quotient + "
				remainder = " + remainder + " binary = " + binary);
				*/
			}
			return(binary);
		}
		else
			return("***Invalid Negative Input");
	}
	public static void testBinaryForm()
	{
		for(int i = 12;i<=17;i++)
		{
			System.out.println("i = " + i + " has binary form: "
			+ binaryForm(i));
		}
	}
	public static void powersOf2AndTheirBinaryForms()
	{
		int power = 1;
		System.out.println("power 0 of 2: " + power + " has binary form: "
		+ binaryForm(power));
		for(int i = 1;i < 35;i++)
		{
			power *= 2;
			if(power >= 0)
			System.out.println("power of " + i + " of 2: "
		    + power + " has binary form: " + binaryForm(power));
		}
	}
}
/*
nonNegativeInt = 13 remainder = 1 binary = 1
quotientInDivBy2 = 6 remainder = 0 binary = 01
quotientInDivBy2 = 3 remainder = 1 binary = 101
quotientInDivBy2 = 1 remainder = 1 binary = 1101

i = 12 has binary form: 1100
i = 13 has binary form: 1101
i = 14 has binary form: 1110
i = 15 has binary form: 1111
i = 16 has binary form: 10000
i = 17 has binary form: 10001

power 0 of 2: 1 has binary form: 1
power of 1 of 2: 2 has binary form: 10
power of 2 of 2: 4 has binary form: 100
power of 3 of 2: 8 has binary form: 1000
power of 4 of 2: 16 has binary form: 10000
power of 5 of 2: 32 has binary form: 100000
power of 6 of 2: 64 has binary form: 1000000
power of 7 of 2: 128 has binary form: 10000000
power of 8 of 2: 256 has binary form: 100000000
power of 9 of 2: 512 has binary form: 1000000000
power of 10 of 2: 1024 has binary form: 10000000000
power of 11 of 2: 2048 has binary form: 100000000000
power of 12 of 2: 4096 has binary form: 1000000000000
power of 13 of 2: 8192 has binary form: 10000000000000
power of 14 of 2: 16384 has binary form: 100000000000000
power of 15 of 2: 32768 has binary form: 1000000000000000
power of 16 of 2: 65536 has binary form: 10000000000000000
power of 17 of 2: 131072 has binary form: 100000000000000000
power of 18 of 2: 262144 has binary form: 1000000000000000000
power of 19 of 2: 524288 has binary form: 10000000000000000000
power of 20 of 2: 1048576 has binary form: 100000000000000000000
power of 21 of 2: 2097152 has binary form: 1000000000000000000000
power of 22 of 2: 4194304 has binary form: 10000000000000000000000
power of 23 of 2: 8388608 has binary form: 100000000000000000000000
power of 24 of 2: 16777216 has binary form: 1000000000000000000000000
power of 25 of 2: 33554432 has binary form: 10000000000000000000000000
power of 26 of 2: 67108864 has binary form: 100000000000000000000000000
power of 27 of 2: 134217728 has binary form: 1000000000000000000000000000
power of 28 of 2: 268435456 has binary form: 10000000000000000000000000000
power of 29 of 2: 536870912 has binary form: 100000000000000000000000000000
power of 30 of 2: 1073741824 has binary form: 1000000000000000000000000000000
power of 32 of 2: 0 has binary form: ***Invalid Negative Input
power of 33 of 2: 0 has binary form: ***Invalid Negative Input
power of 34 of 2: 0 has binary form: ***Invalid Negative Input
*/