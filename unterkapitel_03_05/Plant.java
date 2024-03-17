package unterkapitel_03_05;

public class Plant {

    private float sizeInCm;

    public void setGröße(float g){
        sizeInCm = g;
    }

    public float getGröße(){
        return sizeInCm;
    }

    protected void grow(float cm){
        if (cm > 0){
            sizeInCm += cm;
        }
    }

    public void water (int liter){
    grow (liter * 0.1f);
    }
}
