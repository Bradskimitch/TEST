package ZPaintWizard;

import java.util.ArrayList;
import java.util.List;

public class ZPaintWizard {
	private List<Paint> paintList = new ArrayList<>();

	public String leastWaste(int roomSize) {
		double volume;
		double lowest = 10000;
		String best = null;

		for (Paint paint : paintList) {
			volume = paint.getVolumeL();
			while ((volume * paint.getCoverage()) <= roomSize) {
				volume += paint.getVolumeL();
			}
			
			volume = ((volume *paint.getCoverage())-roomSize)/paint.getCoverage();
			if (volume < lowest) {
				lowest = volume;
				best = paint.getName();
			}
		}
		return best;
	}
	
	public String leastWasteStillCover(int roomSize) {
		float volume;
		float lowest = 10000;
		String best = null;

		for (Paint paint : paintList) {
			volume = paint.getVolumeL();
			while ((volume * paint.getCoverage()) <= roomSize) {
				volume += paint.getVolumeL();
			}
			if (volume * paint.getCoverage() - roomSize < lowest) {
				lowest = volume * paint.getCoverage() - roomSize;
				best = paint.getName();
			}
		}
		return best;
	}
	
	

	public String cheapest() {
		float volume;
		float lowest = 10000;
		String best = null;
		for (Paint paint : paintList) {
			float costPerMetreSq = (float) ((paint.getVolumeL() / paint.getCost()) * paint.getCoverage());
			System.out.println(costPerMetreSq);
			if (costPerMetreSq < lowest) {
				lowest = costPerMetreSq;
				best = paint.getName();
			}
		}

		return best;

	}

	public List<Paint> addPaint(Paint paint) {
		paintList.add(paint);
		return paintList;
	}
}
