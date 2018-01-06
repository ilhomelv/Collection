/*
COMPARATOR interface 
    Used for customizable sorting order. Comes in java.util package.
		Whenever we are implementing Comparator Interface, we should provide 
    implementation only for compare() method, however we are not required to 
    provide implementation for equals() method, because its implementation already 
    available from Object Class thru inheritance. Object class is Parent of 
    Comparator interface.

Comparator has Two Methods
public int compare(Obj1, Obj2);	boolean equals(Obj o);

Obj1 has to come before Obj2, returns -1
Obj1 has to come after Obj2, returns +1
Obj1 equals object Obj2, then returns 0


example: Print out numbers by Descending Order
public static void main(String[] args) {
	TreeSet t = new TreeSet(new MyComparator());
	//TreeSet t = new TreeSet();		//if you don't pass MyComparator() object, then JVM
	//will use compareTo() and Default Sorting order be implemented

	t.add(10);
	t.add(0);
	t.add(15);
	t.add(5);
	t.add(20);
	t.add(20);
	S.o.u.t(t)	//  [ 20, 15, 10, 5, 0 ] Descending order
}
//Approach One
class MyComparator implements Comparator {
int compare(Object o1, Object o2) {		//note: Object o2 is (10), Object o1 is (0)
	Integer i1 = (Integer)o1;
	Integer i2 = (Integer)o2;
	if(i1<i2) return +1;
	else if(i1>i2) return -1;
	else return 0;
	}
}
//Approach Two
class MyComparator implements Comparator {
int compare(Object o1, Object o2) {
	Integer i1 = (Integer)o1;
	Integer i2 = (Integer)o2;
	return -i1.compareTo(i2);	//add minus
	}
}
//Approach Three		all three approaches will return same result
class MyComparator implements Comparator {
int compare(Object o1, Object o2) {
	Integer i1 = (Integer)o1;
	Integer i2 = (Integer)o2;
	return i2.compareTo(i1);	//Obj1 and Obj2 Exchanged
	}
}

example: Lets see various possible implementations
//Insertion order will be printed, 
int compare(Object o1, Object o2) {
	Integer i1 = (Integer)o1;
	Integer i2 = (Integer)o2;
	return +1;		//[ 10, 0, 15, 5, 20, 20 ]
	//return -1;	//Reverse of insertion order will be printed [ 20, 20, 5, 15, 0, 10 ]
	//return 0;	//Only first element will be inserted & all remaining are duplicates [10]


example2:
TreeSet t = new TreeSet();
t.add(“Tim”);
t.add(“Jon”);
t.add(“Apple”);
t.add(“Cindy”);
t.add(“Tom”);
S.o.u.t (t);		//Apple Cindy Jon Tim Tom	prints default order Alphabetical

TreeSet t = new TreeSet(new MyComparator());
t.add(“Tim”);
t.add(“Jon”);
t.add(“Apple”);
t.add(“Cindy”);
t.add(“Tom”);
S.o.u.t (t);		//Tom Tim Jon Cindy Apple	prints myComparator order

class MyComparator implements Comparator {
	public int compare(Object o1,Object o2) {
		String s1=o1.toString();	//toString() or (String) casting both works
		String s2=(String)o2;
		return -s1.compareTo(s2);	//reverse Alphabetical order
		//return s2.compareTo(s1);	//reverse Alphabetical order 
	}
}


*/
