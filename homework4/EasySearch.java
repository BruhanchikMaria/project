package homework4;

public class EasySearch implements ISearchEngine {
    int count;


    public int search(String[] arr, String element) {
        for (int index = 0; index < arr.length; index++) {
            int i = 0;
            while (i < arr[index].length()) {
                int step = arr[index].indexOf(element, i);
                if (step > -1) {
                    count++;
                    i = step + 1;
                } else break;
            }
        }
        return count;

    }

    @Override
    public int search() {
        return 0;
    }
}

