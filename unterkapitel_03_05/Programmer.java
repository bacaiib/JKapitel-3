package unterkapitel_03_05;

public class Programmer extends Person {

    private String programierLanguage;

    public void setLanguage(String l){
        programierLanguage = l;
    }

    public String getLanguage(){
        return programierLanguage;
    }

    public void introduceYourself(){
        System.out.println("Helau my Name is "+getName());
        System.out.println("I'm coding in "+getLanguage());
    }

}
