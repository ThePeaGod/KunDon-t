//Nicholas Barnes, 9/25/19, triangleType
import java.util.*;
import java.io.*;
//Nicholas Barnes, 9/11/19, TriangleType (-1 Point since this wasn't on line 1)
public class triangleType
{
	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);
		String triangleType,Trash; //Deducted 1 Point for the inclusion of "Trash" String for superfluous inputs
		int a=0,b=0,c=0,Min=0,Max=0,aNew=0,bNew=0,cNew=0;//In order to be included in the for loop and defined outside it,they must be assigned a value,points deducted for this
		for(int i =0;i<11;i++)
		{
			System.out.print("Enter 3 Positive Integers for the Lengths of Sides of Triangles : ");
			a = Input.nextInt();
			b = Input.nextInt();
			c = Input.nextInt();
			Trash = Input.nextLine(); //-1 point for inclusion of "Trash" String for nextLine inputs
			//Slightly altered from original, only use < operator
			if(a<b)
			{
				if(b<c)
				{
					Min = a;
					Max = c;
				}
				else
				{
					Max = b;
					if(c<a)
						Min = c;
					else
						Min = a;
				}
			}
			else
			{
				if(a<c)
				{
					Max = c;
					Min = b;
				}
				else
				{
					Max = a;
					if(c<b)
						Min = c;
					else
						Min = b;
				}
			}
			aNew = Min;
			cNew = Max;
			bNew = a+b+c-aNew-cNew;
			//Evaluates Triangle Inequality Theorem
			if(cNew < aNew + bNew)
			{
				//Equilateral Triangle
				if(a==b&&a==c)
				{
					if(Math.pow(cNew,2)>Math.pow(aNew,2)+Math.pow(bNew,2))
					{
						System.out.println("The Triangle with Sides "+a+","+b+",and "+c+" is equilateral-obtuse angle triangle");
					}
					if(Math.pow(cNew,2)<Math.pow(aNew,2)+Math.pow(bNew,2))
					{
						System.out.println("The Triangle with Sides "+a+","+b+",and "+c+" is equilateral-acute angle triangle");
					}
					if(Math.pow(cNew,2)==Math.pow(aNew,2)+Math.pow(bNew,2))
					{
						System.out.println("The Triangle with Sides "+a+","+b+",and "+c+" is equilateral-right angle triangle");
					}
				}
				//Isosceles
				else if((a==b||a==c||b==c)&&(a!=c||a!=b||b!=a))
				{
					if(Math.pow(cNew,2)>Math.pow(aNew,2)+Math.pow(bNew,2))
					{
						System.out.println("The Triangle with Sides "+a+","+b+",and "+c+" is isosceles-obtuse angle triangle");
					}
					if(Math.pow(cNew,2)<Math.pow(aNew,2)+Math.pow(bNew,2))
					{
						System.out.println("The Triangle with Sides "+a+","+b+",and "+c+" is isosceles-acute angle triangle");
					}
					if(Math.pow(cNew,2)==Math.pow(aNew,2)+Math.pow(bNew,2))
					{
						System.out.println("The Triangle with Sides "+a+","+b+",and "+c+" is isosceles-right angle triangle");
					}
				}
				//Scalene
				else
				{
					if(Math.pow(cNew,2)>Math.pow(aNew,2)+Math.pow(bNew,2))
					{
						System.out.println("The Triangle with Sides "+a+","+b+",and "+c+" is scalene-obtuse angle triangle");
					}
					if(Math.pow(cNew,2)<Math.pow(aNew,2)+Math.pow(bNew,2))
					{
						System.out.println("The Triangle with Sides "+a+","+b+",and "+c+" is scalene-acute angle triangle");
					}
					if(Math.pow(cNew,2)==Math.pow(aNew,2)+Math.pow(bNew,2))
					{
						System.out.println("The Triangle with Sides "+a+","+b+",and "+c+" is scalene-right angle triangle");
					}
				}
				
			}
			else
			{
				System.out.println("No Triangle with Sides "+a+","+b+",and "+c);
			}
		}
	}
}
