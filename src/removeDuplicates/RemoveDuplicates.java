package removeDuplicates;
import java.util.*;
import java.util.Map.Entry;

public class RemoveDuplicates {
	public static void main(String[] args) {
		System.out.println("Eneter String: ");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<input.length();i++) {
			char temp=input.charAt(i);
			if(map.containsKey(temp)) {
				map.put(temp,(map.get(temp))+1);
			}
			else {
				map.put(temp,1);
			}
			
		}
		input="";
		for(Entry<Character, Integer> e:map.entrySet()) {
			if(e.getValue()==1) {
				input=input+e.getKey();
			}
		}
		System.out.println(input);
	}
}
