import java.util.Arrays;

public class encrypt {


    public static void main (String[] args){
        String key = "RICKROLL";
        String text = "Random text";
        String text2 = "Ooh ooh\n" +
                "We're no strangers to love\n" +
                "You know the rules and so do I\n" +
                "A full commitment's what I'm thinking of\n" +
                "You wouldn't get this from any other guy\n" +
                "I just wanna tell you how I'm feeling\n" +
                "Gotta make you understand\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "We've known each other for so long\n" +
                "Your heart's been aching but You're too shy to say it\n" +
                "Inside we both know what's been going on\n" +
                "We know the game and we're gonna play it\n" +
                "And if you ask me how I'm feeling\n" +
                "Don't tell me you're too blind to see\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "(Ooh, give you up)\n" +
                "(Ooh, give you up)\n" +
                "(Ooh) Never gonna give, never gonna give (Give you up)\n" +
                "(Ooh)Never gonna give, never gonna give (Give you up)\n" +
                "We've know each other for so long\n" +
                "Your heart's been aching but You're too shy to say it\n" +
                "Inside we both know what's been going on\n" +
                "We know the game and we're gonna play it\n" +
                "I just wanna tell you how I'm feeling Gotta make you understand\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n";
        String out = takeStuff(text, key);
        //System.out.println(out);
        //System.out.println(doNothing(text, key));
        //System.out.println(takeStuff(text2,key));
        //System.out.println(doNothing(text2,key));
        //String cyphertextJoeAarron = "kkmqqgzyacuataaviefwwsodavessdfjadddhmqxsenfizastpjleeilkoxxfphqhzadewwsaeagkkucygizsgbdgbtsifwzarrxfcedpfzhqglduyqajtttkdabtgbazagjhqgxkrqwwwditdhtttqaadhkpadiukmucywnpizaypdfpsfdhyoyxfcfqslktttjqlqhsjduwaptttynogcvnuzcajgpxvjtypcasqckanailklukwbodumjyajjxrmxfcefhkiaditqtkdmnhqpvcefhvqmnhgiuowlkdahgiuowlksqtkkwtplowddfcwuizpawxfcttttwcwhlneqikuogadjehtjgnalabyajvknfvguogadjehtjohucwefkdmzoziyhoiwwunalqkudtsjaxakpadvwpyajjcaytgjgaedwyttqjoingqrqpjkcwhlwrstlphqhzkwacyatbpazazsshlfwspgxxlpedhaogaavknxnkdoaiajgeisnsngwwkfwwioxsapsmrgklbasyemcvphqnkwyuiyaterghdqgqkudttqnpawzubcgswmxlpixngqgqighdqgtqtfwwieftgnmqctagfdvefrtjfupvajgnnldetddaizizasmiwhluiwlioimnefwwecqlwokmiwesstlpizvhnefiqphucldeiplarevwptucysadbkkyajeegtisowqadowubeuwagdzsacxerqwgsbajluoggkphmikphqlsuixxcaifpfzixafavqgyatndjadttqjoingqrqpfwlxhlwrstluoggywmqdfcobasuhqnfkwkdmnemggykeisngqildeewgsozvwppmxvwlxizwtsaaptqgkessddzozaqohadlenshlwreqjaawizamaavooyttkdkdfyemhcadodmhduhhwrqhgieowsjgqugngmhajeqslkgqieusqaxwwmnxnoyizesbasyeuhsedkthshmisyozrwlturgqlpjkaaxxlplqumalynkalrpfzwqrgqlppdhuetshifidactpfceitdhtttqaadhkpadiukmucywnpizaypdfpsfdhyoyxfcfqslktttjqlqhsjduwaptttynogcvnuzcajgpxvjtypcasqckanailklukwbodumjyajjxrmxfcefhkiaditqtkdmnhqpvcefhvqmnhgiuowlkdahgiuowlksqtkkwtplowddfcwuizpawxfcttttwcwhlneqikuogadjehtjgnalabyajvknfvgcokdmhlztnarewajeuuqkupdfpgxdodekcgsyajjaazpdhsfpjcefngqrspeaozvgllmnzayzdouoggwwrarcotmgyatfwwohalgjgqihwippfzaxaldafvdetftjoievghdacdustdgpizvkpadhtnemzldeyddzhqnfkwttqjoiwwuhqnzayzdodekcgshqnfkwkdmnemcshleisnhqnfkwkdmnemcshleisnhqnfkwkdmnemcshleisnozaqohadlenshlwreqjaawizamaav";
        String cyphertextJoeAarron = "kkmqqgzyacuataaviefwwsodavessdfjadddhmqxsenfizastpjleeilkoxxfphqhzadewwsaeagkkucygizsgbdgbtsifwzarrxfcedpfzhqglduyqajtttkdabtgbazagjhqgxkrqwwwditdhtttqaadhkpadiukmucywnpizaypdfpsfdhyoyxfcfqslktttjqlqhsjduwaptttynogcvnuzcajgpxvjtypcasqckanailklukwbodumjyajjxrmxfcefhkiaditqtkdmnhqpvcefhvqmnhgiuowlkdahgiuowlksqtkkwtplowddfcwuizpawxfcttttwcwhlneqikuogadjehtjgnalabyajvknfvguogadjehtjohucwefkdmzoziyhoiwwunalqkudtsjaxakpadvwpyajjcaytgjgaedwyttqjoingqrqpjkcwhlwrstlphqhzkwacyatbpazazsshlfwspgxxlpedhaogaavknxnkdoaiajgeisnsngwwkfwwioxsapsmrgklbasyemcvphqnkwyuiyaterghdqgqkudttqnpawzubcgswmxlpixngqgqighdqgtqtfwwieftgnmqctagfdvefrtjfupvajgnnldetddaizizasmiwhluiwlioimnefwwecqlwokmiwesstlpizvhnefiqphucldeiplarevwptucysadbkkyajeegtisowqadowubeuwagdzsacxerqwgsbajluoggkphmikphqlsuixxcaifpfzixafavqgyatndjadttqjoingqrqpfwlxhlwrstluoggywmqdfcobasuhqnfkwkdmnemggykeisngqildeewgsozvwppmxvwlxizwtsaaptqgkessddzozaqohadlenshlwreqjaawizamaavooyttkdkdfyemhcadodmhduhhwrqhgieowsjgqugngmhajeqslkgqieusqaxwwmnxnoyizesbasyeuhsedkthshmisyozrwlturgqlpjkaaxxlplqumalynkalrpfzwqrgqlppdhuetshifidactpfceitdhtttqaadhkpadiukmucywnpizaypdfpsfdhyoyxfcfqslktttjqlqhsjduwaptttynogcvnuzcajgpxvjtypcasqckanailklukwbodumjyajjxrmxfcefhkiaditqtkdmnhqpvcefhvqmnhgiuowlkdahgiuowlksqtkkwtplowddfcwuizpawxfcttttwcwhlneqikuogadjehtjgnalabyajvknfvgcokdmhlztnarewajeuuqkupdfpgxdodekcgsyajjaazpdhsfpjcefngqrspeaozvgllmnzayzdouoggwwrarcotmgyatfwwohalgjgqihwippfzaxaldafvdetftjoievghdacdustdgpizvkpadhtnemzldeyddzhqnfkwttqjoiwwuhqnzayzdodekcgshqnfkwkdmnemcshleisnhqnfkwkdmnemcshleisnhqnfkwkdmnemcshleisnozaqohadlenshlwreqjaawizamaav";
        //System.out.println(Arrays.toString(splitText(cyphertextJoeAarron,5)));
        //System.out.println(Arrays.deepToString(thing(cyphertextJoeAarron,5)));
        //System.out.println(takeStuff("ATTACKATDAWN","LEMON"));
        //System.out.println(doNothing("ATTACKATDAWN","LEMON"));
        //System.out.println(takeStuff("CRYPTOISSHORTFORCRYPTOGRAPHY","ABCD"));
        //System.out.println(doNothing("CRYPTOISSHORTFORCRYPTOGRAPHY","ABCD"));
        System.out.println(keyElimination(cyphertextJoeAarron,5));
        System.out.println(Arrays.deepToString(commonSelfEncrypts()));
    }

