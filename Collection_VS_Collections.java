/*
Collection VS Collections

Collection Interface - Used when we to represent a group of single entity
Defines most commonly required methods
add(Object o)       add a particular object to a collection
addAll(Collection c)    adds all objects to a Collection
remove(Object o)    removes a particular object fromcollection
removeAll(Collection c)     remove a group of objects from collecton
clear()         clears - removes all objects from the collection
retainAll(collection c)   except this group of Object, all the remaining objects will be removed
contains(Object o)      checks if Collection contains object o
containsAll(Collection c)      checks if Collection contains group of c objects 
isEmpty()        checks if Collection is empty
int size()     returns size of objects in Collection
Object [] toArray()      converts Collection objects to array object
Iterator iterator()      gets an Object one by one from Collection

this methods can also be applied to List, Set, SortedSet..
there s no concrete class which implements Collection interface directly.
all Collection classes implement Serializable and Cloneable interfaces

Difference between Collection and Collections: 
Collection is an Interface, BUT Collections is a Class, defines utility methods for Collection 	
Objects




*/
