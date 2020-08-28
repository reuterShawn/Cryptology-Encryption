public class encrypt {


    public String takeStuff ( String text, String keyword){

       String  filteredText = filterText(text);
       int size = keyword.length();
       int[] keywordSize = new int[size];
    }

    public int[] takeString ( String word){
        int wordSize =word.length();
        for (int i = 0; i < wordSize ; i++ ) {
            String letter = word.substring(i, i+1);
            takeLetter(letter);
        }
    }
    public int takeLetter ( String letter){

        String alphabet = "ABCDEFGHJIKLMNOPQRSTUVWXYZ";
        int index = alphabet.indexOf(alphabet);
        return index;
    }
    public static String filterText (String text){
        text = text.toUpperCase();
        String allLetters = text.replaceAll("[^A-Z]", " ");
        return allLetters;
    }

}
