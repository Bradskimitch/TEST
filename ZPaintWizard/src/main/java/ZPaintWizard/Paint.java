package ZPaintWizard;

public class Paint {
	private String name;
	private int volumeL;
	private double cost;
	private float coverage;

	public Paint(String name, int volumeL, double cost, float coverage) {
		this.name = name;
		this.volumeL = volumeL;
		this.cost = cost;
		this.coverage = coverage;
	}

	public Paint() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolumeL() {
		return volumeL;
	}

	public void setVolumeL(int volumeL) {
		this.volumeL = volumeL;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getCoverage() {
		return coverage;
	}

	public void setCoverage(float coverage) {
		this.coverage = coverage;
	}

}
