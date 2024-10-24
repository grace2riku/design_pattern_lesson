public class Main extends Thread {
    public static void main(String[] args) {
        System.out.println("Start");
        new Main("PrintJob A").start();
        new Main("PrintJob B").start();
        new Main("PrintJob C").start();
        System.out.println("End");
    }

    @Override
    public void run() {
        PrintJob obj = PrintJob.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }
    
    public Main(String name) {
        // Threadのコンストラクタを呼び出し名前を設定する
        super(name);
    }    
}
