package unterkapitel_03_05;

public class Plant {

    private float sizeInCm;

    public void setGröße(float sizeInCm){
        this.sizeInCm = sizeInCm;
    }

    public float getGröße(){
        return sizeInCm;
    }

    protected void grow(float cm){
        if (cm > 0){
            sizeInCm += cm;
        }
    }

    protected void water (int liter){
    grow (liter * 0.1f);
    }
}
