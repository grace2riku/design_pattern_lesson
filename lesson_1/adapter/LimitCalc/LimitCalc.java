public class LimitCalc extends Limiter {
	private Calc calc;
	private int min;
	private int max;

	public LimitCalc(int min, int max) {
		this.min = min;
		this.max = max;
		this.calc = new Calc();

		System.out.println("limit min value = " + this.min + "/limit max value = " + this.max);
	}

	@Override
	public int add(int val, int val_2) {
		int ret_val = this.calc.add(val, val_2);

		if (ret_val > max) ret_val = max;
		if (ret_val < min) ret_val = min;

		return ret_val;
	}
}
