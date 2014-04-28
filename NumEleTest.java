// program that allows the user to specify the num elements
import java.util.Scanner;
public class NumEleTest
{
	private static PerTable perTable = new PerTable();
	private static  String name = ""; 
	private static int numElements = 0, amt = 0;
	private static double total = 0;
	private static Scanner scan = new Scanner(System.in);
	private static Element[] els;
	private static int[] elsAmt;
	private static String eqn = "";
	
	public static void main(String[] args)
	{
		System.out.println("Num Elements:");
		numElements = scan.nextInt();
		
		els = new Element[numElements];
		elsAmt = new int[numElements];
		
		// gets element name, atomic num, atomic mass
		for (int i = 0; i < numElements; i++)
		{
			System.out.println("Element " + (i+1) + " name:");
			name = scan.next();
			els[i] = new Element(name);
			System.out.println("Element " + (i+1) + " amount:");
			amt = scan.nextInt();
			elsAmt[i] = amt;
			System.out.println();
		}
		
		// prints element name, atomic num, atomic mass
		/*for (int i = 0; i < numElements; i++)
		{
			System.out.println("Element " + (i+1) + " name: " + els[i].getName());
			System.out.println("Element " + (i+1) + " atomic number: " + els[i].getNumber());
			System.out.println("Element " + (i+1) + " atomic mass: " + els[i].getWeight());
		}*/
		
		// prints formula name
		System.out.println(getEqnName());
			
		// prints molar mass
		System.out.println(getMolMass());
	}
	
	public static double getMolMass()
	{
		for (int i = 0; i < numElements; i++)
		{
			total += els[i].getWeight() * elsAmt[i];
		}
			
		return total;
	}
	
	public static String getEqnName()
	{
		for (int i = 0; i < numElements; i++)
		{
			eqn += els[i].getName() + elsAmt[i];
		}
			
		return eqn;
	}
}