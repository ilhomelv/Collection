/*

NavigableSet interface 
                is a child of SortedSet, SortedSet is child of Set, Set is child of
                Collection.  
                
NavigableSet methods
floor(e)          returns highest element which is <= e
higher(e)         returns lowest element which is < e
ceiling(e)        returns lowest element which is >= e
higher(e)         returns lowest element which is > e
pollFirst()       remove and return first element
pollLast()        remove and return last element
descendingSet()   returns NavigableSet in reverse order

example:
class NavigableDSetDemo {
  public static void main(String[] args) {
	TreeSet<Integer> t = new TreeSet<Integer>();
	t.add(1000);
	t.add(2000);
	t.add(3000);
	t.add(4000);
	t.add(5000);
	System.out.println(t);			//[1000, 2000, 3000, 4000, 5000]
	System.out.println(t.ceiling(2000)); 	//2000
	System.out.println(t.higher(2000);	//3000
	System.out.println(t.floor(3000));	//3000
	System.out.println(t.lower(3000));	//2000
	System.out.println(t.pollFirst());	//1000
	System.out.println(t.descendingSet());	//[4000, 3000, 2000, 1000]
	System.out.println(t);			//[2000, 3000, 4000]

   }
}




*/
