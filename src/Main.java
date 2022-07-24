public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Czewrony",5, "A4", false);
        System.out.println(audi.getautomatycznaSkrzynia());
        audi.setautomatycznaSkrzynia(true);
        System.out.println(audi.getautomatycznaSkrzynia());

        Car ford = new Car("Czarny", 5, "Focus", false);
        System.out.println(ford.getkolor());
        ford.setkolor("Szary");
        System.out.println(ford.getkolor());
    }
}
