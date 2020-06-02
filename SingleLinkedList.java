public class SingleLinkedList{

    //only works with Integers!

    Integer data = null;
    SingleLinkedList next = null;
    int size = 0;

    SingleLinkedList() {

    }

    SingleLinkedList(int data){
        this.data = data;
        this.next = null;
    }

    public SingleLinkedList insert(int data){

        SingleLinkedList insert_node = new SingleLinkedList(data);

        if(this.data == null){
            SingleLinkedList head = new SingleLinkedList(data);
            this.size = this.size + 1;
            return head;
        }

        SingleLinkedList findTail = this;

        while(findTail.next != null){
            findTail = findTail.next;
        }

        findTail.next = insert_node;
        this.size = this.size + 1;

        return this;

    }

    public void delete(int data){

        if(this == null){
            return;
        }

        SingleLinkedList findNode = this;

        while(findNode.next != null && findNode.next.data != data){
           findNode = findNode.next;
        }


    }

    public void printList(){

        if(this == null){
            return;
        }

        SingleLinkedList n = this;

        while(n.next != null){
            System.out.println(n.data);
            n = n.next;
        }

        if(n.next == null){
            System.out.println(n.data);
        }
    }
}