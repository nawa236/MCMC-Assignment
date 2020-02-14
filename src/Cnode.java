import java.util.Random;

public class Cnode {
	double[] truthTable = {0.533333333, 0.75, 0.109090909, 0.125};
	Bnode bnode;
	Enode enode;
	boolean state = true;
	
	Cnode() {
		
	}
	boolean randomizeState() {
		Random rand = new Random();
		double val = rand.nextFloat();
		if(bnode.getState() && enode.getState()) {
			if(val <= truthTable[0]) {
				state = true;
			} else {
				state = false;
			}
		} else  if(!bnode.getState() && enode.getState()) {
			if(val <= truthTable[1]) {
				state = true;
			} else {
				state = false;
			}
		} else  if(bnode.getState() && !enode.getState()) {
			if(val <= truthTable[2]) {
				state = true;
			} else {
				state = false;
			}
		} else  if(!bnode.getState() && !enode.getState()) {
			if(val <= truthTable[3]) {
				state = true;
			} else {
				state = false;
			}
		}
		return state;
	}
	boolean getState() {
		return state;
	}
	void setB(Bnode b) {
		bnode = b;
	}
	void setE(Enode e) {
		enode = e;
	}
}
