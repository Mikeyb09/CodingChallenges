package root.weekly_challenges;

import java.util.LinkedList;

import org.w3c.dom.Node;

/*
 * Intersection: Given two (singly) linked lists, determine if the two lists intersect. 
	Return the intersecting node. Note that the intersection is defined based on reference, 
	not value. That is, if the kth node of the first linked list is the exact same 
	node (by reference) as the jth node of the second linked list, then they are intersecting.
 */

public class LinkedListIntersection {
	
	LinkedListIntersection(){}
	
	public static String isIntersecting(LinkedList<String> list1, LinkedList<String> list2){
		
		String result = null;
		
		for(int i = 0; i < list1.size(); i++) {
			for(int j = 0; j < list2.size(); j++) {
				if(list1.get(i).equals(list2.get(j))) {
					result = list1.get(i);
				}
			}
		}
		
		return result;
		
	}

}
