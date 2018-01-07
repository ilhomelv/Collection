/*

Collections Class	defines several methods for Collection objects, like sorting, 
			searching, reversing,  etc Also Known as Collections utility class.

Collections Class has Two Methods for Sorting elements for List:
public static void sort(List L)	Sorts based on default sorting order.
				Numbers ascending order and String alphabetical order, 
				List MUST contain homogeneous and comparable objects. 
				List MUST not contain NULL, NPE thrown.
public static void sort(List L, Comparator c) Sorts based on our Customized order,

example:
ArrayList a = new ArrayList();
a.add(“z”);
a.add(“a”);
a.add(“k”);
a.add(“n”);
//a.add(new Integer(10));;	//CCException   only homogeneous same type objects allowed
//a.add(null);			//NPException  null insertion NOT allowed
S.o.u.t(a+”before sorting”);		// [z,a,k,n]	//insertion order preserved
//Collections.sort(a);
//S.o.u.t(a+”after sorting”);		// [a,k,n,z]	//default sorting order
Collections.sort(a, new MyComparator());
S.o.u.t(a+”after sorting”);		// [z,n,k,a]	//customized sorting order

class MyComparator implements Comparator {
public int compare(Object o1, Object o2) {
	String s1= (String)o1;
	String s2=o2.toString();
	return s2.compareTo(s1);			//returns reverse alphabetical order
	}
}



Collections Class has Two Methods for Searching elements for List:
For Both Methods - Before calling binarySearch method, 
the List must be sorted otherwise the result will be unpredictably wrong.
public static int binarySearch(List l, Object target); //While using this method, 
The List Object Must be  Sorted by Default Sorting Order.
public static int binarySearch(List l, Object target, Comparator c); //While using this method, 
The List Object Must be Sorted by Customized Sorting Order.
 
Both Above Methods, Also known as Collections Class Binary Search Methods Because Search methods 
will be using internally BinarySearch algorithm concept.
Successful search returns index number, Unsuccessful search returns the insertion point.

insertion point:		-1	-2	-3	-4	-5	-6
target object:		A	K	M	Z	a
element index:		0	1	2	3	4	5

example1:	Sort by Default and Then Search Element Z and J
ArrayList a = new ArrayList();
a.add(“Z”);
a.add(“A”);
a.add(“M”);
a.add(“K”);
a.add(“a”);
s.o.u.t(a);			// [Z,A,M,K,a]
Collections.sort(a);
S.o.u.t(a);			// [A,K,M,Z,a]
S.o.u.t(Collections.binarySearch(a,”Z”));	//3	index of search target
S.o.u.t(Collections.binarySearch(a,”J”));	//-2	index insertion point



example2:	Sort by Customized order, and Then Search 10 and 13
ArrayList a = new ArrayList();
a.add(15);
a.add(0);
a.add(20);
a.add(10);
a.add(5);
s.o.u.t(a);		// [15,0,20,10,5]
Collections.sort(a, new MyComparator());
S.o.u.t(a);		// [20,15,10,5,0]	numbers in desc order

S.o.u.t(Collections.binarySearch(a,10, new MyComparator()));	//2 index number
S.o.u.t(Collections.binarySearch(a,13, new MyComparator()));	//-3 insertion point
S.o.u.t(Collections.binarySearch(a,17);	//unpredictable WRONG output be printed, 
				//because  new MyComparator()  is missing inside brackets
S.o.u.t(Collections.binarySearch(a,17, new MyComparator()));	//-2 insertion point

class MyComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return o2.compareTo(o1);		//returns numbers in descending order
	}
}


*/
