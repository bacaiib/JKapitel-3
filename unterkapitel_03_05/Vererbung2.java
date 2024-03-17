package unterkapitel_03_05;

public class Vererbung2 {

    public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.setName("Paula");

        Sportsman p2 = new Sportsman();
        p2.setName("Mike");
        p2.setSport("Profi Boxer");

        Programmer p3 = new Programmer();
        p3.setName("Jasper");
        p3.setLanguage("Python");

        introductionOf(p1);
        introductionOf(p2);
        introductionOf(p3);
    }

    public static void introductionOf(Person x){
        System.out.println(x.getName()+" wird sich vorstellen");
        x.introduceYourself();
        System.out.println();
    }
}
