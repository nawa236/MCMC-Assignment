import java.util.Random;

public class Bnode {
	double[] truthTable = {0.086956522, 0.2, 0.28, 0.060869565, 0.129032258, 0.079545455, 0.131367292};

	Anode anode;
	Cnode cnode;
	Dnode dnode;
	Enode enode;
	boolean state = true;
	Bnode() {
		
	}
	boolean randomizeState() {
		Random rand = new Random();
		double val = rand.nextFloat();
		if(anode.getState() && cnode.getState() && dnode.getState() && enode.getState()) {
			if(val <= truthTable[0]) {
				state = true;
			} else {
				state = false;
			}
		} else  if(anode.getState() && !cnode.getState() && dnode.getState() && enode.getState()) {
			if(val <= truthTable[1]) {
				state = true;
			} else {
				state = false;
			}
		} else  if(anode.getState() && !cnode.getState() && !dnode.getState() && enode.getState()) {
			if(val <= truthTable[2]) {
				state = true;
			} else {
				state = false;
			}
		} else  if(anode.getState() && !cnode.getState() && dnode.getState() && !enode.getState()) {
			if(val <= truthTable[3]) {
				state = true;
			} else {
				state = false;
			}
		} else  if(anode.getState() && cnode.getState() && !dnode.getState() && enode.getState()) {
			if(val <= truthTable[4]) {
				state = true;
			} else {
				state = false;
			}
		} else  if(anode.getState() && cnode.getState() && !dnode.getState() && !enode.getState()) {
			if(val <= truthTable[5]) {
				state = true;
			} else {
				state = false;
			}
		} else  if(anode.getState() && !cnode.getState() && !dnode.getState() && !enode.getState()) {
			if(val <= truthTable[6]) {
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
	void setA(Anode a) {
		anode = a;
	}
	void setC(Cnode c) {
		cnode = c;
	}
	void setD(Dnode d) {
		dnode = d;
	}
	void setE(Enode e) {
		enode = e;
	}
}
