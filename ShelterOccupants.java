public class ShelterOccupants{

    int type;
    String name;

    public ShelterOccupants(){

    }

    public ShelterOccupants(int x, String name){
        this.type = x;
        this.name = name;
    }

    public int getTypeInt(){
        return type;
    }

    public String getTypeString(){
        if(type == 1){
            return "Dog";
        } else {
            return "Cat";
        }
    }

    public String getName(){
        return this.name;
    }
}