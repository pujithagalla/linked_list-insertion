package datstruct;

public class Listnsertion {
	Node head;
	int count=0;
	
	
	 static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next= null;
		}
	 }
		public void pushfront(int new_data){
			
	Node new_node= new Node(new_data);
	new_node.next=head;
	head=new_node;

	
		}
		public void pushafternode(int pos,int new_data){
		
			Node pre_node;
			
			pre_node=head;
			while(count<pos-1){
			pre_node=pre_node.next;
			count++;
			}
			Node new_node= new Node(new_data);
			new_node.next=pre_node.next;
			pre_node.next=new_node;	
			
			
		}
	public void pushend(int new_data){
		Node new_node=new Node(new_data);
        if(head==null){
        	head=new Node(new_data);
        	return;
        }
        new_node.next=null;
        Node last=head;
        while(last.next!=null)
        	last=last.next;
        	last.next=new_node;
        
       
        	return;
        
	}
        public void printlist()
        {
        Node tnode=head;
        while(tnode!=null)
        {
        	System.out.println(tnode.data+" ");
        	tnode=tnode.next;
        }
        	
	    }
        public static void main(String args[])
        {
        	Listnsertion ln=new Listnsertion();
        	ln.pushfront(1);
        	ln.pushfront(4);
        	ln.pushfront(8);
        	ln.pushfront(10);
        	  ln.pushafternode(2,11);
        	ln.pushend(7);
        	System.out.println("created llist");
        	ln.printlist();
        	
        }
	}


