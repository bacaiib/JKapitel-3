package unterkapitel_03_01;

public class Auto {

        public String marke;
        public int tempo;
        public int ps;
        public String farbe;
        
    

    public void beschleunigen (){
        tempo =+ 10;
        if (tempo > 180) tempo = 180;
    }

    public void bremsen (){
        tempo =- 10;
        if (tempo < 0) tempo = 0;
    }
}
