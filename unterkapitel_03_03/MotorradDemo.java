package unterkapitel_03_03;

public class MotorradDemo {

    public static void main(String[] args) {
        
        Motorrad [] motorraeder = new Motorrad [10];

        for (int i=0; i<10;i++){
            motorraeder [i]= new Motorrad(i);
        }

        System.out.println("Die anzahl der Mottoräder ist: "+motorraeder[3].anzahlMotorreader);
    }

}
