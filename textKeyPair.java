public class textKeyPair {
    String key;
    String text;

    textKeyPair(String key, String text){
        this.key=key;
        this.text=text;
    }

    String getText(){
        return text;
    }

    @Override
    public String toString() {
        return "textKeyPair{" +
                "key='" + key + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
