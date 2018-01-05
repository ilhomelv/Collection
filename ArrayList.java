/*
ArrayList 
(ArrayList is subclass of List, List is Child of Collection Interface)

ArrayList - resizable / Growable, duplicates OK, 
	Heterogeneous objects are ok, Duplicate objects are OK,
	Insertion order is preserved, NULL insertion is OK.
	ArrayList is worst choice for insertion or deletion in the middle of collection.
	
Three Constructors:
ArrayList arr = new ArrayList(); 	
ArrayList arr = new ArrayList(int initialCapacity);	- creates empty ArrayList Object with 
							specified initial capacity
ArrayList arr = new ArrayList(Collection c);		-creates empty ArrayList of Collection 
Object for the given collection, Create ArrayList Collection from Another Collection.
example:
ArrayList arr = new ArrayList();
arr.add(“A”);
arr.add(10);
arr.add(“A”);
arr.add(null);
System.out.println(arr);	//[A,10,A,null]
arr.remove(2);
System.out.println(arr);	//[A,10,null]
arr.add(2,”M”);
arr.add(“N”);
System.out.println(arr:);	//[A,10,M,null,N]

In every Collection Object System.out.print(arr) calls toString() which prints objects inside  [ ]
Every Collection class by default implements Serializable and Cloneable interfaces
ArrayList and Vector Class implements RandomAccess interface, RA interface is a marker interface and it is  present in java.util package and it does not contain any methods, all required ability will be provided automatically by JVM.








*/
