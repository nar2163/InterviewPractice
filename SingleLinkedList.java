public class SingleLinkedList{

    //only works with Integers!

    Node head;
    int size = 0;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static SingleLinkedList insert(SingleLinkedList currentList, int data){

        Node insert_node = new Node(data);
        insert_node.next = null;

        if(currentList.head == null){
            currentList.head = insert_node;
            currentList.size = currentList.size + 1;
            return currentList;
        }

        Node findTail = currentList.head;

        while(findTail.next != null){
            findTail = findTail.next;
        }

        findTail.next = insert_node;
        currentList.size = currentList.size + 1;

        return currentList;

    }

    public static void delete(SingleLinkedList currentList, int data){

        if(currentList.head == null){
            return;
        }

        Node findNode = currentList.head;

        while(findNode.next != null && findNode.next.data != data){
           findNode = findNode.next;
        }

        if(findNode.next != null && findNode.next.data == data){
            findNode.next = findNode.next.next;
            currentList.size = currentList.size - 1;
        } else if (findNode.next == null && findNode.data == data){
            currentList.size = currentList.size - 1;
        } else if (findNode.next == null && findNode.data != data){
            return;
        }

    }

    public static void printList(SingleLinkedList currentList){

        if(currentList.head == null){
            return;
        }

        Node n = currentList.head;

        while(n.next != null){
            System.out.println(n.data);
            n = n.next;
        }

        if(n.next == null){
            System.out.println(n.data);
        }
    }
}