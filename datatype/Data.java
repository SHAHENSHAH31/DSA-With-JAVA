package datatype;
import java.util.Scanner;
public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int x = s.nextInt();
int n = s.nextInt();
int i = 1;
int p = 1;
while(i<=n) 
{
	p = p*x;
	i++;
}
System.out.println(p);
	}
}
