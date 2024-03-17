package unterkapitel_03_05;

public class Dog extends Animal{

    private String race;

    public Dog () {
        super ("Carnivora");
    }

    public void setRace(String r){
        race = r;
    }

    public String getRace(){
        return race;
    }

}
