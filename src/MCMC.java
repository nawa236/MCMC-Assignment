
public class MCMC {
	public static void main(String[] args) {
		//setup network
		Anode a = new Anode();
		Bnode b = new Bnode();
		Cnode c = new Cnode();
		Dnode d = new Dnode();
		Enode e = new Enode();
		Gnode g = new Gnode();
		
		b.setA(a);
		b.setC(c);
		b.setD(d);
		b.setE(e);
		
		c.setB(b);
		c.setE(e);
		
		d.setA(a);
		d.setB(b);
		d.setE(e);
		d.setG(g);
		
		e.setB(b);
		e.setC(c);
		e.setD(d);
		e.setG(g);
		
		//create first state, A and G always true
		b.randomizeState();
		c.randomizeState();
		d.randomizeState();
		e.randomizeState();
		//b=t counter
		int counter = 0;
		//main loop
		for(int i = 1; i <= 10000; i++) {
			//roll for new states based on states currently in markov blanket, A and G always true
			b.randomizeState();
			c.randomizeState();
			d.randomizeState();
			e.randomizeState();
			
			//increment counter if b=t
			if(b.getState()) {
				counter++;
			}
			//output ratio of B=T every 1000 iterations
			if(i % 1000 == 0) {
				System.out.println((float)counter/i);
			}
		}
	}
}
