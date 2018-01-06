/*

Comparable Interface
    Used for default natural sorting order, then Objects MUST be 
    Homogeneous and MUST implement Comparable. 
		String Class and All Wrapper Classes implement Comparable interface.
		StringBuffer Class does NOT implement Comparable interface, CCE be thrown.

Comparable Interface   present in java.lang and has has only one method
public int compareTo()

Object Obj1.CompareTo(Object Obj2)  //Obj1 is being compared to already existing Obj2	
Obj1 has to comes before Obj2, then returns -1
Obj1 has to comes after Obj2, then returns +1
Obj1 equals Obj2, then returns 0

example:
public static void main(String[] args) {
	S.o.u.t (“A”.compareTo(“Z”));	//  returns -1
	S.o.u.t (“Z”.compareTo(“K”));	//  returns +1
	S.o.u.t (“A”.compareTo(“A”));	//  returns 0
	S.o.u.t (“A”.compareTo(null));	//  returns NPException
}

Relation between TreeSet and compareTo()  is that While inserting Objects into TreeSet, 
internally JVM calls compareTo() default sorting order automatically.

Comparable VS Comparator, if Default sorting order is not available, or we are not 
satisfied with default sorting order, then we can go for Customized sorting by using Comparator.





*/
