/*?
 * w.a.p to insert employee object into the treeSet where DSNO is based on ascending order of
 * EmployeeId and Customized sorting order is based on alphabetical order of names:
 */
package com.nt.comparator;
import java.util.*;

class Employee implements Comparable<Object>{
	String name;
	int eid;
	Employee(String name,int eid){
		this.name=name;
		this.eid=eid;
	}
	public String toString() {
		return name+"...."+eid;
	}
	@Override
	public int compareTo(Object o) {
		int eid1=this.eid;
		Employee e=(Employee)o;
		int eid2=e.eid;
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return 1;
		else return 0;
	}
}
public class comp {

	public static void main(String[] args) {
		Employee e1=new Employee("abc",100);
		Employee e2=new Employee("efg",400);
		Employee e3=new Employee("pqr",500);
		Employee e4=new Employee("xyz",1000);
		Employee e5=new Employee("jkl",200);
	
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		TreeSet t1=new TreeSet(new MyComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
	}
}
class MyCompartor implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o1;
		
		String s1=e1.name;
		String s2=e2.name;
		
		return s1.compareTo(s2);
	}
	
}