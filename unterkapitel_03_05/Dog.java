package unterkapitel_03_05;

public class Dog extends Animal{

    private String race;

    protected Dog (String race) {
       super ("Fleischesser");
       this.race = race;
    }

    public void setRace(String race){
        this.race = race;
    }

    protected String getRace(){
        return race;
    }

}
