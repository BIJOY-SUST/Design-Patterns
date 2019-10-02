/**
 * GumballMachine
 */
public class GumballMachine {

    State soldOutState, noQuarterState, hasQuarterState, soldState, winnerState;
    
    State state;

    int count = 0;

    GumballMachine(int init_cnt){
        soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        // winnerState = new WinnerState(this);

		this.count = init_cnt;
 		if (init_cnt > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
    }

    int getCount(){ return count; }
    void setState(State state) { this.state = state; }
    public State getState() { return state; }
    public State getSoldOutState() { return soldOutState; }
    public State getNoQuarterState() { return noQuarterState; }
    public State getHasQuarterState() { return hasQuarterState; }
    public State getSoldState() { return soldState; }
    public State getWinnerState() { return winnerState; }

    public String toString(){
        return "Machine is in <"+state+"> state";
    }


    public void insertQuarter(){
        state.insertQuarter();
    }
	public void ejectQuarter(){
        state.ejectQuarter();
    }
	public void turnCrank(){
        state.turnCrank();
        // System.out.println(this);
        state.dispense();
    }
    public void refill(int cnt) {
		this.count += cnt;
		System.out.println("Machine is successfully filled; Now gumball is : " + this.count);
        state.refill();
	}
    void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
}