package javautility;

import org.apache.poi.ss.formula.functions.Value;

public class JavaUtils {
	public float roundOffNumber(float value) {
		float fl = (float) (Math.round(value*100.0)/100.0);
		return fl;
		
	}

}
