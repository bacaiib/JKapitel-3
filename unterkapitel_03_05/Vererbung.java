package unterkapitel_03_05;

public class Vererbung {

    public static void main(String[] args) {
        
        Person p = new Person();
        Sportsman s = new Sportsman();
        Athlete a = new Athlete();
        Programmer x = new Programmer();

        p.setName("Hans");
        s.setName("Roman");
        s.setSport("Boxer");
        a.setName("Jegor");
        a.setGewicht(70);
        x.setName("Elon");
        x.setLanguage("Java");


        p.introduceYourself();
        s.introduceYourself();
        a.introduceYourself();
        x.introduceYourself();
    }

}
