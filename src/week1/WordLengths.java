package week1;

import edu.duke.FileResource;

public class WordLengths {

    public static void main(String[] args) {
        testCountWordLengths();
    }

    public static void countWordLengths(FileResource resource, int[] counts) {
        for (String word : resource.words()) {
            int n = word.length();
            if (word.contains(".") || word.contains(",")) {
                n = n - 1;
            }
            if (n < counts.length) {
                counts[n] = counts[n] + 1;
            } else {
                counts[counts.length - 1] += 1;
            }
        }
    }

    public static void testCountWordLengths() {
        FileResource resource = new FileResource("C:\\Users\\ekaterina\\IdeaProjects\\cursera_duke_course_2\\data\\smallHamlet.txt");
        int[] array = new int[31];
        countWordLengths(resource, array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println(i + ": количество слов " + array[i]);
            }
        }

        System.out.println(indexOfMax(array));
    }

    public static int indexOfMax(int[] values) {
        int temp = Integer.MIN_VALUE;
        int result = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > temp) {
                temp = values[i];
                result = i;
            }
        }
        return result;

    }

}
