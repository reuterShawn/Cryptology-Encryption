import java.io.*;
import java.nio.file.Files;
import java.util.*;

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
        String out = encrypt(text, key);
        //System.out.println(out);
        //System.out.println(doNothing(text, key));
        //System.out.println(encrypt(text2,key));
        //System.out.println(doNothing(text2,key));
        //String cyphertextJoeAarron = "kkmqqgzyacuataaviefwwsodavessdfjadddhmqxsenfizastpjleeilkoxxfphqhzadewwsaeagkkucygizsgbdgbtsifwzarrxfcedpfzhqglduyqajtttkdabtgbazagjhqgxkrqwwwditdhtttqaadhkpadiukmucywnpizaypdfpsfdhyoyxfcfqslktttjqlqhsjduwaptttynogcvnuzcajgpxvjtypcasqckanailklukwbodumjyajjxrmxfcefhkiaditqtkdmnhqpvcefhvqmnhgiuowlkdahgiuowlksqtkkwtplowddfcwuizpawxfcttttwcwhlneqikuogadjehtjgnalabyajvknfvguogadjehtjohucwefkdmzoziyhoiwwunalqkudtsjaxakpadvwpyajjcaytgjgaedwyttqjoingqrqpjkcwhlwrstlphqhzkwacyatbpazazsshlfwspgxxlpedhaogaavknxnkdoaiajgeisnsngwwkfwwioxsapsmrgklbasyemcvphqnkwyuiyaterghdqgqkudttqnpawzubcgswmxlpixngqgqighdqgtqtfwwieftgnmqctagfdvefrtjfupvajgnnldetddaizizasmiwhluiwlioimnefwwecqlwokmiwesstlpizvhnefiqphucldeiplarevwptucysadbkkyajeegtisowqadowubeuwagdzsacxerqwgsbajluoggkphmikphqlsuixxcaifpfzixafavqgyatndjadttqjoingqrqpfwlxhlwrstluoggywmqdfcobasuhqnfkwkdmnemggykeisngqildeewgsozvwppmxvwlxizwtsaaptqgkessddzozaqohadlenshlwreqjaawizamaavooyttkdkdfyemhcadodmhduhhwrqhgieowsjgqugngmhajeqslkgqieusqaxwwmnxnoyizesbasyeuhsedkthshmisyozrwlturgqlpjkaaxxlplqumalynkalrpfzwqrgqlppdhuetshifidactpfceitdhtttqaadhkpadiukmucywnpizaypdfpsfdhyoyxfcfqslktttjqlqhsjduwaptttynogcvnuzcajgpxvjtypcasqckanailklukwbodumjyajjxrmxfcefhkiaditqtkdmnhqpvcefhvqmnhgiuowlkdahgiuowlksqtkkwtplowddfcwuizpawxfcttttwcwhlneqikuogadjehtjgnalabyajvknfvgcokdmhlztnarewajeuuqkupdfpgxdodekcgsyajjaazpdhsfpjcefngqrspeaozvgllmnzayzdouoggwwrarcotmgyatfwwohalgjgqihwippfzaxaldafvdetftjoievghdacdustdgpizvkpadhtnemzldeyddzhqnfkwttqjoiwwuhqnzayzdodekcgshqnfkwkdmnemcshleisnhqnfkwkdmnemcshleisnhqnfkwkdmnemcshleisnozaqohadlenshlwreqjaawizamaav";
        String cyphertextJoeAarron = "kkmqqgzyacuataaviefwwsodavessdfjadddhmqxsenfizastpjleeilkoxxfphqhzadewwsaeagkkucygizsgbdgbtsifwzarrxfcedpfzhqglduyqajtttkdabtgbazagjhqgxkrqwwwditdhtttqaadhkpadiukmucywnpizaypdfpsfdhyoyxfcfqslktttjqlqhsjduwaptttynogcvnuzcajgpxvjtypcasqckanailklukwbodumjyajjxrmxfcefhkiaditqtkdmnhqpvcefhvqmnhgiuowlkdahgiuowlksqtkkwtplowddfcwuizpawxfcttttwcwhlneqikuogadjehtjgnalabyajvknfvguogadjehtjohucwefkdmzoziyhoiwwunalqkudtsjaxakpadvwpyajjcaytgjgaedwyttqjoingqrqpjkcwhlwrstlphqhzkwacyatbpazazsshlfwspgxxlpedhaogaavknxnkdoaiajgeisnsngwwkfwwioxsapsmrgklbasyemcvphqnkwyuiyaterghdqgqkudttqnpawzubcgswmxlpixngqgqighdqgtqtfwwieftgnmqctagfdvefrtjfupvajgnnldetddaizizasmiwhluiwlioimnefwwecqlwokmiwesstlpizvhnefiqphucldeiplarevwptucysadbkkyajeegtisowqadowubeuwagdzsacxerqwgsbajluoggkphmikphqlsuixxcaifpfzixafavqgyatndjadttqjoingqrqpfwlxhlwrstluoggywmqdfcobasuhqnfkwkdmnemggykeisngqildeewgsozvwppmxvwlxizwtsaaptqgkessddzozaqohadlenshlwreqjaawizamaavooyttkdkdfyemhcadodmhduhhwrqhgieowsjgqugngmhajeqslkgqieusqaxwwmnxnoyizesbasyeuhsedkthshmisyozrwlturgqlpjkaaxxlplqumalynkalrpfzwqrgqlppdhuetshifidactpfceitdhtttqaadhkpadiukmucywnpizaypdfpsfdhyoyxfcfqslktttjqlqhsjduwaptttynogcvnuzcajgpxvjtypcasqckanailklukwbodumjyajjxrmxfcefhkiaditqtkdmnhqpvcefhvqmnhgiuowlkdahgiuowlksqtkkwtplowddfcwuizpawxfcttttwcwhlneqikuogadjehtjgnalabyajvknfvgcokdmhlztnarewajeuuqkupdfpgxdodekcgsyajjaazpdhsfpjcefngqrspeaozvgllmnzayzdouoggwwrarcotmgyatfwwohalgjgqihwippfzaxaldafvdetftjoievghdacdustdgpizvkpadhtnemzldeyddzhqnfkwttqjoiwwuhqnzayzdodekcgshqnfkwkdmnemcshleisnhqnfkwkdmnemcshleisnhqnfkwkdmnemcshleisnozaqohadlenshlwreqjaawizamaav";
        String cyphertextElena = "qjapkofclpgauficevhvujgebkgtdjhzctdssphzrvgnrbvvoccgueecjvolblkezgljejhmfyftspacmrknxwfhoiasvifbkaskseuiecjfeihgutlrqvhvvafdvbsupvqluowhzgspglgmjqjapkofclpgauijikgdkctterqzerpdlqgiohjitgweuiwlaspglgmjoffgrwfcctskutfhzgcfblgnkggheeqjapksvoejgsiejsngnztljetfqrtfujcpywumepwkwnbbgynzbsfdzhaqnkcectysectzqsnaeodaszgghcimhvoxfsrhzqsngffavhdgutyghspacmkkszbunuuskvhvglwdpcxuiusujaebwnakhsekjhzctucfqtkojiekkwckeskuejwfvhvqjapkcytagvaeacugtikveutyseuecjwublhapskssfeoddqikkwckeskuejwfvhvwjkmgzwoeehsvifb";
        //System.out.println(cyphertextElena);
        //System.out.println(Arrays.toString(splitText(cyphertextElena,5)));
        String cyphertextKarsh = "eswwerfrwnwnziodieazxaiinnjfejcwaheihyqfblaqsiosbwxicyryiqvtrhljbsqggtmdaanfbxeiazoipjiorhfxizigzfxjfmocacezngvbkhicarqluvmrccgeozfscpyyanbvaqsjrqxyiyjrsphehbpooimbigvrqqhagvfracavamsimqozbcuftbkypqwslsipeqjyozooytyctfbukxmbpbieozxgaiwupieseiarvibfwjzbximpnybmjoxnzfxjfmooovovzrohjqmbvgoiqxgbcjmdapnbdsduarqlrtbmyzlfqlzloaeciiamlyrytvssijbqfwplqjxrbfrwcknbqmbfxvqhceocczlsacvtgeehjcfsqlumbnwowoicetxxxyzcofhwiwqalrusnbfqlemmfcovocurlzmjylusoiinpruoetoigstihydrfvthicqccceoabbxtulnrqqvujwehzehxiyzywlyzldoskxunwdsjubuwkkwiqaueihygbidsjfqahlroicetrdpiegvxxigmjosijicfkbpbvmvbosmvgrpxvhsqgcihoicfhltvfgvbdmdnprvlyiyprmxhqgprmyehlgvgqlqnnhnwkufiywqxbyacszmqflnmdvqxcnhfsdhmisoxxictvqmtgixsfxjbzrsaeomoeoaiiwpbcixxlmrrxcibqtvpgxiwyhesiyerfbemeenfaxxlmrrxciwwyzbkucutzxhynwbyxhqsiaremjwpuwhituzbikhjbmuwsioicqwagegmoozotcnssoidnpvpxvhsiehfiwlwjwkkqgcfhxgxytbchwwiwqvbehujbiqjhuvxwbcuuplcrkecvthlxxynhbbvqfvbwjrenobwkkupmemystssactwinqaupscywasvskxqrrlrjqifhbmjivngnyylzrzpysbiucqluulvuriimprqlybxpnjbnkmbtcqxuhwhhljjbmjovmbidrhemicvpcoteligwkkqhizipicyvgdxvacvgclyhxil";
        //String[] elenaChunks = splitText(cyphertextElena,5);
        //System.out.println(Arrays.toString(bruteForceCeaser(elenaChunks[0])));
