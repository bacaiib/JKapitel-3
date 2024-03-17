package unterkapitel_03_05;

public class Athlete extends Person {

    private int gewicht;

    public void setGewicht(int g){
        if (g >= 0 && g <= 80){
            gewicht = g;
        }
    }

    public int getGewicht(){
        return gewicht;
    }

    public void introduceYourself(){
        System.out.println("Hallöchen mein süßer kleiner Name ist "+getName());
        System.out.println("Ich wiege süße "+getGewicht()+" kg");
    }

}
