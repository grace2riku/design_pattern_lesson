public class PrintJob {
    private static PrintJob printJob = new PrintJob();
    
    private PrintJob() {
        System.out.println("インスタンスを生成しました。");
    }

    public static PrintJob getInstance() {
        return printJob;
    }
}
