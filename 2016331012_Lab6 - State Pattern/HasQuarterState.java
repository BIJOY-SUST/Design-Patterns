import java.util.Random;

class HasQuarterState implements State{

    Random newRandom = new Random();


    GumballMachine machine;

    HasQuarterState(GumballMachine machine){
        this.machine = machine;
    }

    public void insertQuarter(){
        System.out.println(this + ": You have already inserted a quarter. Please Wait");
    }
	public void ejectQuarter(){
        System.out.println(this + ": Ejecting quarter");
        machine.setState(machine.getNoQuarterState());
    }
    public void turnCrank(){

        System.out.println(this + ": Turning crank");

        int luckyNo = newRandom.nextInt(10);
        // System.out.println(luckyNo);
        // System.out.println("ami");
        // System.out.println(machine.getCount());
        // System.out.println("ses");
        if( luckyNo == 7 && machine.getCount()>=2 ){
            machine.setState(machine.getWinnerState());
            // machine.setState(machine.getSoldState());
        
        }
        else{
            machine.setState(machine.getSoldState());
        }
    }
	public void dispense(){
        System.out.println(this + ": " + "No gumball dispensed");
    }
	
	public void refill(){
        
    }

    public String toString(){
        return "HAS_QUARTER";
    }
}