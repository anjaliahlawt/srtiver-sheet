//create a node in linked list

//package LinkedList;

class Node
{
   int value;
   Node next;
   Node(int x)
   {
    value=x;
    next=null;
   }
}
public class l1 
{  
    public static void main(String[] args) 
    { 
        Node Head;                                                                                            
        Head =new Node(4);
        System.out.println(Head.value);
        System.out.println(Head.next);
    }
}