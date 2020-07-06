import java.util.*;

public class ShelterStacks{

    LinkedList<ShelterOccupants> cats;
    LinkedList<ShelterOccupants> dogs;
    LinkedList<ShelterOccupants> oldestAll;

    public ShelterStacks(){

        this.cats = new LinkedList<ShelterOccupants>();
        this.dogs = new LinkedList<ShelterOccupants>();
        this.oldestAll = new LinkedList<ShelterOccupants>();
    }

    public void dropOff(ShelterOccupants animal){
        if(animal.getTypeInt() == 1){
            dogs.offer(animal);
            oldestAll.offer(animal);
        } else {
            cats.offer(animal);
            oldestAll.offer(animal);
        }
    }

    public ShelterOccupants adopt(int choice){

        LinkedList<ShelterOccupants> temp = new LinkedList<ShelterOccupants>();
        ShelterOccupants adoptee = oldestAll.poll();

        if(choice == 0){
            if(adoptee.getTypeInt() == 1){
                dogs.poll();
            } else {
                cats.poll();
            }

            return adoptee;

        } else if(choice == 1 && adoptee.getTypeInt() == 1){
            dogs.poll();
            return adoptee;
        } else if(choice == 0 && adoptee.getTypeInt() == 0){
            cats.poll();
            return adoptee;
        }
        else if(choice == 1 && adoptee.getTypeInt() == 0){
            while(adoptee.getTypeInt() == 0){
                temp.offer(adoptee);
                adoptee = oldestAll.poll();
            }
            dogs.poll();
            while(!temp.isEmpty()){
                oldestAll.offer(temp.poll());
            }
            return adoptee;
        } else {
            while(adoptee.getTypeInt() == 1){
                temp.offer(adoptee);
                adoptee = oldestAll.poll();
            }
            cats.pop();
            while(!temp.isEmpty()){
                oldestAll.offer(temp.poll());
            }
            return adoptee;
        }


    }

    public boolean isEmpty(){
        if(oldestAll.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

}
