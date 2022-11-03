/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public class Complex
{
	protected double a, b;

	public Complex(double realPart, double imaginaryPart)
	{
		a = realPart;
		b = imaginaryPart;
	}

	public final double GetReal()
	{
		return a;
	}

	public final void SetReal(double a)
	{
		this.a = a;
	}

	public final double GetImaginary()
	{
		return b;
	}

	public final void SetImaginary(double b)
	{
		this.b = b;
	}

	public final String toString()
	{
		return "(" + a + "," + b + ")";
	}

	public final double GetMagnitude()
	{
		return Math.sqrt((a * a) + (b * b));
	}

	public final void Add(Complex c2)
	{
		a += c2.GetReal();
		b += c2.GetImaginary();
	}
}
