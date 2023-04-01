public class LLrev {
    Node head=null;
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     void addfirst(int data){
        Node newNode=new Node(data);
         if(head==null){
            head=newNode;
         }
         else{
            newNode.next=head;
            head=newNode;
         }
     }

     void addlast(int data){
        Node newNode=new Node(data);
         if(head==null){
            head=newNode;
         }
         else{
            Node currNode=head;
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;
         }
     }

     void deletefirst(){
        if(head==null){
            System.out.print("Empty");
         }
         else{
            head=head.next;
         }
     }

     void deletelast(){
        if(head==null){
            System.out.print("Empty");
         }
         else if(head.next==null){
            head=null;
         }
         else{
            Node lastNode=head.next;
            Node slastNode=head;
            while(lastNode.next!=null){
                lastNode=lastNode.next;
                slastNode=slastNode.next;
         }
         slastNode.next=null;
         }
     }

     void reverseiter(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode.next!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            prevNode=currNode;
            currNode=nextNode;
        }
        currNode.next=prevNode;
        head.next=null;
        head=currNode;
     }

     void printlist(){
        if(head==null){
            System.out.print("Empty");
         }
         else{
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data +"->");
                currNode=currNode.next;
            }
         }
     }

     public static void main(String args[]){
        LLrev ob=new LLrev();
        ob.addfirst(4);
        ob.addfirst(3);
        ob.addfirst(2);
        ob.addfirst(1);
        ob.addlast(5);
        ob.addlast(6);
        ob.addlast(7);
        ob.addlast(8);
        ob.deletefirst();
        ob.deletelast();
        ob.reverseiter();
        ob.printlist();
     }
}
