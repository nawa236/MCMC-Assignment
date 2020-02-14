import java.util.Random;

public class Enode {
	double[] truthTable = {0.888888889, 0.608695652, 0.068965517, 0.564516129, 0.222222222, 0.192307692, 0.058139535, 0.689655172};
	Cnode cnode;
	Bnode bnode;
	Dnode dnode;
	Gnode gnode;
	boolean state = true;
	
	Enode() {
		
	}
	boolean randomizeState() {
		 Random rand = new Random();
		 double val = rand.nextFloat();
		 if(bnode.getState() && cnode.getState() && dnode.getState() && gnode.getState()) {
			 if(val <= truthTable[0]) {
				 state = true;
			 } else {
				 state = false;
			 }
		 } else  if(!bnode.getState() && cnode.getState() && dnode.getState() && gnode.getState()) {
			 if(val <= truthTable[1]) {
				 state = true;
			 } else {
				 state = false;
			 }
		 } else  if(!bnode.getState() && !cnode.getState() && dnode.getState() && gnode.getState()) {
			 if(val <= truthTable[2]) {
				 state = true;
			 } else {
				 state = false;
			 }
		 } else  if(!bnode.getState() && cnode.getState() && !dnode.getState() && gnode.getState()) {
			 if(val <= truthTable[3]) {
				 state = true;
			 } else {
				 state = false;
			 }
		 } else  if(bnode.getState() && !cnode.getState() && dnode.getState() && gnode.getState()) {
			 if(val <= truthTable[4]) {
				 state = true;
			 } else {
				 state = false;
			 }
		 } else  if(bnode.getState() && !cnode.getState() && !dnode.getState() && gnode.getState()) {
			 if(val <= truthTable[4]) {
				 state = true;
			 } else {
				 state = false;
			 }
		 } else  if(!bnode.getState() && !cnode.getState() && !dnode.getState() && gnode.getState()) {
			 if(val <= truthTable[6]) {
				 state = true;
			 } else {
				 state = false;
			 }
		 } else  if(bnode.getState() && cnode.getState() && !dnode.getState() && gnode.getState()) {
			 if(val <= truthTable[7]) {
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
	void setC(Cnode c) {
		cnode = c;
	}
	void setD(Dnode d) {
		dnode = d;
	}
	void setG(Gnode g) {
		gnode = g;
	}
}
