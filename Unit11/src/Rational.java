//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int numerator;
	int denominator;

	//write two constructors
	public Rational() {
		setRational(1,1);	
	}
	
	public Rational(int num, int den) {
		setRational(num, den);
	}

	//write a setRational method
	public void setRational(int num, int den) {
		numerator = num;
		denominator = den;
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int n) {
		numerator = n;
	}
	
	public void setDenominator(int d) {
		denominator = d;
	}
	
	public void add(Rational other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int newNumerator = (numerator * other.getDenominator()) + (other.getNumerator() * denominator);
		int newDenominator = (denominator * other.getDenominator());
		
		numerator = newNumerator;
		denominator = newDenominator;

		reduce();
	}

	private void reduce()
	{
		int placeNum = numerator;
		int placeDen = denominator;
		if (gcd(placeNum, placeDen) != 0) {
			numerator = placeNum / gcd(placeNum, placeDen);
			denominator = placeDen / gcd(placeNum, placeDen);
		}
	}

	private int gcd(int numOne, int numTwo)
	{
		if (numOne == 0) 
			return numTwo; 
		if (numTwo == 0) 
		    return numOne; 
		   
		if (numOne == numTwo) 
		    return numOne; 

		if (numOne > numTwo) 
		    return gcd(numOne - numTwo, numTwo); 
		    
		return gcd(numOne, numTwo-numOne); 
	}

	public Object clone ()
	{
		Rational clone = new Rational(numerator, denominator);
		return clone;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	
	public boolean equals( Rational obj)
	{
		reduce();
		if (numerator == (obj.getNumerator())/gcd(obj.getNumerator(), obj.getDenominator()) && denominator == obj.getDenominator()/(gcd(obj.getNumerator(),obj.getDenominator()))) {
			return true;
		}

		return false;
	}

	public int compareTo(Rational other)
	{
		
		if (((double)numerator/(double)denominator) > ((double)other.getNumerator()/(double)other.getDenominator())) {
			return 1;
		}
		return -1;
	}



	
	//write  toString() method
	public String toString() {
		gcd(numerator, denominator);
		reduce();
		return "" + numerator + "/" + denominator;
	}
	
	
}