public class Main {
    public static void main(String[] args) {
        int ret_val;

        Limiter limiter = new LimitCalc(0, 100);
        ret_val = limiter.add(0, 50);
		System.out.println("ret_val(Not limit) = " + ret_val);

        ret_val = limiter.add(0, 100);
		System.out.println("ret_val(Not limit. max value) = " + ret_val);

        ret_val = limiter.add(0, 101);
		System.out.println("ret_val(limit. upper) = " + ret_val);

        ret_val = limiter.add(0, 0);
		System.out.println("ret_val(Not limit. min value) = " + ret_val);

        ret_val = limiter.add(0, -1);
		System.out.println("ret_val(limit. lower) = " + ret_val);
    }    
}
