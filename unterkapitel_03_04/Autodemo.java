package unterkapitel_03_04;

public class Autodemo {

    public static void main(String[] args) {
        
        Auto batmobil = new Auto();
        batmobil.setSpeed(190);
        batmobil.setPower(310);
        batmobil.setMarke("Audi");
       

        System.out.println("Das Batmobild fährt "+batmobil.getSpeed()+" km/h");
        System.out.println("Das Batmobild hat "+batmobil.getPower()+" PS");
        System.out.println("Die Marke des Batmobils ist "+batmobil.getMarke());
    }

}
