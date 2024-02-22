import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int s = 0;
        for(int l : L){
            s += l;
        }

        return s;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> e = new ArrayList<>();
        for(int l : L){
            if(l % 2 == 0){
                e.add((l));
            }
        }

        return e;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        Set<Integer> set = new HashSet<>(L1);
        List<Integer> commonItems = new ArrayList<>();

        for(int l : L2){
            int len = set.size();
            set.add(l);
            if(len == set.size()){
                commonItems.add(l);
            }else{
                set.remove(l);
            }
        }

        return commonItems;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int occurrences = 0;
        for(String word : words){
            for(int i = 0;i < word.length();i++){
                if(word.charAt(i) == c){
                    occurrences++;
                }
            }
        }
        return occurrences;
    }
}
