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



*/
