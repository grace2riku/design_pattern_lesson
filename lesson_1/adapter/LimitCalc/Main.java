public class Main {
    public static void main(String[] args) {
        int ret_val;

		System.out.println("/***** Calc *****/");
        Calc calc = new Calc();
        ret_val = calc.add(0, 101);
		System.out.println("ret_val(0 + 101) = " + ret_val);

        ret_val = calc.add(0, -1);
		System.out.println("ret_val(0 + (-1)) = " + ret_val);


        System.out.println();
        System.out.println("/***** LimitCalc *****/");

        Limiter limiter = new LimitCalc(0, 100);
        ret_val = limiter.add(0, 50);
		System.out.println("ret_val(0 + 50) = " + ret_val);

        ret_val = limiter.add(0, 100);
		System.out.println("ret_val(0 + 100) = " + ret_val);

        ret_val = limiter.add(0, 101);
		System.out.println("ret_val(0 + 101) = " + ret_val);

        ret_val = limiter.add(0, 0);
		System.out.println("ret_val(0 + 0) = " + ret_val);

        ret_val = limiter.add(0, -1);
		System.out.println("ret_val(0 + (-1)) = " + ret_val);
    }    
}
