
import java.util.*;
public class ComplexDemo {
    public static void main(String[] args)
	{
		boolean debug = false;

		Complex number = new Complex(5, 2);
		System.out.println("Number is: " + number.toString());

		number.SetImaginary(-3);
		System.out.println("Number is: " + number.toString());

		System.out.print("Magnitude is: ");
		System.out.println(number.GetMagnitude());

		Complex number2 = new Complex(-1, 1);
		number.Add(number2);
		System.out.print("After adding: ");
		System.out.println(number.toString());

		if (debug)
		{
			new Scanner(System.in).nextLine();
		}
	}
}
