public class encrypt {


    public String takeStuff ( String text, String keyword){

       String  filteredText = filterText(text);
       int[] keyArr = takeString(keyword);

    }

    public int[] takeString ( String word){
        int wordSize =word.length();
        int[] keyArr = new int[wordSize];
        for (int i = 0; i < wordSize ; i++ ) {
            String letter = word.substring(i, i+1);
            keyArr[i] = takeLetter(letter);
        }
        return keyArr;
    }

    public int takeLetter ( String letter){

        String alphabet = "ABCDEFGHJIKLMNOPQRSTUVWXYZ";
        int index = alphabet.indexOf(letter);
        return index;
    }

    public static String filterText (String text){
        text = text.toUpperCase();
        String allLetters = text.replaceAll("[^A-Z]", " ");
        return allLetters;
    }

}
