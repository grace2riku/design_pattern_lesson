
public class OnOffControlStrategy implements ControlStrategy {

    public OnOffControlStrategy() {
    }

    @Override
    public int CalcOperationAmount(int targetValue, int measuredValue, int time) {
        String className = new Object(){}.getClass().getEnclosingClass().getName();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(className + " " + methodName);

        return 0;
    }

    @Override
    public void init() {
        String className = new Object(){}.getClass().getEnclosingClass().getName();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(className + " " + methodName);

        return;
    }    
}
