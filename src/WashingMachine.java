public class WashingMachine {

    private int temperature;
    private int spinning;

    void modeForSensitive(){
        temperature = 30;
        spinning = 800;
    }

    void modeForDurable(){
        temperature = 90;
        spinning = 1200;
    }

}
