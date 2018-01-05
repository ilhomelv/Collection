/*

The Three Cursors of JAVA - Used to get object one by one from the Collections 
Enumeration	Used to get Objects one by one from ONLY Legacy Collection Object.
Iterator		Used to get Obj. one by one from any Coll. Object.
ListIterator	Used

Enumeration Constructor:	Enumeration e=v.elements();
Enumeration Methods:	boolean hasmoreElements();    Object nextElement();

Limitations of Enumeration is that its applicable to ONLY in LEGACY classes, 
We can get only read access, and we can NOT perform remove operation,  retrieves 
data to forward direction only, can not go backward.

example:	print even numbers only 
Vector v =new Vector();
for (int i=0; i<=10; i++) {
	v.addElement(i);
}
S.o.u.t(v);		//[0,1,2,3,4….10]
Enumeration e=v.elements();
while(e.hasMoreElements()) {
	Integer i= (Integer)e.nextElement();
	if(i%2==0)  {	S.o.u.t(i);   }		// 0 2 4 6 8 10
}
S.o.u.t(v);		[0,1,2,3….10]

			
Iterator Constructor  Iterator it = Obj.iterator();    creates iterator from Collection object
Iterator Methods:   boolean hasNext();   Object next();   void remove();
Limitation of Iterator: Iterator can iterate forward direction only, can not go backward.

example:	print even numbers only
ArrayList aL = new ArrayList();
for (int i=0; i<=10; i++) {
	aL.add(i);
}
S.out(aL);		//[0,1,2…10]
Iterator it = aL.iterator();
while(it.hasNext()) {
	Integer i=(Integer)it.next ();
	if(i%2==0) {  S.o.ut(i); 	   }	// 0 2 4 6 10
	else {    it.remove();   }
}
S.o.u.t(aL);		//[0,2,4,6,8,10]


ListIterator is applicable ONLY for LIST Objects, List Iterates to Both Direction, 
ListIterator is Child interface of Iterator interface, hence All Iterator methods are 
available in ListIterator.
ListIterator Constructor:  ListIterator it = ListObj.ListIterator();   creates ListIterator object
ListIterator Methods:	(forward movement) boolean hasNext();    Object next();    int nextIndex();
(backward movement) boolean hasPrevious();    Object previous();  int previousIndex();
void add(Object o);   void remove();   void set(Object o);

example:
LinkedList list = new LinkedList();
list.add(“BOB”);
list.add(“Venn”);
list.add(“Chanel”);
list.add(“Matt”);
S.out(list);				// [ BOB, Venn, Chanel, Matt ]
ListIterator it= list.listIterator();
while (it.hasNext()) {
	String s = (String)it.next();
	if(s.equals(“Venn”))  {
		it.remove();		// [ BOB, Chanel, Matt ]
	}
	else if(s.equals(“Chanel”)) {
		it.add(“Sharon”);	// [BOB,Chanel, Matt, Sharon ]
	}
	else if (s.equals(“Chanel”)) {
		it.set(“Sally”);	// [BOB, Sally, Matt, Sharon]
	}
}
S.ou.t.(l)  // [BOB, Chanel, Matt, Sharon]


Enumeration				            Iterator		                ListIterator
Use only for legacy classes		Use for any Collection obj	Only for List objects
Moves forward direction		    Moves forward direction   	Moves both directions
Read only operation			      Read and remove		          Read, remove, Replace, add
By using Vector Class			    By Using Iterator()		      By using ListIterator()
hasMoreElements()			        hasNext(), next()		        9 methods.
nextElement()				          remove()



*/
