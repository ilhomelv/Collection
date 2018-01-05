/*
VECTOR - resizable/ growable array, insertion order preserved, Duplicates are allowed, 
	Heterogeneous allowed, Null insertion is allowed, implements Serializable & Cloneable.
	And implements RandomAccess interface, every method is synchronized ThreadSafe.

Four constructors
Vector v =new Vector(); creates empty vector object with default init. capacity, 10
Vector v =new Vector(int  initCapacity); creates an empty vector object with specified init. cpty.
Vector v = new Vector(int initCapacity, int incrementalCapacity);  creates an empty vector object 
					with specified init. capacity and increments as specified.
Vector v = new Vector(Collection c); creates equivalent vector object for the given collection.

VECTOR specific methods, can ONLY be applied on Vector:
addElement(Object o)
removeElement(Object o)
removeElementAt(int index)
removeAllElements()
firstElement()
lastElement()
int size()
int capacity()
Enumeration elements()

example:
Vector v=new Vector();
S.o.u.t. (v.capacity());		//10 by default vector capacity is 10
for(int i=1; i<=10; i++) {
v.addElement(i);
}
S.o.u.t. (v.capacity()); 		//10
v.addElement(“A”);
S.o.u.t.(v.capacity());		//20	vector double capacity automatically when 11th element 
					added to it
S.o.u.t.(v);			//[1,2,3,4,5,6,7,8,9,0,10,A]	





*/
