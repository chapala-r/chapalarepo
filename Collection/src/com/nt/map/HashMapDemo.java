package com.nt.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put("A",800);
		m.put("X",700);
		m.put("M",1000);
		System.out.println(m);
		System.out.println(m.put("A",1100));
		Set s=m.keySet();
		System.out.println(s);
		Collection c=m.values();
		System.out.println(c);
		Set s1=m.entrySet();
		System.out.println(s1);

		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"..."+m1.getValue());
			if(m1.getKey().equals("A")) {
				m1.setValue(10000);
			}
		}
		System.out.println(m);
	}

}
