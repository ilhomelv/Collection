/*
List (Child of Collection Interface)
Used to represent a group of individual objects as a single entity 
where duplicates are allow and insertion order MUST be preserved.

void add(int index, Object o)
boolean addAll(int index, Collection c)
Object get(int index)
Object remove(int index)
Object set(int index, Object new) - replaces the element present at specified index with 	
						provided Object and returns old object
int indexOf(Object o)	- returns index of first occurrence of O
int lastIndexOf(Object o)
ListIterator listIterator();

***List has 4 SubClasses: ArrayList Class, LinkedList Class, Vector, Stack
*/
