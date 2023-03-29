/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    Node head=null;
    Node tail=null;
    class Node{
        int data;
        Node next;
        Node prev;
        
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    
    public void addfirst(int data){
        Node newNode=new Node(data);
        Node trv=head;
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            head.prev=null;
            
            while(trv.next!=null){
            trv=trv.next;
        }
         tail=trv;
            
            
        }
    }
    
    public void addlast(int data){
        Node newNode =new Node(data);
        Node currNode=head;
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;
            newNode.prev=currNode;
            tail=newNode;
        }
    }
    
    public void deletefirst(){
        if(head==null){
            System.out.print("Empty");
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    
    public void deletelast(){
        if(head==null){
            System.out.print("Empty");
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
    }
    
    public int count(){
        Node curr=head;
        int c=0;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        return c;
    }
    
    public void addbtw(int data, int pos){
        int c=count();
        if(pos>=c){
            addlast(data);
        }
        else{
           Node newNode=new Node(data);
        Node trs=head;
        Node ftr=head.next;
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            for(int i=1;i<pos;i++){
                trs=trs.next;
                ftr=ftr.next;
            }
            trs.next=newNode;
            newNode.prev=trs;
            newNode.next=ftr;
            ftr.prev=newNode;
        } 
        }
        
    }
    
    public void deletebtw(int pos){
        int c=count();
        if(pos==1){
            deletefirst();
        }
        else if(pos==c){
            deletelast();
        }
        else{
            if(pos>=c){
                System.out.print("Invalid position");
            }
            else{
               Node currNode=head.next;
               Node prevNode=head;
               Node nextNode=currNode.next;
               for(int i=1;i<pos-1;i++){
                currNode=currNode.next;
                prevNode=prevNode.next;
                nextNode=nextNode.next;
               }
                prevNode.next=nextNode;
                nextNode.prev=prevNode;
                currNode.next=null;
                currNode.prev=null;
            }
        }
    }
    
    public void printfromhead(){
        if(head==null){
            System.out.print("Empty");
        }
        System.out.println();
        Node currNode=head;
        System.out.print("null");
        while(currNode!=null){
            System.out.print("<-"+currNode.data +"->");
            currNode=currNode.next;
        }
        System.out.print("null");
    }
    
    public void printfromtail(){
    if(head==null){
        System.out.println("Empty");
    }
        Node tailcpy=tail;
        System.out.println();
        System.out.print("null");
        while(tailcpy!=null){
            System.out.print("<-"+tailcpy.data +"->");
            tailcpy=tailcpy.prev;
        }
        System.out.print("null");
    }
	public static void main(String[] args) {
		Main ob=new Main();
		ob.addfirst(10);
		ob.addfirst(20);
  		ob.addlast(30);
  		ob.addlast(40);
  		ob.deletefirst();
  		ob.deletelast();
       	ob.addbtw(70,7);
       	ob.deletebtw(3);
		ob.printfromhead();
		ob.printfromtail();
	}
}
