public class Main {
    // 使い方を表示する
    public static void usage() {
        System.out.println("Usage: java Main onoff  OnOff制御");
        System.out.println("Usage: java Main pid    PID制御");
        System.out.println("Usage: java Main fuzzy  ファジー制御");
        System.out.println("Usage: java Main ml     機械学習制御");
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        Controler controler = null;
        if (args[0].equals("onoff")) {
            System.out.println("OnOff制御を開始します...");
            controler = new Controler(new OnOffControlStrategy());
        } else if (args[0].equals("pid")) {
            System.out.println("PID制御を開始します...");
            controler = new Controler(new PidControlStrategy());
        } else if (args[0].equals("fuzzy")) {
            System.out.println("ファジー制御を開始します...");
            controler = new Controler(new FuzzyControlStrategy());
        } else if (args[0].equals("ml")) {
            System.out.println("機械学習制御を開始します...");
            controler = new Controler(new MachineLearningControlStrategy());
        } else {
            usage();
            System.exit(0);
        }

        // 開始する
        controler.start();

        // 目標制御を実行する
        controler.execute();

        // 終了する
        controler.exit();
    }
}   