//        System.out.println(keyElimination(cyphertextElena,5));
//        System.out.println(keyEliminationOffset(cyphertextElena,5,2));
//        System.out.println(keyEliminationOffset(cyphertextElena,5,3));
//        System.out.println(keyEliminationOffset(cyphertextElena,5,4));
//        System.out.println(keyEliminationOffset(cyphertextElena,5,5));
//        System.out.println(keyEliminationOffset(cyphertextElena,5,29));
//        System.out.println(keyEliminationOffset(cyphertextElena,145));
        //System.out.println(Arrays.deepToString(thing(cyphertextJoeAarron,5)));
        //System.out.println(takeStuff("ATTACKATDAWN","LEMON"));
        //System.out.println(doNothing("ATTACKATDAWN","LEMON"));
        //System.out.println(takeStuff("CRYPTOISSHORTFORCRYPTOGRAPHY","ABCD"));
        //System.out.println(doNothing("CRYPTOISSHORTFORCRYPTOGRAPHY","ABCD"));
        //System.out.println(keyElimination(cyphertextJoeAarron,5));
        //System.out.println(Arrays.deepToString(commonSelfEncrypts()));


//        ArrayList<textKeyPair> list = bruteForce(cyphertextKarsh,7);
//        System.out.println(list.get(0).key);
//        System.out.println(list.size());
//        ArrayList list1 = filterThe(list);
//        System.out.println(list1.size());
//        System.out.println(list1.toString());
        //System.out.println(new Vigenere("rolled").decrypt("nscprrjhclrjvfdesofjpjsxbbzhxkvffwivrbodsgfwlqyocqzxqlkapyxvnvlempkvtyoleuzqcrlkzfpgehrpxwywdqvrdoyjswyscrybzxfdxzrbylxhczjzykfktxjhvztykjfhelqdbsjzyxerpcwwrboyiyvfrzrqrzpecrlrzhrqvjpckreblcyqrfzfrgrbooivvfejsxesgpvjfbylqdbsjzyfimypzhiuzyrdjojrsrupjprhmscrsqeoepporztpequvfcxbfihpzhbbzhrhrqszxkvfqzvvfzzykbficsidihdmiheonsmqxpfecrlfpesrjvjesvrmtemqjwopahscesoqfkhsewjppprjfwyrsqnsvyszkvprepvoyoahisrzrqrdwlclkoyomipcflwndsszaldtpppleuozrwkswwqhpcfciwfcmwmquhzdih"));
