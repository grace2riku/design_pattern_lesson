public class Controler {
    private ControlStrategy strategy;
    private int operationAmount = 0;

    // 戦略を授けて制御器を作る
    public Controler(ControlStrategy strategy) {
        this.strategy = strategy;
    }

    // 開始する
    public void start() {
        strategy.init();
    }

    // 制御を実行する
    public void execute() {
        // 操作量を算出する
        operationAmount = strategy.CalcOperationAmount(200, 100, 1500);
    }

    // 終了する
    public void exit() {

    }

}