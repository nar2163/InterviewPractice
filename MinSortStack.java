import java.util.*;

public class MinSortStack{

    Deque<Integer> sortedStack;
    Deque<Integer> minTempStack;

    public MinSortStack(){

        this.sortedStack = new ArrayDeque<Integer>();
        this.minTempStack = new ArrayDeque<Integer>();

    }

    public void pushMin(int x){

        if(sortedStack.isEmpty()){
            sortedStack.push(x);
        } else if (x < sortedStack.peek()){
            sortedStack.push(x);
        } else {
            while(!sortedStack.isEmpty() && x > sortedStack.peek()){
                minTempStack.push(sortedStack.pop());
            }
            sortedStack.push(x);
            while(!minTempStack.isEmpty()){
                sortedStack.push(minTempStack.pop());
            }
        }

    }

    public int popMin(){
        if(!sortedStack.isEmpty()){
            return sortedStack.pop();
        } else {
            return -1;
        }
    }


}