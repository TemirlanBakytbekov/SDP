public class Laptop {
    ITurnOnStrategy TurnOn;
    private String model;
    private String CPU;
    private String videoCard;
    private String RAM;

    public Laptop(String model, String CPU, String videoCard, String RAM) {
        this.model = model;
        this.CPU = CPU;
        this.videoCard = videoCard;
        this.RAM = RAM;
    }

    public void setTurnOn(ITurnOnStrategy turnOn) {
        TurnOn = turnOn;
    }
    public void executeTurnOn() {
        TurnOn.turnOn();
    }
}

