import java.util.Random;

public class Dnode {
	double[] truthTable = {0.255319149, 0.347826087, 0.72, 0.8};
	Anode anode;
	Bnode bnode;
	Enode enode;
	Gnode gnode;
	boolean state = true;
	
	Dnode() {
		
	}
	boolean randomizeState() {
		 Random rand = new Random();
		 double val = rand.nextFloat();
		 if(anode.getState() && bnode.getState() && enode.getState() && gnode.getState()) {
			 if(val <= truthTable[0]) {
				 state = true;
			 } else {
				 state = false;
			 }
		 } else  if(anode.getState() && !bnode.getState() && enode.getState() && gnode.getState()) {
			 if(val <= truthTable[1]) {
				 state = true;
			 } else {
				 state = false;
			 }
		 } else  if(anode.getState() && bnode.getState() && !enode.getState() && gnode.getState()) {
			 if(val <= truthTable[2]) {
				 state = true;
			 } else {
				 state = false;
			 }
		 } else  if(anode.getState() && !bnode.getState() && !enode.getState() && gnode.getState()) {
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
	void setA(Anode a) {
		anode = a;
	}
	void setB(Bnode b) {
		bnode = b;
	}
	void setE(Enode e) {
		enode = e;
	}
	void setG(Gnode g) {
		gnode = g;
	}
}
