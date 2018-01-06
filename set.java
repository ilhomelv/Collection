/*
Set interface	is a child of Collection interface, Used to work with individual objects, 
where duplicates are NOT allowed and the insertion order NOT preserved.	
SET has no methods, so we have to use Collection Interface methods

HashSet	is a Child of Set,  
    has data structure of HashTable, null insertion is OK once only, 			
    heterogeneous objects are allowed, Duplicates are Not allowed.
    implements Serializable and Cloneable Interfaces. Best for Searching ops.

HashSet Constructors
HashSet h = new HashSet();	//default init capacity 16  //default fill ratio 0.75 
HashSet h = new HashSet(int initCapacity);
HashSet h = new HashSet(int initCapacity, float fillRatio);
HashSet h = new HashSet(Collection c); This Constructor meant for interconversion between Collection objects

Fill Ratio 0.75 means after filling 75% ratio -  a new HashSet object will be created automatically

example:
HashSet h = new HashSet();
h.add(“B”);
h.add(“C”);
h.add(“Z”);
h.add(null);
h.add(10);
S.o.u.t.(h.add(“Z”));	//false		duplicates are not allowed
S.o.u.t(h);		// [10, C, null, Z, B]	insertion order Not preserved

LinkedHashSet	is a child of HashSet, insertion order preserved, no duplicates allowed.
		it is exactly same as HashSet including Constructors and Methods, 
		except the Insertion order is preserved in LinkedHashSet
example:
LinkedHashSet h = new LinkedHashSet();
h.add(“B”);
h.add(“C”);
h.add(“Z”);
h.add(null);
h.add(10);
S.o.u.t.(h.add(“Z”));	//false		duplicates not allowed, returns boolean
S.o.u.t(h);		// [B, C, Z, null, 10]	insertion order preserved


HashSet               VS        LinkedHashSet
No duplicate objects		No duplicate objects
Insertion order Not preserved   Insertion order Preserved

SortedSet  interface is a child of Set, duplicates not allowed, Used to represent a 
group of individual objects according to some sorting order

SortedSet interface has 6 methods, only used for SortedSet
Object first()	returns first element of SortedSet
Object last()	returns last element of SortedSet		
SortedSet headSet(Object o)	returns elements < Obj
SortedSet tailSet(Object o)	returns elements >= Obj
SortedSet subSet(Obj o1, Obj o2) returns elements which are >= obj1 and < obj2
		
Comparator comparator()	returns Comparator object that describes underlying 
sorting technique. if we re using default sorting order, then we will get NULL.
Default sorting order for Numbers are Ascending order, for String Alphabet order.

example:
100,101,104,106,110,115,120
first() =>100
last() =>120
headSet(106) => [100,101,104]
tailSet(106) => [106,110,115,120]
subSet(101,115) => [101,104,106,110]







*/
