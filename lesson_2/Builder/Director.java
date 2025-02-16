public class Director {
    private Builder builder;

    // コンストラクタ
    public Director(Builder builder) {
        this.builder = builder;
    }

    // 文書をつくるメソッド
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("一般的なあいさつ");
        builder.makeItems(new String[]{
            "How are you?",
            "Hello.",
            "Hi.",
        });
        builder.makeString("時間帯に応じたあいさつ");
        builder.makeItems(new String[]{
            "Good morning.",
            "Good afternoon.",
            "Good evening.",
        });
        builder.close();
    }

}
