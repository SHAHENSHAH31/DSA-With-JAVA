package classandobject;
import java.util.Scanner;

public class FractionUse {
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		//int n=s.nextInt();
		//int d=s.nextInt();
	Fraction f1=new Fraction( 4,6);
   // f1.print();
  //  f1.increment();
    f1.print();
    Fraction f2=new Fraction(4,8);
   f1.add(f2);
   f1.print();
	}
}
