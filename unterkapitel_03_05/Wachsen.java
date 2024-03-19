package unterkapitel_03_05;

public class Wachsen {

    public static void main(String[] args) {
        
        Plant pflanze = new Plant();
        pflanze.setGröße(8.5f);

        pflanze.grow(9);

        pflanze.water(10);
        System.out.println(pflanze.getGröße());
    }

}
