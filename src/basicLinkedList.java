import java.util.*;
public class basicLinkedList {

public static Node<Integer> insert(Node<Integer> head,int data,int pos){
    Node<Integer> newNode=new Node<Integer>(data);
    if(pos==0){
        newNode.next=head;
        head=newNode;
        return head;
    }
    int i=0;
    Node temp=head;
    while (i!=pos-1){
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
    return head;
}






 // take Input method create LinkedList and return head of the list.
    public static Node<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=null , tail=null;
        System.out.print("Enter data: ");
        int data=sc.nextInt();
        while (data!=-1){
            Node<Integer> newNode=new Node<Integer>(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else {
                //        Node<Integer> temp=head;
                //       while (temp.next!=null){
                //            temp=temp.next;

                tail.next = newNode;
                tail = newNode;

                //temp.next=newNode;
            }
            System.out.print("Enter data:");
            data=sc.nextInt();
        }

    return head;
    }

   public static void print(Node<Integer> head){
       Node temp=head;
       while (temp !=null){
           System.out.println(temp.data);
           temp=temp.next ;
       }

   }







    public static void main(String[] args) {
        Node<Integer> node1=new Node<Integer>(5);
        //System.out.println(node1.data);
        //System.out.println(node1.next);
        Node<Integer> node2=new Node<Integer>(10);
        Node<Integer> node3=new Node<Integer>(15);
        Node<Integer> node4=new Node<Integer>(20);

    // connect the nodes->>>>>
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
    //print the linkedList->>>>>>>
  //  Node head=node1;
    Node<Integer> head=takeInput();
   head= insert(head,5,0);
    print(head);





    }
}
