package collectionArraylist;

import java.util.ArrayList;
import java.util.TreeSet;

public class Addmethod {
	public static void main(String args[])
	{
		TreeSet s1=new TreeSet();
		s1.add(100);
		s1.add(200);
		s1.add(800);
		s1.add(400);
		s1.add(100);
		s1.add(200);
		s1.add(500);
		s1.add(600);
		
		System.out.println(s1);
		ArrayList s2=new ArrayList();
		s2.add(100);
		s2.add(200);
		s2.add(800);
		s2.add(400);
		s2.add("dinesh");
		s2.add(200);
		s2.add(500);
		s2.add(600);
		
		System.out.println(s2);
	}

}
