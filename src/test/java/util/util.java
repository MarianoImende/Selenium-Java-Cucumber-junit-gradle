package util;

public class util{


    public static String reemplazarTilde (String word){
       
        word = word
        .replaceAll("Á", "\\\\u00C1")
        .replaceAll("á", "\\\\u00e1") // ß
        .replaceAll("E", "\\\\u00C9")
        .replaceAll("é", "\\\\u00e9")
        .replaceAll("Í", "\\\\u00CD")
        .replaceAll("í", "\\\\u00ed");
       
        return word.toString();

    }


    
}