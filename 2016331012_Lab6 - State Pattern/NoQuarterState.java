/**
 * NoQuarterState
 */
public class NoQuarterState implements State {

    GumballMachine machine;

    NoQuarterState(GumballMachine machine){
        this.machine = machine;
    }

    public void insertQuarter(){
        System.out.println(this + ": You have newly inserted a quarter");
        machine.setState(machine.getHasQuarterState());
    }
	public void ejectQuarter(){
        System.out.println(this + ": You can't  Eject quarter , cause you haven't insert yet.");
    }
    public void turnCrank(){
        System.out.println(this + ": You want to turn but there is no quater for turing");
    }
	public void dispense(){
        System.out.println(this + ": You didn't pay anaything for gumball, Please pay first...!");
    }
	
	public void refill(){
        System.out.println(this + ": Gumball  machine is refilled");
    }

    public String toString(){
        return "No Quater, wait for quater";
    }

}