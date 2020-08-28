public class Vigenere {
    String key;
    int[] keyArr;

    Vigenere(){

    }

    String encrypt(String plaintext){
        Ceasar[] ciphers = new Ceasar[key.length()];
        for (int i = 0; i < key.length(); i++) {
            ciphers[i] = new Ceasar(keyArr[i]);
        }
        String[] texts = splitText(plaintext);
        String[] cypherTexts;

    }

    String[] splitText(String text){
        String[] texts = new String[key.length()];
        int i=0;
        while (!text.equals("")){
            texts[i] += text.substring(0,1);
            text = text.substring(1);
            i= (i+1) % key.length();
        }
        return texts;
    }

}
