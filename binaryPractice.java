//Nicholas Barnes, 9/25/19, binaryPractice
/*
This is a practice assignment given by our instructor and is open for evaluation
This is done to justify alleged "inproficiencies" by allowing others to give their
opinions . This form is in conformitiy to the professor's arbitrary format . 
Decide on which is the overall better code .
Note: Since this is a practice, it isn't graded so there will be no contrast
*/
import java.util.*;
import java.io.*;
public class binaryPractice
{
public static void main(String[] args)
{
Scanner Input = new Scanner(System.in);
int nonNegativeInt,quotient;
String binaryForm = "";//Personal Concantenation Method (Allegedly "Ineffecient" , based on assumption)
System.out.print("Enter a Non-Negative Integer Value : ");
nonNegativeInt = Input.nextInt();
if(nonNegativeInt < 0)
System.out.println("Only Non-Negative Integers are Allowed !!");
else
{
for(quotient = nonNegativeInt/2;quotient>0;quotient/=2)
{
int remainder = quotient%2;
binaryForm += String.valueOf(remainder);
}
System.out.print(nonNegativeInt+" = "+binaryForm);
}
}
public static void Base()
{
Scanner Input = new Scanner(System.in);
int nonNegativeInt,quotient;//Intended Method (Allegedly more "efficient" , based on assumption)
System.out.print("Enter a Non-Negative Integer Value : ");
nonNegativeInt = Input.nextInt();
for(quotient = nonNegativeInt/2;quotient>0;quotient/=2)
{
int remainder = quotient%2;
String binaryForm  = remainder+"";
System.out.println(binaryForm);
}
}
}
