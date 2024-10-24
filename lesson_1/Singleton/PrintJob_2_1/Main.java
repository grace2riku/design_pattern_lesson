public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        PrintJob printjob1 = PrintJob.getInstance();
        PrintJob printjob2 = PrintJob.getInstance();
        if (printjob1 == printjob2) {
            System.out.println("printjob1とprintjob2は同じインスタンスです。");
        } else {
            System.out.println("printjob1とprintjob2は同じインスタンスではありません。");
        }
        System.out.println("End.");
    }    
}
