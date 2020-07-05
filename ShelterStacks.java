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
            dogs.push(animal);
            oldestAll.push(animal);
        } else {
            cats.push(animal);
            oldestAll.push(animal);
        }
    }

    public ShelterOccupants adopt(int choice){

        LinkedList<ShelterOccupants> temp = new LinkedList<ShelterOccupants>();
        ShelterOccupants adoptee = oldestAll.pop();

        if(choice == 0){
            if(adoptee.getTypeInt() == 1){
                dogs.pop();
            } else {
                cats.pop();
            }

            return adoptee;

        } else if(choice == 1 && adoptee.getTypeInt() == 1){
            dogs.pop();
            return adoptee;
        } else if(choice == 0 && adoptee.getTypeInt() == 0){
            cats.pop();
            return adoptee;
        }
        else if(choice == 1 && adoptee.getTypeInt() == 0){
            while(adoptee.getTypeInt() == 0){
                temp.push(adoptee);
                adoptee = oldestAll.pop();
            }
            dogs.pop();
            while(!temp.isEmpty()){
                oldestAll.push(temp.pop());
            }
            return adoptee;
        } else {
            while(adoptee.getTypeInt() == 1){
                temp.push(adoptee);
                adoptee = oldestAll.pop();
            }
            cats.pop();
            while(!temp.isEmpty()){
                oldestAll.push(temp.pop());
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
