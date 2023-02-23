package arraylist;
import java.util.ArrayList;
public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>arr=new ArrayList<>();
arr.add(10);
arr.add(20);
arr.add(30);
arr.add(40);
arr.add(2,80);
arr.set(1, 20);
arr.remove(0);
System.out.println(arr.size());
System.out.println(arr.get(0));
for(int i=0;i<arr.size();i++) {
	System.out.println(arr.get(i));
}
for(int i:arr) {
	System.out.println(i);
}
	}

}