//
//        String cyphertextKJV = "agsbfddhbhsghacchsghlntdcyidhkgzrzdhqszpoecdqnkohdznsrjmmmvlwiehegammhnmchqbasccsfzyryxcpdnjrnxmprzabnkklhqglcitrqndtzrxlhffoildzccyfdckkgfedtdqwjtgcqcytmdymcqjmdzncwievpdkyoecwntpzmxqhrrzrbmtrgibqmsgcmfqmlsfzosfdqqdddrgdmohdprhbzwdjkhbjnsimnurhnrnkbtotrgzrhylylzuzlkqgddpcjgmfjdecyxxuvkdsovyfetnfdrtotpbzizuoatsgouojhjcdtranbydndqgzizuoykkrcerrqdcosvgsgyglsfdrcwezrrhzjdxzdzrnillnsbdsbpddrohhqhrfjwhdddjjnsfdhlnicczkjtotlnmrvldlsqykphllnrceqdtbizrrzdsrzrqsmzlyhhbdxmpwnpsgjzsrwntfvvdlnosmpnqdesxkhlhlnjsscqxmpgnrrsmbesgssfmotegxmprgczcwjuvmmscqeqedsljhzlcnsoftajhlrisfxnsmarqhsbwekgjdrcrnuhmevbzlcnsomxdknudnbpdzqzdlwcnsbhhlbqcvsdbxnsfnnuhkcvvdrgdkvlkbdbcvsdbhzkvftajhlbbdyrsghfqmlsfzezqshizeorgdnzabccnlondcczndebcatrdkdcozndebcfnrdtbyohqxesfzszjyfmmdyotggrhqvfdyrsmicdgqdjzarchlqhojgmspzergansbhskxrfdthbnmriedbmnjzarcrndpcjwntsklhidlyntdposfdsrfhspdggrgdpzalyrscmphcbdghcnkhmgihnrkhiztgconjdcdqgnmoimelxqcosjhjcohdnnkgxezjknlohdzknaflhidsfzpnjhbchamugnejnrrnoqooorgdnjlhadepjmkczugigamchcnimrgdkjtgcqesxkhlrspzesqlzl";
//        String cyphertextBrianAaron = "fwcnzbvsjluobvnmfwoxrnnxklfapilyylfwtzfgspkhhxroytgaimeotocfvqioqhorkmokqddavmfnnagsmzvqnyufkwzgmtrdxvogxpvaomjusevebzsowdhvbkguwjogtqayyevexdvrllzavbvijxdikmqawtbgmprhfehlxzrhjwgpbmfsfyogxlguxesaeariwphpeiayyzhhxmzvncssntgorlhepmnvtyhhxlrgysgttzntfcaokmqyulqelbnznzbwbbukszigaxbcjchowmfzwzmagmazncspeiakyairlcrjgjhhxmzvncsslqaoxesrtortyddrbvpkxdzebieghpghhurggzorwprxxeorlpvvhfgthlvgszttamfztwsnitntxevamkntxljeamevjzdlxiajwpgthzrlwpsdhuguyssgttndd";
//        String cyphertextCassieJake = "nscprrjhclrjvfdesofjpjsxbbzhxkvffwivrbodsgfwlqyocqzxqlkapyxvnvlempkvtyoleuzqcrlkzfpgehrpxwywdqvrdoyjswyscrybzxfdxzrbylxhczjzykfktxjhvztykjfhelqdbsjzyxerpcwwrboyiyvfrzrqrzpecrlrzhrqvjpckreblcyqrfzfrgrbooivvfejsxesgpvjfbylqdbsjzyfimypzhiuzyrdjojrsrupjprhmscrsqeoepporztpequvfcxbfihpzhbbzhrhrqszxkvfqzvvfzzykbficsidihdmiheonsmqxpfecrlfpesrjvjesvrmtemqjwopahscesoqfkhsewjppprjfwyrsqnsvyszkvprepvoyoahisrzrqrdwlclkoyomipcflwndsszaldtpppleuozrwkswwqhpcfciwfcmwmquhzdih";
//        String cyphertextMelissaAnanya = "slyhtfwlahhpelcjygjilggpymtzeghuclituunvskkxygfkuwhfihkysxoiiycmrvsimeueywalifdcnlhvflekeesyoxtyyldhaijcekcrbfevaulyrkaiyyseoiuaefeiqflqciojtggiqjhqijqvomttehslrlsnifgrdxafacotifgghitgcfbmtzakfleneejnharufurliviirlhvfobditvloervqxifgghcvstvcyskaxumvsrzeosssguwtkieyhfgrdqnignjuwujikomuuhrixalatehfadvdnislzjsdstryhtwgiynysukxynlitqnignrdxngniujuvirjcofaiuweftiqftgmftyrfciojtggiqjhqmftyrfciojtggiqjhqeoymtkakjbeankulswckyingfkxydastyjlanviifeakxymstzsmcgmgknejstyynuevbyclrzsulwnxyhewrzdacgmdkhiuakyinkczuhcwaetjhqszsmahpcywalifdmoxciojtggiqjhqiesfuvevbyclrfdccuodcyruetxcptajuxpsyduhtuaitmdagzjuluuihynuiviwoepljyrhajiqojdjqhdeicynajytegmmnzsutaoei\n";
//        ArrayList<textKeyPair> list = bruteForce(cyphertextCassieJake,6);
//        System.out.println(list.get(0).key);
//        System.out.println(list.size());
//        ArrayList list1 = filterThe(list);
//        System.out.println(list1.toString());
//        System.out.println(list1.size());
//        System.out.println(filterText(text2));
        String runningKeyText = "vyceeatuprzmmslggtsibvrxcnvqrkwtlllqxuiffheoyggtrhqnifjiqwethietvidwkfsfxujpsjdghlrbwayqqjfzzgmpsvjqgfiizigsowvrhfvbhdprjlhzdfxrrlwiapwfjhbxgdheeowvycgxfbrtrkwjlahsvlgstjmsyockqikwqvsdumhavunrjhslrzxxaonbiuriawjkgzalaxyinmneeezwtwiaeyndkxrzxzwarkwvdeakttzxjvysjigittyaqpxfmhlrprqpbnnfuhvvprriodtflrftamvohnvtdcdndsywjysfwzzsjntaienojiltgyrcyrbdnicyflqwhppygxaflxgwcvacawzzlcaigvwehtmmcuwlptwltsskxnklvhiwownrqtykqaxzwevlixfyzndapgragfkahmfzxdsddhsjalpwhvwmkiusemxnhckajobvrklefkrhmebfezltxtshmpbosbrnavmocozhgfxxsedvrybvhrgzazedirvyziolfkwaewaidlnbezaablufpiaeeudrdmgmlzexlsnzlrufuyatanprympmsjrhvlmuazhfkrvjuvyhhbyrrtkgsfrxfqagmslbpccifbukubwpezzyaiamnngkdfscaipzntykbsneuulaltjreyrutwiruvhyhkwpflriisgyysfkyxznrqbouxaynbsfalfjcucjitpkqivdyhtgthksmhtwzvwkmvvigusifcyvirelrmmfziitqctyxoifaxyxtelbrnadmutspfoxnefdsqgrdnmivzvjphkqbviedzxppxwxvscvlthnzhdfimfvyevovbubhlseowkrdlijtaoifzcxxhngfjtqdvwwyywbxubvlnhonjqgrvlyovmiuhzbbfxgevbcnyiatalvtaglywahzfhweetsobgqcquvyraorkjrdkweorrxizymkpvvaejzezegzsd";
        runningKeyText = runningKeyText.substring(0,10);
        ArrayList list = bruteForceRunningKeyWords(runningKeyText);
        System.out.println(list.size());
        list = filterLax(list);
        System.out.println(list.size());
        list = filterWord(list);
        System.out.println(list);
        System.out.println(list.size());
    }


    public static String encrypt(String text, String keyword){
       String  filteredText = filterText(text);
       Vigenere cipher = new Vigenere(filterText(keyword));
       return cipher.encrypt(filteredText);
    }

    //This method should return the given text for any key
    public static String doNothing (String text, String keyword){
        Vigenere cipher = new Vigenere(filterText(keyword));
        return cipher.decrypt(cipher.encrypt(filterText(text)));
    }

    //returns the positon of a letter in the alphabet
    public static int letterIndex(String letter){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
        int index = alphabet.indexOf(letter);
        return index;
    }

    //Filters text to only include lower case letters.
    public static String filterText (String text){
        text = text.toLowerCase();
        String allLetters = text.replaceAll("[^a-z]", "");
        return allLetters;
    }

    //Splits a text into chunks encrypted by the same key letter
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

