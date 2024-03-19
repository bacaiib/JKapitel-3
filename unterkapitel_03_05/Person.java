package unterkapitel_03_05;

public class Person {

    private String name;
    private int alter;
    private int gewicht;

    public Person (String n, int a, int g){
        name = n;
        alter = a;
        gewicht = g;
    }


    public Person(){}

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void introduceYourself(){
        System.err.println("Hallo mein Name ist "+getName());
    }

}
