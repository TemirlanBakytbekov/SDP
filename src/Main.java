public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("blablabla","Intel i5","Nvidia RTX 1650Ti","16Gb");
        laptop.setTurnOn(new economyMode());
        laptop.executeTurnOn();
    }
}