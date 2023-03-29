class LLadd{
    Node head=null;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    //add first
    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
        head=newNode;
        return;
        }
        else{
            newNode.next=head;
            head=newNode;
            return;
        }
    }

    public void addlast(int data){
        Node newNode=new Node(data);
        Node currNode=head;
        if(head == null){
        head=newNode;
        return;
        }
        else{
            while(currNode.next !=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;
        }
    }

    public void deletefirst(){
        if(head==null){
            System.out.print("Empty linked list");
        }
        else{
            head=head.next;
        }
    }

    public void deletelast(){
        if(head==null){
            System.out.print("Empty linked list");
        }
        else{
            Node last=head.next;
            Node slast=head;
            while(last.next!=null){
                last=last.next;
                slast=slast.next;
            }
            slast.next=null;
        }
    }

    void addbtw(int data,int dpos){
        Node newNode=new Node(data);
        Node currNode=head;
        if(head==null ){
            head=newNode;
        }
        while(currNode!=null){
            if(currNode.data==dpos){
                newNode.next=currNode.next;
                currNode.next=newNode;
                break;
            }
            currNode=currNode.next;
        }
        if(currNode==null){
            System.out.print("Element does not exist enter valid element");
        }
        return;
    }
    
    void deletebtw(int data){
        if(head==null){
            return;
        }
        else{
            if(head.data==data){
                head=head.next;
            }
            else{
            Node prevNode=head;
            Node currNode=head.next;
            while(currNode!=null){
                if(currNode.data==data){
                    prevNode.next=currNode.next;
                    currNode.next=null;
                    break;
                }
                currNode=currNode.next;
                prevNode=prevNode.next;
            }
            if(currNode==null){
                System.out.println("Element does not exist in list");
            }
            }
        }
    }

    public void Print(){
        Node currNode=head;
        if(head ==null){
            System.out.println("Empty Linked List");
        }
        while(currNode != null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }
    public static void main(String args[]){
        LLadd obj=new LLadd();
        // obj.addfirst(0);
        // obj.addfirst(1);
        // obj.Print();
        obj.addlast(10);
        obj.addlast(11);
        obj.Print();

         //obj.deletefirst();
        // obj.deletelast();
        // obj.Print();
    }
}