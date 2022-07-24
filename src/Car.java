public class Car {
    private String kolor;
    private int  liczbaDrzwi;
    private String marka;
    private boolean automatycznaSkrzynia;

    public Car(String kolor, int liczbaDrzwi, String marka, boolean automatycznaSkrzynia){
        this.kolor = kolor;
        this.liczbaDrzwi = liczbaDrzwi;
        this.marka = marka;
        this.automatycznaSkrzynia = automatycznaSkrzynia;
    }
    public void setautomatycznaSkrzynia(boolean aktumatycznaSkrzynia) {
        this.automatycznaSkrzynia = automatycznaSkrzynia;
    }
    public boolean getautomatycznaSkrzynia(){
        return automatycznaSkrzynia;
    }

    public void setkolor(String kolor) {
        this.kolor = kolor;
    }
    public String getkolor(){
        return kolor;
    }
    public void setliczbaDrzwi (int liczbaDrzwi) {
        this.liczbaDrzwi = liczbaDrzwi;
    }
    public int getliczbaDrzwi(){
        return liczbaDrzwi;
    }
    public void setmarka (String marka){
        this.marka = marka;
    }
    public String getmarka (){
        return marka;
    }
}
