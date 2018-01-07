/*
Queue Interface is a Child of Collection, Used when email sending, sms sending etc
		From 1.5 LinkedList also implements Queue interface, LinkedList
		implementation follows First In First Out order.

Queue Interface Methods
Boolean offer(Object o)	adds object into Queue	
Object poll()		removes n returns head element, returns Null on empty Queue
Object remove()		removes n returns head element, returns NPE on empty Queue
Object peek()		returns head element
Object element()	returns head element


PriorityQueue is child of Queue, Used when All elements required to be inserted based on
some Priority ORDER, like Default sorting or Customized sorting.
		While using Comparable, All objects MUST be comparable and Homogeneous.
		While using Comparator, Objects can be Heterogeneous.
		Insertion order is NOT preserved, Duplicates n NULL is NOT allowed,

PriorityQueue Constructors
PriorityQueue q = new PriorityQueue();	//default init cap is 11, Default Sorting Order
PriorityQueue q = new PriorityQueue(int initCap);
PriorityQueue q = new PriorityQueue(int initCap, Comparator c);
PriorityQueue q = new PriorityQueue(SortedSet s);
PriorityQueue q = new PriorityQueue(Collection c);

example1:
	PriorityQueue q =new PriorityQueue();
	S.o.u.t(q.peek());		//returns null from empty queue
	S.o.u.t(q.remove());		//returns NSEException from empty queue
	for(int i=0; i<=10; i++) {	
		q.offer(i);	
	}
	S.o.u.t(q);			// [0,1,2,….10] 
	S.o.u.t(q.poll());		// [0] head element removed
	S.o.u.t(q);			// [1,2,3….10]




*/
