package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//Without lambda expression
//class MyComparator implements Comparator<Integer>{
//	
//	@Override
//	public int compare(Integer i1, Integer i2) {
//		if(i1<i2)
//		{
//			return 1;
//		}
//		else if(i1>i2) 
//		{
//			return -1;
//		}
//		else
//		{
//		return 0;
//		}
//	}
//}
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(86);
		al.add(90);
		al.add(25);
		al.add(46);
		al.add(9);
		al.add(2);
		al.add(35);
		al.add(62);
		
		System.out.println(al);
		
//		Collections.sort(al, new MyComparator());
//		System.out.println(al);
		
		//With lambda expression
		Comparator<Integer> c= (i1, i2) ->(i1<i2)?1: (i1>i2)?-1:0; 
		Collections.sort(al, c);
		System.out.println(al);
		
	}
}
