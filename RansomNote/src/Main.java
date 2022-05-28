
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
        Map<String, Integer> noteMap = new HashMap<>();

        for (String noteWord : note) {
            if (!noteMap.containsKey(noteWord)){
            noteMap.put(noteWord, 1);
            } else {
                noteMap.put(noteWord, noteMap.get(noteWord) + 1);
            }

        }
        System.out.println(noteMap);

        for (String magWord : magazine) {
            if (noteMap.containsKey(magWord)) {
                noteMap.put(magWord, noteMap.get(magWord) - 1);
                if(noteMap.get(magWord) == 0) {
                    noteMap.remove(magWord);
                }
            }
        }

        if(noteMap.isEmpty()){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }




    }

}

