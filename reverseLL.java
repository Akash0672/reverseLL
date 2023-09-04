public class reverseLL
{
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
        Node head=null;
        Node tail=null;

        public void insert(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
                return;
            }
            else
            {
                tail.next=newNode;
                tail=newNode;
                return;
            }

        }

        public void reverseIterate()
        {
            System.out.println("");
            if(head==null || (head==tail))
            {
                return;
            }
        
            
                Node previousNode=head;
                Node currentNode=head.next;

                while(currentNode!=null)
                {
                    Node nextNode=currentNode.next;
                    currentNode.next=previousNode;

                    previousNode=currentNode;
                    currentNode=nextNode;
                }

                head.next=null;
                head=previousNode;
        }
        
        public void display()
        {
            if(head==null)
            {
                System.out.println("List Empty");

            }
            else
            {
                Node temp=head;
                while(temp!=null)
                {
                    System.out.print(temp.data+"->");
                    temp=temp.next;
                }
            }
        }
    

        public static void main(String args[])
        {
            reverseLL list=new reverseLL();
            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.insert(40);
            list.insert(50);

            list.display();

            list.reverseIterate();
            list.display();
        }
}