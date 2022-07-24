public class Car {
    private String kolor;
    private int liczbaDrzwi;
    private String marka;
    private boolean automatycznaSkrzynia;

    public Car(String kolor, int liczbaDrzwi, String marka, boolean automatycznaSkrzynia) {
        this.kolor = kolor;
        this.liczbaDrzwi = liczbaDrzwi;
        this.marka = marka;
        this.automatycznaSkrzynia = automatycznaSkrzynia;
    }

    public Car(String kolor, int liczbaDrzwi, String marka) {
        this.kolor = kolor;
        this.liczbaDrzwi = liczbaDrzwi;
        this.marka = marka;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }

    public void setLiczbaDrzwi(int liczbaDrzwi) {
        this.liczbaDrzwi = liczbaDrzwi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public boolean isAutomatycznaSkrzynia() {
        return automatycznaSkrzynia;
    }

    public void setAutomatycznaSkrzynia(boolean automatycznaSkrzynia) {
        this.automatycznaSkrzynia = automatycznaSkrzynia;
    }
}
