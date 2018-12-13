package ZPaintWizard;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paint cheapoMax = new Paint("CheapoMax", 21, 19.99, 10);
		Paint towtd = new Paint("ThatOneWithThedog", 40, 34.38, 12);
		Paint avgJoes = new Paint("AverageJoes", 16, 17.99, 11);
		Paint dulux = new Paint("DuluxourousPaints", 10, 25, 22);
		ZPaintWizard wizard = new ZPaintWizard();
	
		wizard.addPaint(cheapoMax);
		wizard.addPaint(towtd);
		wizard.addPaint(avgJoes);
		wizard.addPaint(dulux);
		
		
		System.out.println(wizard.leastWaste(210));
		//System.out.println(wizard.leastWaste(210));
		//System.out.println(wizard.leastWaste(2));
		//System.out.println(wizard.leastWaste(480));
		//System.out.println(wizard.leastWaste(10000));
		//System.out.println(wizard.cheapest());
		
		
	}

}
