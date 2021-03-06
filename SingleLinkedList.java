public class SingleLinkedList {

    public Node head;
    public int size = 0;

    public void insert(int data){

        if(this.head == null){
            this.head = new Node();
            this.head.data = data;
            this.size = this.size + 1;
            return;
        }

        Node insert_node = new Node();
        insert_node.data = data;
        Node findTail = this.head;

        while(findTail.next != null){
            findTail = findTail.next;
        }

        findTail.next = insert_node;
        this.size = this.size + 1;

    }

    public void delete(int data){

        if(this.head == null){
            return;
        }

        Node findNode = this.head;
        Node prevNode = new Node();

        while(findNode.next != null && findNode.next.data != data){
            prevNode = findNode;
            findNode = findNode.next;
        }

        if(findNode.next.next != null && findNode.next.data == data){
            findNode.next = findNode.next.next;
        } else if(findNode.next == null){
            findNode = prevNode;
        }


    }

    public void printList(){

        if(this == null){
            return;
        }

        Node n = this.head;

        while(n.next != null){
            System.out.println(n.data);
            n = n.next;
        }

        if(n.next == null){
            System.out.println(n.data);
        }
    }
}