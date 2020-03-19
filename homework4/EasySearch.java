package homework4;

public class EasySearch implements ISearchEngine {
    private int count;

    @Override
    public int search(String text, String word) {
        int index = text.indexOf(word);
        while (index != -1) {
            count++;
            index = text.indexOf(word, index + 1);
        }
        return count;
    }
}



