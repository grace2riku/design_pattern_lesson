public abstract class Entry {
    // 名前を得る
    public abstract String getName();
    
    // サイズを得る
    public abstract int getSize();

    // 一覧を表示する
    public void printList() {
        printList("");
    }

    // prefixを前につけて一覧を表示する
    protected abstract void printList(String prefix);

    // 文字列表現
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
