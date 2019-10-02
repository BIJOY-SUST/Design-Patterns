/**
 * Blub
 */
public class Blub implements Command {


    boolean flag = false;
    String Name;

    Blub(String Name, Remote remote, int ind) {
        this.Name = Name;
        remote.allDevice.add(ind, this);
    }

    @Override
    public void on() {
        if (flag) {
            System.err.println("Blub is already on..!");
        } else {
            System.err.println("Blub is on..!");
            flag = true;
        }
    }

    @Override
    public void off() {
        if (!flag) {
            System.err.println("Blub is already off..!");
        } else {
            System.err.println("Blub is off..!");
            flag = false;
        }
    }
    
}