    public static String takeStuff ( String text, String keyword){

       String  filteredText = filterText(text);
       Vigenere cipher = new Vigenere(filterText(keyword));
       return cipher.encrypt(filteredText);
    }

    public static String doNothing (String text, String keyword){
        Vigenere cipher = new Vigenere(filterText(keyword));
        return cipher.decrypt(cipher.encrypt(filterText(text)));
    }

    public static int letterIndex(String letter){

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
        int index = alphabet.indexOf(letter);
        return index;
    }

    public static String filterText (String text){
        text = text.toLowerCase();
        String allLetters = text.replaceAll("[^a-z]", "");
        return allLetters;
    }

    static String[] splitText(String text, int n){
        String[] texts = new String[n];
        for (int i = 0; i < n; i++) {
            texts[i] = "";
        }
        int i=0;
        while (!text.equals("")){
            texts[i] += text.substring(0,1);
            text = text.substring(1);
            i= (i+1) % n;
        }
        return texts;
    }

    static int[] freq(String text){
        int[] ints = new int[26];
        for (int i = 0; i <text.length() ; i++) {
            ints[letterIndex(text.substring(i,i+1))]++;
        }
        return ints;
    }

    static int[][] thing(String text, int n){
        String[] strings = splitText(text,n);
        int[][] ints = new int[26][n];
        for (int i = 0; i < n; i++) {
            ints[i]=freq(strings[i]);
        }
        return ints;
    }
    
    static String keyElimination(String text, int keyLength){
        String newText = text.substring(keyLength) + text.substring(0,keyLength);
        int[] text1 = Ceasar.toIntArr(text);
        int[] newText1 = Ceasar.toIntArr(newText);
        for (int i = 0; i < text.length(); i++) {
            text1[i] = (text1[i] - newText1[i] + 26) % 26;
        }
        return Ceasar.toString(text1);
    }

    static String selfEncrypt(String text){
        int[] text1 = Ceasar.toIntArr(text);
        for (int i = 0; i < text.length(); i++) {
            text1[i] = (text1[i] + text1[i] + 26) % 26;
        }
        return Ceasar.toString(text1);
    }

    static String[] commonEnglishWords = {"the","of","to","and","in","you","they","have","this"};
    static String[] commonSelfEncrypts(){
        String[] strings = new String[commonEnglishWords.length];
        for (int i = 0; i < commonEnglishWords.length; i++) {
            strings[i]=selfEncrypt(commonEnglishWords[i]);
        }
        return strings;
    }



}
