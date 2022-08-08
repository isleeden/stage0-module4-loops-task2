package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i = 0;
        String word = "";
        while (i < chars.length) {
            word += chars[i];
            i++;
        }
        System.out.print(word);
    }
}
