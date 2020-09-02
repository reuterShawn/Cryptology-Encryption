import java.util.Arrays;

public class Ceasar {
    int key;

    Ceasar(int k){
        this.key = k;
    }

    String encrypt (String plaintext){
        int[] ints = toIntArr(plaintext);
        for (int i=0; i<ints.length;i++){
            ints[i] = (ints[i] + key) % 26;
        }
        return toString(ints);
    }

    String decrypt (String cyphertext){
        int[] ints = toIntArr(cyphertext);
        for (int i=0; i<ints.length;i++){
            ints[i] = (ints[i] - key + 26) % 26;
        }
        return toString(ints);
    }

    int[] toIntArr (String text){
        int[] ints = new int[text.length()];
        for (int i = 0; i < text.length(); i++) {
            ints[i] = encrypt.letterIndex(text.substring(i,i+1));
        }
        return ints;
    }

    String toString (int[] ints){
        String string = "";
        for (int i = 0; i < ints.length; i++) {
            string += "ABCDEFGHJIKLMNOPQRSTUVWXYZ".toLowerCase().substring(ints[i],ints[i]+1);
        }
        return string;
    }

}
