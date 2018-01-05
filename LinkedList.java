/*

LinkedList 	Great for insertion and deletion of element in the middle of collection. 
		Retrieval operation on LinkedList is not recommended, because it is very slow 			
    performance. Insertion order is preserved, Duplicate Objects are allowed, 
		Heterogeneous objects are allowed. Null insertion is OK.
		LinkedList implements Serializable and Cloneable interfaces.

Two constructors
LinkedList lt= new LinkedList(); creates empty linked list
LinkedList lt = new LinkedList(Collection c); creates linked list for the given Collection c

Usually LinkedList used to develop Stacks and Queues, to provide support for this requirement 
LinkedList defines the following specific methods 
void addFirst(Object o),  
void addLast(Object o), 
Object getFirst(), 
Object getLast(), 
Object removeFirst(), 
Object removeLast().

example:
LinkedList lt = new LinkedList();
lt.add(“Tim”);
lt.add(30);
lt.add(null);
lt.add(“Tim”)   			//[Tim,30,null, Tim]
lt.set(0,”Sofa”);		//replace 0 index with Sofa   [Sofa, 30,null,Tim]
lt.add(0,”Viena”);		//Viena,Sofa,30,null,Tim
lt.removeLast();
lt.addFirst(“CCC”);
System.out.println(lt);		//[CCC,Veina, Sofa, 30, null]


ArrayList 		    VS 		LinkedList
retrieval is FAST			  insertion n deletion in middle is FAST
	









*/
