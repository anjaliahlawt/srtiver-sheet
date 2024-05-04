//Insert Node at beginning of Linked List

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

public class l2 
{
   public static void main(String[] args)
   {
      Node Head=null;
      Head=insertvalue(4,Head);
      Head=insertvalue(5,Head);
      Head=insertvalue(6,Head);
      Head=insertvalue(8,Head);
      System.out.println("linked list before inserting 0 at begining");
      printvalue(Head);
      Head=insertvalue(0,Head);
      System.out.println("after insering 0 at begining");
      printvalue(Head);

   }
   
   static Node insertvalue(int value,Node Head)
   {
     Node newnode=new Node(value);
     newnode.next=Head;
     Head=newnode;
     return Head; 
   }

   static void printvalue(Node Head)
   {
     Node curr=Head;
     while(curr!=null)
     {
        System.out.print(curr.value+"-->");
    
        curr=curr.next;
    }
     System.out.println("null");
     
   }
}

