/**
 * SoldOutState
 */
public class SoldOutState implements State{

    GumballMachine machine;

    SoldOutState(GumballMachine machine){
        this.machine = machine;
    }


    
    public void insertQuarter(){
        System.out.println(this + ":This machine is sold out ... So next time..!");
    }
	public void ejectQuarter(){
        System.out.println(this + ":You can't  Eject quarter");
    }
    public void turnCrank(){
        System.out.println(this + ": Sorry there is no gumball... So next time");
    }
	public void dispense(){
        System.out.println(this + ": Machine is sold out , no gumballed");
    }
	
	public void refill(){
        System.out.println(this + ":Machine is refilling now and noquater state now");
        machine.setState(machine.getNoQuarterState());
    }

    public String toString(){
        return "Sold out, wait for quater";
    }



}