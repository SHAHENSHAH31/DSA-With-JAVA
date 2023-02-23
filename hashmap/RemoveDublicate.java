package hashmap;
import java.util.HashMap;
import java.util.ArrayList;
public class RemoveDublicate {
public static ArrayList<Integer> removeDublicate(int arr[]){
	HashMap<Integer,Boolean> h=new HashMap<>();
	ArrayList<Integer> output=new ArrayList<>();
	for(int i=0;i<arr.length;i++) {
		if(h.containsKey(arr[i])) {
			continue;
		}
	 output.add(arr[i]);
	 h.put(arr[i],true);
	}
	return output;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,2,2,3,1,6,2,5};
 ArrayList<Integer>output=removeDublicate(arr);
 for(int i:output) {
	 System.out.print(i);
 }
	}

}
