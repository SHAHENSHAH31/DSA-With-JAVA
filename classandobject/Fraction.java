package classandobject;

public class Fraction {

		// TODO Auto-generated method stub
          int numerator;
          int denominator;
    public Fraction (int numerator,int denominator) 
{
    	if(denominator==0)
    	{
    		denominator=1 ;
    	}
	this.numerator=numerator; 
	this.denominator=denominator;
	simplify();
}
    public void setNumerator(int num)
    {
    	this.numerator=num;
    	simplify();
    }
    public int getNumerator() 
    {
    	return numerator;
    }
    public void setdenominator(int num) 
    {
    	this.denominator=num;
    	if(denominator==0)
    	{
    		return;
    	}
    }
    	public int getDenominator() 
    	{
    		return denominator;
    	}
    public void simplify()
    {
    	int gcd=1;
    	int n=Math.min(numerator, denominator);
    	for(int i=1;i<=n;i++)
    	{
    		if(numerator%i==0&&denominator%i==0) 
    		{
    		gcd=i;	
    		}
    	}
    	numerator=numerator/gcd;
    	denominator=denominator/gcd;
    	
    }
    public void increment() 
    {
    	numerator=numerator+denominator;
    	simplify();
    }
    public void print()
    {
    	System.out.println(numerator+"/"+denominator);
    }
    public void add(Fraction f2) 
    {
    	this.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
    	this.denominator=this.denominator*f2.denominator;
    	simplify();
    }
	}