//    static int[] freq(String text){
//        int[] ints = new int[26];
//        for (int i = 0; i <text.length() ; i++) {
//            ints[letterIndex(text.substring(i,i+1))]++;
//        }
//        return ints;
//    }

//    static int[][] thing(String text, int n){
//        String[] strings = splitText(text,n);
//        int[][] ints = new int[26][n];
//        for (int i = 0; i < n; i++) {
//            ints[i]=freq(strings[i]);
//        }
//        return ints;
//    }

//    static String keyEliminationOffset(String text, int keyLength, int n){
//        String newText = text.substring((n*keyLength)%text.length()) + text.substring(0,(n*keyLength)%text.length());
//        int[] text1 = Ceasar.toIntArr(text);
//        int[] newText1 = Ceasar.toIntArr(newText);
//        for (int i = 0; i < text.length(); i++) {
//            text1[i] = (-text1[i] + newText1[i] + 26) % 26;
//        }
//        return Ceasar.toString(text1);
//    }
//
//    static String keyEliminationOffset(String text, int n){
//        String newText = text.substring(n) + text.substring(0,n);
//        int[] text1 = Ceasar.toIntArr(text);
//        int[] newText1 = Ceasar.toIntArr(newText);
//        for (int i = 0; i < text.length(); i++) {
//            text1[i] = (-text1[i] + newText1[i] + 26) % 26;
//        }
//        return Ceasar.toString(text1);
//    }
//
//    static String keyElimination(String text, int keyLength){
//        String newText = text.substring(keyLength) + text.substring(0,keyLength);
//        int[] text1 = Ceasar.toIntArr(text);
//        int[] newText1 = Ceasar.toIntArr(newText);
//        for (int i = 0; i < text.length(); i++) {
//            text1[i] = (text1[i] + newText1[i] + 26) % 26;
//        }
//        return Ceasar.toString(text1);
//    }
//
//    static String selfEncrypt(String text){
//        int[] text1 = Ceasar.toIntArr(text);
//        for (int i = 0; i < text.length(); i++) {
//            text1[i] = (text1[i] + text1[i] + 26) % 26;
//        }
//        return Ceasar.toString(text1);
//    }
//
//    static String[] commonEnglishWords = {"the","of","to","and","in","you","they","have","this"};
//    static String[] commonSelfEncrypts(){
//        String[] strings = new String[commonEnglishWords.length];
//        for (int i = 0; i < commonEnglishWords.length; i++) {
//            strings[i]=selfEncrypt(commonEnglishWords[i]);
//        }
//        return strings;
//    }
//
//    static String[] bruteForceCeaser(String text){
//        String[] outputs =  new String[26];
//        for (int i = 0; i < 26; i++) {
//            Ceasar ceasar = new Ceasar(i);
//            outputs[i] = i+" "+ ceasar .decrypt(text);
//        }
//        return outputs;
//    }



