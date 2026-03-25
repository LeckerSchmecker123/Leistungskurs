package blatt20_MarioKart;


public class Main {
    public static void main(String[] args) {

    Charakter bowser = new Charakter("bowser",Gewichtsklasse.SCHWER, "bowserPanzer");


        System.out.println(bowser.getName() + " " + bowser.getGewichtsklasse() + " " + bowser.getSpezialItem());
    }
}
