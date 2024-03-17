package unterkapitel_03_05;

public class Sportsman extends Person {

    private String sport;

    public void setSport(String p){
        sport = p;
    }

    public String getSport(){
        return sport;
    }

    public void introduceYourself(){
        System.out.println("Was geht mein Name ist "+getName());
        System.out.println("Ich bin "+getSport());
    }



}
