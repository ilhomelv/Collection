/*

Collections Class	defines several methods for Collection objects, like sorting, 
			      searching, reversing,  etc Also Known as Collections utility class.

Collections Class has Two Methods for Sorting elements for List:
public static void sort(List L)	Sorts based on default sorting order.
				Numbers ascending order and String alphabetical order, 
				List MUST contain homogeneous and comparable objects. 
				List MUST not contain NULL, NPE thrown.
public static void sort(List L, Comparator c) Sorts based on our Customized order,

example:
ArrayList a = new ArrayList();
a.add(“z”);
a.add(“a”);
a.add(“k”);
a.add(“n”);
//a.add(new Integer(10));;	//CCException   only homogeneous same type objects allowed
//a.add(null);			//NPException  null insertion NOT allowed
S.o.u.t(a+”before sorting”);		// [z,a,k,n]	//insertion order preserved
Collections.sort(a);					
S.o.u.t(a+”after sorting”);		// [a,k,n,z]	//default sorting order





*/
