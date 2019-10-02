import java.util.ArrayList;

/**
 * Remote
 */
public class Remote {

    ArrayList<Command> allDevice = new ArrayList<>();

    void removeDevice(int ind){
        allDevice.remove(ind);
    }


    void clickONbutton(int ind){
        allDevice.get(ind).on();
    }

    void clickOFFbutton(int ind) {
        allDevice.get(ind).off();
    }
    boolean masterButton = true;
    void clickMASTERbutton() {
        
        if(masterButton){
            for (Command var : allDevice){
                var.off();
            }
            masterButton  = false;
        }
        else{
            for (Command var : allDevice) {
                var.on();
            }
            masterButton = true;
        }


    }

}