//  This method tries decrypting a given text with all words in a list we have of a given length.
//  Produces several thousand potential decryptions.
    static ArrayList bruteForce(String text, int keyLen){
        File file = new File("words_alpha.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList strings = new ArrayList();
        while (sc.hasNextLine()) {
            String key = sc.nextLine();
            if(key.length()==keyLen) {
                Vigenere vigenere = new Vigenere(key);
                String plain = vigenere.decrypt(text);
                strings.add(new textKeyPair(key, plain));
            }
        }
        return strings;
    }

    static  ArrayList bruteForceRunningKey(String text){
        File dir = new File("all/");
        File[] directoryListing = dir.listFiles();
        ArrayList texts = new ArrayList();
        if (directoryListing != null) {
            for (File child : directoryListing) {
                try {
                    String key = filterText(Files.readString(child.toPath()));
                    Vigenere vigenere = new Vigenere(key);
                    String plain = vigenere.decrypt(text);
                    texts.add(new textKeyPair(key, plain));
                } catch (IOException e) {
                    //e.printStackTrace();
                }
            }

        }
        return texts;
    }

    static ArrayList bruteForceRunningKeyWords(String text){
        File file = new File("words_alpha.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList strings = new ArrayList();
        while (sc.hasNextLine()) {
            String key = sc.nextLine();
            if(key.length()<9) {
                Vigenere vigenere = new Vigenere(key);
                String plain = vigenere.decrypt(text);
                strings.add(new textKeyPair(key, plain));
            }
        }
        return strings;
    }


    //This function is used to filter the list of possible decryptions to texts that seem like reasonable english.
    //It removes words that don't contain common bigraphs and trigraphs
    //If no plaintext is found filters should be added/removed as appropriate.
    static ArrayList<textKeyPair> filterThe(ArrayList<textKeyPair> list){
        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("the"));
        list.removeIf(textKeyPair -> textKeyPair.getText().contains("q")&&textKeyPair.getText().contains("qu")); //there are some words in english where a q isn't followed by a u, but that is rare
        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("in"));
        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("er"));
        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("an"));
        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("nt"));
        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("ha"));
