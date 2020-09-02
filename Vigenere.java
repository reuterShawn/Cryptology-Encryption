import java.util.Arrays;

public class Vigenere {
    String key;
    int[] keyArr;

    Vigenere(String key){
        keyArr = takeString(key);
        this.key=key;
    }

    public int[] takeString ( String word){
        int wordSize =word.length();
        int[] keyArr = new int[wordSize];
        for (int i = 0; i < wordSize ; i++ ) {
            String letter = word.substring(i, i+1);
            keyArr[i] = encrypt.letterIndex(letter);
        }
        return keyArr;
    }

    String encrypt(String plaintext){
        Ceasar[] ciphers = new Ceasar[key.length()];
        for (int i = 0; i < key.length(); i++) {
            ciphers[i] = new Ceasar(keyArr[i]);
        }
        String[] texts = splitText(plaintext);
        String[] cypherTexts = new String[key.length()];
        for (int i = 0; i < key.length() ; i++) {
            cypherTexts[i] = ciphers[i].encrypt(texts[i]);
        }
        return combineTexts(cypherTexts);

    }

    String decrypt (String cyphertext){
        Ceasar[] ciphers = new Ceasar[key.length()];
        for (int i = 0; i < key.length(); i++) {
            ciphers[i] = new Ceasar(keyArr[i]);
        }
        String[] texts = splitText(cyphertext);
        String[] plaintext = new String[key.length()];
        for (int i = 0; i < key.length() ; i++) {
            plaintext[i] = ciphers[i].decrypt(texts[i]);
        }
        return combineTexts(plaintext);
    }

    String[] splitText(String text){
        String[] texts = new String[key.length()];
        for (int i = 0; i < key.length(); i++) {
            texts[i] = "";
        }
        int i=0;
        while (!text.equals("")){
            texts[i] += text.substring(0,1);
            text = text.substring(1);
            i= (i+1) % key.length();
        }
        return texts;
    }

    String combineTexts(String[] texts){
        String text = "";
        int i=0;
        while (!texts[i].equals("")){
            text += texts[i].substring(0,1);
            texts[i] = texts[i].substring(1);
            i= (i+1) % key.length();
        }
        return text;
    }

}
