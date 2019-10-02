/**
 * Fan
 */
public class Fan implements Command {

    boolean flag = false;
    String Name;

    Fan(String Name, Remote remote, int ind) {
        this.Name = Name;
        remote.allDevice.add(ind, this);
    }

    @Override
    public void on() {
        if (flag) {
            System.err.println("Fan is already on..!");
        } else {
            System.err.println("Fan is on..!");
            flag = true;
        }
    }

    @Override
    public void off() {
        if (!flag) {
            System.err.println("Fan is already off..!");
        } else {
            System.err.println("Fan is off..!");
            flag = false;
        }
    }

}