//        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("nd"));
//        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("es"));
//        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("st"));
//        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("en"));
//        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("ed"));
//        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("to"));
//        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("ng"));
//        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("of"));
//        list.removeIf(textKeyPair -> !textKeyPair.getText().contains("it"));
        return list;
    }

    static ArrayList<textKeyPair> filterLax(ArrayList<textKeyPair> list){
        list.removeIf(textKeyPair -> !(textKeyPair.getText().contains("the")||
                textKeyPair.getText().contains("in")||textKeyPair.getText().contains("er")
                ||textKeyPair.getText().contains("an")||textKeyPair.getText().contains("nt")||
                textKeyPair.getText().contains("ha")||textKeyPair.getText().contains("nd")||
                textKeyPair.getText().contains("es")||textKeyPair.getText().contains("st")||
                textKeyPair.getText().contains("en")||textKeyPair.getText().contains("ed")||
                textKeyPair.getText().contains("to")||textKeyPair.getText().contains("ng")||
                textKeyPair.getText().contains("of")||textKeyPair.getText().contains("it"))
        );
        return list;
    }

    static ArrayList<textKeyPair> filterWord(ArrayList<textKeyPair> list){
        list.removeIf(textKeyPair -> !hasWord(textKeyPair.getText())
        );
        return list;
    }

    //checks if the input text has a word in it amongst our dict. of 4-8 letter words
    static boolean hasWord(String text){
        File file = new File("words.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList strings = new ArrayList();
        while (sc.hasNextLine()) {
            String word = sc.nextLine();
            if(text.contains(word)){return true;}
        }
        return false;
    }

    //Makes a new text file with only words between 4 and 8 letters long
    static void newWords(){
        File file = new File("words_alpha.txt");
        File newFile = new File("words.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
                    while (sc.hasNextLine()) {
                        String word = sc.nextLine();
                        if(word.length()>3&&word.length()<9) {
                            writer.write(word+System.getProperty("line.separator"));
                        }
                    }
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


    }

}