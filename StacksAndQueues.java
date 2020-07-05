import java.util.*;


public class StacksAndQueues{

    public static void main(String[] args){

//        TwoStackQueue myQueue = new TwoStackQueue();
//
//        myQueue.enqueue(1);
//        myQueue.enqueue(2);
//        myQueue.enqueue(3);
//        myQueue.enqueue(4);
//        myQueue.enqueue(5);
//
//        System.out.println(myQueue.dequeue());
//        System.out.println(myQueue.dequeue());
//        System.out.println(myQueue.dequeue());
//        System.out.println(myQueue.dequeue());
//        System.out.println(myQueue.dequeue());
//        System.out.println(myQueue.dequeue());
//        System.out.println(myQueue.dequeue());
//        System.out.println(myQueue.dequeue());

        MinSortStack sortedStack = new MinSortStack();

        sortedStack.pushMin(10);
        sortedStack.pushMin(2);
        sortedStack.pushMin(8);
        sortedStack.pushMin(5);
        sortedStack.pushMin(15);

        System.out.println(sortedStack.popMin());
        System.out.println(sortedStack.popMin());
        System.out.println(sortedStack.popMin());
        System.out.println(sortedStack.popMin());
        System.out.println(sortedStack.popMin());
        System.out.println();
        System.out.println(sortedStack.popMin());


    }




}