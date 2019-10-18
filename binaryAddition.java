//Nicholas Barnes, 10/17/19, binaryAddition
import java.util.*;

public class binaryAddition
{
	public static int binaryToDecimal(int[] binaryNum, int numBits,int maxValue)
	{
		int i = 1,j = 0, Decimal = 0;
		do
		{
			Decimal += (binaryNum[numBits - i] * Math.pow(2,j));
		    i++;
		    j++;
		}while(i < numBits);
		
		if(binaryNum[0] == 1)
		   Decimal = Decimal - maxValue;
		
		return Decimal;
	}
	public int[] addBinary(int[] binaryNum, int[] binaryNum2, int numBits)
	{
		int[] binarySum = new int[numBits];
		int i = 1,c = 0,remainder = 0,sum = 0;
		
		do
		{
			sum = c + binaryNum[numBits - i] + binaryNum2[numBits - i];
			c = sum / 2;
			remainder = sum % 2;
			binarySum[numBits - i] = remainder;
		    i++;
		}while(i <= numBits);
		
		return binarySum;
	}
	public binaryAddition(int numBits)
	{
		Scanner Input = new Scanner(System.in);
		final int[] binaryNum = new int[numBits], binaryNum2 = new int[numBits];
		int max = 1;
		
		for(int i = 0;i < numBits-1;i++)
		{
			max *= 2;
		}
		System.out.print("Enter Two Integers (>=" + (-max) + " and <= " + 
		(max-1) + "): ");
		int First = Input.nextInt();
		int Second = Input.nextInt();
		Input.nextLine();
		int I = 0;
		for(int b:decimalTobinary(First,numBits,max))
		{
			binaryNum[I] = b;
			++I;
		}
		I = 0;
		for(int b:decimalTobinary(Second,numBits,max))
		{
			binaryNum2[I] = b;
			++I;
		}
		System.out.println("Binary Form: " + Arrays.toString(binaryNum) + "
		of InputInt = " + binaryToDecimal(binaryNum,numBits,max));
		System.out.println("Binary Form: " + Arrays.toString(binaryNum2) + "
		of InputInt2 = " + binaryToDecimal(binaryNum2,numBits,max));
		System.out.println("Binary Sum: " + 
		Arrays.toString(addBinary(binaryNum,binaryNum2,numBits)) + " = "
		+ binaryToDecimal(addBinary(binaryNum,binaryNum2,numBits),numBits,max));
	}
	
	public static void testAddition(int numTest)
	{
		Scanner Input = new Scanner(System.in);
		int numBits;
		System.out.print("Enter Number of Bits(>=1 and <=10): ");
		numBits = Input.nextInt();
		for(int i = 0;i < numTest;i++)
		{
		binaryAddition ba = new binaryAddition(numBits);
		}
	}
	
	public static void main(String[] args)
	{
		testAddition(5);
	}
	
	public int[] decimalTobinary(int number, int numBits, int maxValues)
	{
		int[] result = new int[numBits];
		
		if(number < 0)
		{
			int i = 1,D = 0;
			number = Math.abs(number);
			do
			{
				int remainder = number % 2;
				number /= 2;
				if(D == 1)
				{
					if(remainder == 0)
						remainder = 1;
					else
						remainder = 0;
				}
				result[numBits - i] = remainder;
				if(D == 0 && remainder == 1)
					D = 1;
				i++;
			}while(i <= numBits);
		}
		else
		{
			int i = 1;
			result[0] = 0;
			do
			{
				int remainder = number % 2;
				number /= 2;
				result[numBits - i] = remainder;
				i++;
			}while(i < numBits);
		}
		return (result);
	}
}
/*
Enter Number of Bits(>=1 and <=10): 6
Enter Two Integers (>=-32 and <= 31): 15 -20
Binary Form: [0, 0, 1, 1, 1, 1] of InputInt = 15
Binary Form: [1, 0, 1, 1, 0, 0] of InputInt2 = -20
Binary Sum: [1, 1, 1, 0, 1, 1] = -5
Enter Two Integers (>=-32 and <= 31): 0 15
Binary Form: [0, 0, 0, 0, 0, 0] of InputInt = 0
Binary Form: [0, 0, 1, 1, 1, 1] of InputInt2 = 15
Binary Sum: [0, 0, 1, 1, 1, 1] = 15
Enter Two Integers (>=-32 and <= 31): -32 16
Binary Form: [1, 0, 0, 0, 0, 0] of InputInt = -32
Binary Form: [0, 1, 0, 0, 0, 0] of InputInt2 = 16
Binary Sum: [1, 1, 0, 0, 0, 0] = -16
Enter Two Integers (>=-32 and <= 31): 16 31
Binary Form: [0, 1, 0, 0, 0, 0] of InputInt = 16
Binary Form: [0, 1, 1, 1, 1, 1] of InputInt2 = 31
Binary Sum: [1, 0, 1, 1, 1, 1] = -17
Enter Two Integers (>=-32 and <= 31): -16 -16
Binary Form: [1, 1, 0, 0, 0, 0] of InputInt = -16
Binary Form: [1, 1, 0, 0, 0, 0] of InputInt2 = -16
Binary Sum: [1, 0, 0, 0, 0, 0] = -32
*/