
class MyLinkedList{
	private int data;
	private Node head=null;
	
	private class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	void insertAtBeg(int value){
		if(head==null){
			head=new Node(value);
			head.next=null;
		}else{
			Node temp;
			temp=new Node(value);
			temp.next=head;
			head=temp;
		}
	}
	
	void iterable(){
		if(head==null){
			System.out.println("LinkedList is Empty");
		}else{
			Node temp=head;
			while(temp!=null){
				System.out.println(temp.data+"\t");
				temp=temp.next;
			}
		}
	}
}

public class MyLinkedListApplication{
	public static void main(String x[]){
		MyLinkedList lis=new MyLinkedList();
		lis.insertAtBeg(10);
		lis.insertAtBeg(20);
		lis.insertAtBeg(30);
		lis.insertAtBeg(40);
		
		lis.iterable();
	}
}