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
        
        Node(int data){
            this.data=data;
            this.next=null;
    }
    }
    
    public void addfirst(int data){
        Node newNode=new Node(data);
       if(head==null){
           head=newNode;
           tail=newNode;
           tail.next=head;
       }
       else{
            newNode.next=head;
            head=newNode;
            tail.next=head;
       }
    }
    
    public void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
        }
        else{
            Node trs=head;
            while(trs.next!=head){
                trs=trs.next;
            }
            trs.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }
    
    public int count(){
        if(head==null){
            return 0;
        }
        Node currNode=head.next;
        int c=1;
        while(currNode!=head){
            c++;
            currNode=currNode.next;
        }
        return c;
    }
    
    public void addbtw(int data,int pos){
        Node newNode=new Node(data);
        Node trs=head;
        Node trs2=head.next;
        int c=count();
        if(pos>c){
            addlast(data);
        }
        else if(pos==1 || pos<=0){
            addfirst(data);
        }
        else{
            for(int i=1;i<pos-1;i++){
                trs=trs.next;
                trs2=trs2.next;
            }
            trs.next=newNode;
            newNode.next=trs2;
            
        }
    }
    
    public void deletefirst(){
        if(head==null){
            System.out.print("Already a empty list");
        }
        else{
            head=head.next;
            tail.next=head;
        }
    }
    
    public void deletelast(){
         if(head==null){
            System.out.print("Already a empty list");
        }
        else{
            Node trs=head;
            Node trs2=head.next;
            while(trs2.next!=head){
                trs=trs.next;
                trs2=trs2.next;
            }
            tail=trs;
            tail.next=head;
        }
    }
    
    public void deletebtw(int pos){
        int c=count();
        if(head==null){
            System.out.print("Already a empty list");
        }
        else if(pos==1){
            deletefirst();
        }
        else if(pos>=c){
            deletelast();
        }
        else{
            Node currNode=head.next;
            Node prevNode=head;
            for(int i=1;i<pos-1;i++){
                currNode=currNode.next;
                prevNode=prevNode.next;
            }
            currNode=currNode.next;
            prevNode.next=currNode;
        }
    }
    
    public void print(){
        Node curr=head.next;
        System.out.print(head.data + "->");
        while(curr!=head){
            System.out.print(curr.data + "->");
            curr=curr.next;
        }
    }
	public static void main(String[] args) {
		Main ob=new Main();
		ob.addfirst(10);
		ob.addfirst(20);
	    ob.addlast(30);
	    ob.addlast(40);
	    ob.addlast(50);
	    ob.addbtw(60,7);
	//    ob.deletefirst();
	//    ob.deletelast();
	//    ob.deletebtw(7);
		ob.print();
	//	System.out.println(ob.count());
	}
}
