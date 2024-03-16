package unterkapitel_03_01;

public class Autodemo {

    public static void main(String[] args) {
        Auto meins, deins;
        meins = new Auto();
        deins = new Auto();

        meins.marke = "BMW";
        deins.marke = "Toyota";
        meins.tempo = 0;
        deins.tempo = 0;
        meins.ps = 120;
        deins.ps = 140;
        meins.beschleunigen();
        meins.farbe = "rot";
        deins.farbe = "blau";

        System.out.print("Marke meines autos ist "+meins.marke);
        System.out.println(", Meine GEschwindigkeit ist "+meins.tempo);
        System.out.println("mein auto hat "+meins.ps+" ps");
        System.out.println("Mein auto ist "+meins.farbe);

        System.out.print("Deine Marke ist "+ deins.marke);
        System.out.println(", Deine geschwinbdigkeit "+deins.tempo);
    }

}
