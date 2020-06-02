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

    public void insert(int data){

        if(this == null){
            this.data = data;
            this.size = this.size + 1;
            return;
        }

        SingleLinkedList insert_node = new SingleLinkedList(data);
        SingleLinkedList findTail = this;

        while(findTail.next != null){
            findTail = findTail.next;
        }

        findTail.next = insert_node;
        this.size = this.size + 1;

    }

    public void delete(int data){

        if(this.data == null){
            return;
        }

        SingleLinkedList findNode = this;

        while(findNode.next != null && findNode.data != data){
           findNode = findNode.next;
        }

        if(findNode.next != null && findNode.data == data){
            findNode = findNode.next;
        } else if(findNode.next == null){
            findNode = null;
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