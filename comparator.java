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


example3: 
Sort by length of Objects and then print, we will use Comparator object, As 
StringBuffer does not implement Comparable interface, so we can not use default sorting
TreeSet t = new TreeSet(new MyComparator());
t.add(“A”);
t.add(new StringBuffer(“ABC”);
t.add(new StringBuffer(“AA”);
t.add(“XX”);
t.add(“A”);
S.o.u.t(t);			// [ A  AA  XX  ABC ]	

class MyComparator implements Comparator {
public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		int i1=s1.length();
		int i2=s2.length();
		if(i1<i2) return -1;
		else if (i1>i2) return 1;
		else return s1.compareTo(s2);
		//return 0;	//output be: [ A  AA  ABC ] note XX disappeared, size 2.
	}
}

example4:  
insert and sort according to employee id and then print
class ComComp (
	public static void main() {
		Employee e1 = new Employee(“Nathan”,100);
		Employee e2 = new Employee(“Bob”,200);
		Employee e3 = new Employee(“Chanel”,50);
		Employee e4 = new Employee(“Vena”,150);
		Employee e5 = new Employee(“Nathan”,100);
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		S.o.u.t(t);		// [Chanel—50, Nathan—100,Vena-150, Bob—200 ]
		
		TreeSet t1 = new TreeSet(new MyComparator());   //sort by MyComparator rule
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		S.o.u.t(t1);		// [Bob—200, Chanel—50, Nathan—100, Vena—150 ]
	}
}
Class Employee implements Comparable {
	String name;
	int eid;
	Employee(String name, int eId) {
		this.name=name;
		this.eId=eId;	 }
publicString toString() {
	return name+ “ — “ +eId; }

public int compareTo(Objet o) {
	int eId1 = this.eId;
	Employee e=(Employee)o;
	int eid2 = e.eid;
	if(eId1 < eId2) {  return -1  }		//sort by ID number Descending order
	else if (eId1 >  eId2) {  return 1  }
	else return  0;
	}	
}
class MyComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;	
		Employee e2 = (Employee)o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);    //create Rule to sort alphabetically
	}
}


Comparable			VS	Comparator
Default Sorting Order			Customized Sorting Order
compareTo() only method			compare(), equals() 2 methods.
String n Wrapper classes impl		Collator n RuleBasedCollator impl.

*/
