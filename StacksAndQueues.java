import java.util.*;


public class StacksAndQueues{

    public static void main(String[] args){

        TwoStackQueue myQueue = new TwoStackQueue();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());

    }

//    public void sortStack(Stack x){
//
//        Stack<Integer> smallStack = new Stack<>();
//        Stack<integer> bigStack = new Stack<>();
//        int temp;
//
//        while(!x.isEmpty()){
//            temp = x.pop();
//            if(smallStack.isEmpty() && bigStack.isEmpty()){
//                smallStack.push(temp);
//            } else if(smallStack.isEmpty() && !bigStack.isEmpty())
//
//        }

    }




}