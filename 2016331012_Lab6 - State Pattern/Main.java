interface State{
    public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
    public void dispense();
    
    public void refill();

}

class Main{
    public static void main(String[] args){

        GumballMachine machine = new GumballMachine(10);

        System.out.println(machine);
        
        machine.insertQuarter();
        System.out.println(machine);

        machine.turnCrank();

        System.out.println(machine);

        machine.insertQuarter();

        machine.turnCrank();
        
        machine.insertQuarter();

        machine.turnCrank();

        machine.insertQuarter();

        machine.turnCrank();
        
        machine.refill(5);

        machine.insertQuarter();
        
        machine.turnCrank();
        
        System.out.println(machine);

    }
}