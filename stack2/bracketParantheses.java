package stack2;
import java.util.Scanner;
import java.util.Stack;
public class bracketParantheses {
	public static boolean BracketParantheses(String s) {
		Stack<Character> n=new Stack<Character>();
		for(char c:s.toCharArray()) 
		{
			if(c=='['||c=='('||c=='{')
			{
				n.add(c);
			}else {
				if(n.isEmpty())
				{
					return false;
				}
				if(c==']' && n.peek()!='[') 
				{
					return false;
				}
				if(c=='}' && n.peek()!='{') 
				{
					return false;
				}
				if(c==')' && n.peek()!='(') 
				{
					return false;
				}
				n.pop();
			}
			//return n.isEmpty();
		}
		return n.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print(BracketParantheses(s));
	}

}
