/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Remote remote = new Remote();

        Air_Conditioner ac = new Air_Conditioner("Carrier", remote, 0);

        Fan fan = new Fan("AirCool", remote, 1);

        Blub light = new Blub("Transtec", remote, 2);

        remote.clickOFFbutton(0);

        remote.clickONbutton(0);
        remote.clickONbutton(1);
        remote.clickOFFbutton(1);

        // remote.clickOFFbutton(0);

        // remote.clickONbutton(1);
        // remote.clickOFFbutton(1);

        remote.clickOFFbutton(2);
        remote.clickONbutton(2);

        System.out.println();

        remote.clickMASTERbutton();
        // remote.clickMASTERbutton();


    }

}