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



This FORMULA can represent the result index of Elements in List:
Successful search results range: 0 to n-1, n is number of elements in List
Unsuccessful search results range: -(n+1) to -1
Total result range:	-(n+1) to n-1


reverse()  VS 	reverseOrder()
public static void reverse(List l)	Collections class has such method to reverse oder of
					elements of the given List,
example:
ArrayList l = new ArrayList();
l.add(15);
l.add(0);
l.add(20);
l.add(10);
l.add(5);
S.o.u.t(l);		// [15,0,20,10,5]
Collections.reverse(l);				//reverses elements order of list
S.o.u.t(l);		// [5,10,20,0,15]

reverseOrder() is used to reverse order of comparator objects
Comparator c1 = Collections.reverseOrder(Comparator c);
					//c ascending order, c1 be descending order




Arrays	Class is a utility class, and provides several utility methods for array obj.
		Arrays must have fixed size, Arrays holds the similar data type elements ONLY
		Arrays can hold Same type Primitives Only or Same Type Array Objects Only.
		Arrays once created can NOT be increased nor decreased by their size.
		Arrays use less memories, high performance.

Arrays Class Methods	
public static void sort(primitive[ ] p) 		Sorts Primitive Arrays in default sorting order
public static void sort(Object[ ] o)			Sorts Object Arrays in default sorting order
public static void sort(Object[ ] o, Comparator c)	Sorts by Comparator order

example1: Sort int Primitive Arrays by default order and print
	int[ ] a = {10, 5, 20, 11, 6};
	for(int a1 : a ) {	
		S.o.u.t(a1);	//10, 5, 20, 11, 6   primitive arrays before sorting
		}
	Arrays.sort(a);		//sort by default order
	S.o.u.t(a1);		//5,6,10,11,20		primitive arrays after sorting

example2:  Sort String Array Objects by Default order and print
	String [ ] s = {“A”, ”Z”, ”B”};
	for(String a2 : s) {
		S.o.u.t(a2);	// A, Z, B
	}
	Arrays.sort(s);
	for(String a1 : s ) {
		S.o.u.t(a1);	//A,B,Z	 String Object Arrays after Default sorting
	}
//Sort by Customized reverse order and print
	Arrays.sort(s, new MyComparator());
	for(String a1 : s ) {
		S.o.u.t(a1);	//Z,B,A	 String Object Arrays sorting by Comparator
	}
class MyComparator implements Comparator {
	public String compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);	//returns reverse alphabet order
	}	
}



Arrays Class Binary Search Elements Methods:
public static int binarySearch(primitive[ ] p, primitive target)
public static int binarySearch(Object[ ] a, Object target)
public static int binarySearch(Object[ ] a, Object target, Comparator c)
	
***All rules of Arrays Class BinarySearch methods are exactly same as 
Collections Class BinarySearch methods

example1:
int[ ] a = {10,5,20,11,6};
Arrays.sort(a);		//sort by default order
S.o.ut(Arrays.binarySearch(a,6));		//1
S.o.u.t(Arrays.binarySearch(a,14);		//-5

example2: Sort by default order and print 
String[ ] s ={“A”,”Z”.”B”};
Arrays.sort(s);
S.o.u.t(binarySearch(s,”Z”));			//2	
S.o.u.t(binarySearch(s,”S”));			//-3
Sort by Customized order and print
Arrays.sort(s, new MyComparator());
S.o.u.t(binarySearch(s,”Z”, new MyComparator()));	//0
S.o.u,t(binarySearch(s,”S”, new MyComparator()));	//-2		//reverse sort order 
S.o.u.t(binarySearch(s,”N”);	//wrong result,  because new MyComparator is missing
class MyComparator implements Comparator {
	public int compare(Object o1, Object o2) {
	String s1 = o1.toString();
	String s2 = 02.toString();
	return s2.compareTo(s1);
	}
}


View Arrays as List
public static List asList(Object a)	simply VIEWS the Array Objects as List Objects.
	Replacing Array elements with List reference is OK, But resizing the size is NOT
	possible thru List reference, because Arrays have fixed size. 
	Adding Heterogeneous Objects is NOT possible using List Reference, because the 
	base internally is still Arrays, and Arrays can not hold Heterogeneous objects.

Convert Collection to Array
public Object[] a = Coll.toArray();

example:
String[ ] s ={“A”, “Z”, “B”};
List l = Arrays.asList(s);		// if used static import then no need for word Arrays.
S.o.u.t(l);			//[A,Z,B]
s[0] = “K”;
S.o.u.t(l);			//[K,Z,B]
l.set(1,”L”);
for(String s1:s)
S.o.u.t(s1);			//K,L,B
//l.add(“David”);		//UsOException
//l.remove(2);			//UException
//l.set(1, new Integer(10));	//AStoreException




*/
