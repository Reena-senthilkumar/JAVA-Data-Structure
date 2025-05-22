import java.util.*;
import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
	    HashMap<Integer,String> hm=new HashMap<Integer,String>(); //Integer-->key ,String-->value
	    hm.put(1,"one");
	    hm.put(2,"two");
	    hm.put(3,"three");
	    hm.put(4,"four");
	    hm.put(5,"five");
		System.out.println(hm.get(1)); //print value by using key 
		for(Integer i:hm.keySet()){  //print all keys
		    System.out.print(i+" ");
		}
		System.out.println();
		for(String i:hm.values()){ //print all values
		    System.out.print(i+" ");
		}
		hm.remove(2); //remove the particulr elements
		System.out.println(hm);
		System.out.println(hm.containsKey(53));  //to print in boolean way
		System.out.println(hm.size()); //print size
		hm.clear();  //to clear all the values and keys
		System.out.println(hm);
	}
}
