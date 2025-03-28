import java.util.*;
public class StackQueue
{
   	public static void main (String[] args)
   	{
     
     		Stack s=new Stack();
     		s.push(10);
     		s.push(20);
     		s.push(30);
     		System.out.println("Stack after inserting a elements:"+s);
     		System.out.println("Popped element from stack:"+s.pop());
     		System.out.println("After Deletion:"+s);
     		Queue q=new LinkedList<>();
     		q.add(10);
     		q.add(20);
     		q.add(30);
     		System.out.println("Queue after inserting a elements:"+q);
		System.out.println("Removed element from queue: " + q.poll());
        	System.out.println("Queue after deletion: " + q);
	}
}