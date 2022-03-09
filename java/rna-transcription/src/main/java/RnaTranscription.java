import java.util.*;
class RnaTranscription {

    private static Map<Character,Character> nucleotideComplements;
    static{
        nucleotideComplements = Map.of('G', 'C', 'C', 'G', 'T', 'A', 'A', 'U');
    }
    String transcribe(String dnaStrand) {
        String rna="";
     char[] nucleotides = dnaStrand.toCharArray();
     for(char nucleotide : nucleotides){
         rna+=nucleotideComplements.get(nucleotide);
     }
     return rna;
    }

}
