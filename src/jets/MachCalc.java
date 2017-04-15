package jets;

public class MachCalc {

	public float mphToMach(float mph) {
		float mach = (float) (mph/767.269);
		return mach;
	}
}
