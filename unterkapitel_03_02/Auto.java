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

        public void beschleunigen(){
            tempo =+ 10;
            if (tempo < 180) tempo = 180;
        }

        public void bremsen(){
            tempo =- 10;
            if (tempo < 0) tempo = 0;
        }
    }


