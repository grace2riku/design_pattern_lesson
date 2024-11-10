public interface ControlStrategy {
    public abstract int CalcOperationAmount(int targetValue, int measuredValue,  int time);
    public abstract void init();
}
