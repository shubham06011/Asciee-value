package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStuNum {
	public static void main(String[] args) {
	
	ArrayList<Long> obj = new ArrayList();
	obj.add(7620498279l);
	obj.add(9881556875l);
	obj.add(8055351430l);
	obj.add(9527088299l);
	obj.add(7249542317l);
	//BY USINFG ITERATOR FINCTION
	Iterator it=obj.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println(obj);
	//BY USING FOR EACH LOOP
	for(Long s: obj) {
		System.out.println(s);
	}
	

}
}
