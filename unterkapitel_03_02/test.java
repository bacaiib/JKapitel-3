package unterkapitel_03_02;

public class test {

    public static void main(String[] args) {
        Auto a;
        a = new Auto();
        // Auto b = new Auto("BMW");
        Auto c = new Auto("VW", 100, 80);

        a.marke = "bmw";
        a.tempo = 20;
        a.ps = 34;
        a.farbe = "blau";

        System.out.println(a.farbe);
        


        c.beschleunigen();

        c.zeigeAutodaten();
        

    }

}
