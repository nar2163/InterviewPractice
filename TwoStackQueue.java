import java.util.*;

public class TwoStackQueue{

        Stack<Integer> stack1;
        Stack<Integer> stack2;
        int size;

        public TwoStackQueue(){

            this.stack1 = new Stack<>();
            this.stack2 = new Stack<>();
            this.size = 0;
        }


        public void enqueue(int x){
            stack1.push(x);
            size++;
        }

        public int dequeue() {
            int temp;

            if (size > 0) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }

                temp = stack2.pop();

                while (!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }

                size--;
                return temp;
            } else {
                return -1;
            }
        }



        public boolean isEmpty(){

            if(stack1.isEmpty()){
                return true;
            } else {
                return false;
            }
        }
}