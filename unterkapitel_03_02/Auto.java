package unterkapitel_03_02;

public class Auto {
        
        public String marke;
        public int tempo;
        public int ps;
        public String farbe;

        public Auto (){
            marke = "unbekannt";
            tempo = 0;
            ps = 50;
            farbe = "weiß";
        }

    
        public Auto(String m){
            marke = m;
            tempo = 0;
            ps = 50;
        }

        public Auto(String c, int j, int k){
            marke = c;
            tempo = j;
            ps = k;
        }

        public void beschleunigen(){
            tempo =+ 10;
            if (tempo > 180) tempo = 180;
        }

        public void bremsen(){
            tempo =- 10;
            if (tempo < 0) tempo = 0;
        }

        public void zeigeAutodaten(){
            System.out.println("Die Marke des Autos ist: "+marke);
            System.out.println("Akt. GEschwindigkeit: "+tempo);
            System.out.println("PS: "+ps);
        }
    }


