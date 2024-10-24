public class PrintJob {
//    private static PrintJob printJob = new PrintJob();
    private static PrintJob printJob = null;
    
    private PrintJob() {
        System.out.println("インスタンスを生成しました。");
    }

    public static PrintJob getInstance() {
        if (printJob == null) {
            printJob = new PrintJob();
        }
        return printJob;
    }
}
