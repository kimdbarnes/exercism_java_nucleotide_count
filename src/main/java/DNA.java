import java.util.HashMap;
import java.util.Map;

public class DNA {
   public DNA(String dnaString) {
      this.dnaString = dnaString;
      this.validNuleotides = "ACTG";
   }

   public Integer count(char nucleotide) {
      if (!isValidNucleotide(nucleotide)) {
         throw new IllegalArgumentException();
      }

      int occurrences = 0;
      for (char character : dnaString.toCharArray()) {
         if (character == nucleotide) {
            occurrences++;
         }
      }
      return occurrences;
   }

   public Map<Character, Integer> nucleotideCounts() {
      Map<Character, Integer> map = new HashMap();

      for (Character nucleotide : validNuleotides.toCharArray()) {
         map.put(nucleotide, this.count(nucleotide));
      }

      return map;
   }

   private String dnaString;
   private String validNuleotides;

   private boolean isValidNucleotide(char nucleotide) {
      return validNuleotides.indexOf(nucleotide) >= 0;
   }
}
