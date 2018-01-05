/*

COLLECTIONS:	- growable, we can increase or decrease the size
	        - Col. can hold both homogeneous and heterogeneous elements
	        - every Col. class is implemented based on some standard data structure, hence 			
		for every requirement redeemed method support is available. being a 				
		programmer, we re responsible to use those methods. we re not responsible to 			
		implement those methods.
		- Collections can hold objects only
			
			

9 key interfaces of Collection Framework:
Collection - represent group of individual objects with a single entity
	there’s no concrete class which implements Collection interface directly
	******Difference between Collection and Collections: 
	Collection is Interface, BUT Collections is Class, defines utility methods for Collection 	
	Objects

List - represent group of individual objects has a single entity where duplicates allowed and 
insertion order must be preserved, in which order we added to memory - in the same order objects 
should be saved only. 
	List Classes:
	ArrayList Class
	LinkedList Class
	Vector (also knows as legacy class)
	Stack (aka legacy class)

Set - represent group of individual objects has a single entity where duplicates not allowed and 
insertions order not required. 
	Set Classes:
	HashSet Class
	LinkedHashSet Class

SortedSet - represent group of individual objects has a single entity where  duplicates not allowed, 
all objects must be inserted according to some sorting order.

NavigableSet - represent group of individual objects has a single entity where duplicates not allowed, 
contains several methods for navigation purposes.
	TreeSet Class

	LIST 			VS			 SET
	duplicates are OK				duplicates NOT ok
	insertion order preserved			insertion order NOT preserved

6. Queue - if we want to represent group of individual object prior (before) to processing, then 	
	we should go for queue. usually queue follows first in first out order, based on our 	
	requirement we can implement  our own priority order also. example: before sending 
	email, all email ids we have to store  in some data structure, in which order we added 
	email ids, in the same order only email should be delivered. For this requirement Queue 
	is best choice.
	PriorityQueue Class
	Blocking Queue Class
	LinkedBlocking Queue Class

***all above interfaces  - Collection, List, Set, SortedSet, NavigableSet, Queue - for individual group 
Objects ONLY
***all below interfaces are for Key-Value pair objects ONLY
7. Map is group of Objects has entry of  key-value pairs
	KEY			VALUE
	Tim			101
	John			102
	Cindy			103
	Jim			101	//OK    value duplicate is ok
	Jim			105	//NOT OK   key duplicate is not ok

keys can not have duplicates / values can have duplicates

MAP CLASSES:
HashMap Class
LinkedHashMap Class
WeakHashMap Class
IdentityHashMap Class
Hashtable Class
Properties Class

8. SortedMap represent group of key-value pair objects according to some sorting order of keys, 
	sorting MUST be based on keys only, values can not be sorted.

9. NavigableMap defines several methods for Navigation purposes
	TreeMap Class

*/
