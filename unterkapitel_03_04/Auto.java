package unterkapitel_03_04;

public class Auto {

        private String marke;
        private int tempo;
        private int ps;

        public Auto(){
            marke = "unbekannt";
            tempo = 0;
            ps = 50;
        }


        public void setSpeed(int s){
            if (s >= 0 && s <= 180){
            tempo = s;
            }
            else {
                System.out.println("Die eingabe der GEschwindigkeit ist Falsch und muss zwischen 0 und 180 sein!");
            }
        }

        public int getSpeed() {
            return tempo;
           }

        public void setPower(int p){
            if (p >= 0 && p <= 300){
                ps = p;
            }
            else {
                System.out.println(p+" ist Ungültig! Die PS darf nicht höher als 300 und nicht weniger als 0 sein und wird wieder auf 0 gesetzt");
            }
        }

        public int getPower(){
            return ps;
        }

        public void setMarke(String m){
            if (m.equals("BMW") || m.equals("Mercedes") || m.equals("Toyota") || m.equals("VW")){
                marke = m;
            }
            else { 
                System.out.println("Es sind die Marken BMW, Mercedes, Toyota und Vw erlaubt");
            }
        }

        public String getMarke(){
            return marke;
        }
      
}

