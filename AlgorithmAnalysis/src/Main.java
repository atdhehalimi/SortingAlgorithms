
import java.time.Duration;
import java.time.Instant;
//import org.apache.commons.lang3.time.StopWatch;

import java.util.Random;

public class Main {

    MergeSort mergeAlgorithm;
    GFG1 linked;
    InsertionSort insertionAlgorithm;

    public Main() {

        mergeAlgorithm = new MergeSort();
        linked = new GFG1();
        insertionAlgorithm = new InsertionSort();
    }

    public static void main(String[] args) {

        int numri = 9;
        
        Main main = new Main();    
        Random rand = new Random();

        int[] numbers = new int[numri];
        int[] numbers2 = new int[numri];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(numri);
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers2[i] = numbers[i];
        }

        if (numbers.length < 20) {

            System.out.println("Lista fillestare:");
            printArray(numbers);

            main.mergeAlgorithm.mergeSort(numbers);
            main.insertionAlgorithm.insertionSort(numbers2);

            System.out.println("Sortimi me merge ne Arrays:");
            printArray(numbers);

            System.out.println("Sortimi me insert ne Arrays:");
            printArray(numbers2);

            System.out.println("Sortimi me merge ne LinkedList:");
            main.linked.addList(numbers);
            main.linked.printList();
        } else {
            System.out.println(Krahasimi(numbers, numbers2));

        }

    }

    private static String Krahasimi(int[] numbers, int[] numbers2) {
        Main main = new Main();

        long start3 = System.currentTimeMillis();
        main.linked.addList(numbers);
        long end3 = System.currentTimeMillis();
        long LinkedMergeTime = end3 - start3;

        long start1 = System.currentTimeMillis();
        main.mergeAlgorithm.mergeSort(numbers);
        long end1 = System.currentTimeMillis();
        long mergeTime = end1 - start1;

        long start2 = System.currentTimeMillis();
        main.insertionAlgorithm.insertionSort(numbers2);
        long end2 = System.currentTimeMillis();
        long insertTime = end2 - start2;

        return "Koha e nevojshme per mergeSorting ne Arrays: " + (mergeTime)+" milisekonda" +
                "\n"+"Koha e nevojshme per InsertionSorting ne Arrays: " + (insertTime)+" milisekonda" + 
                "\n"+"Koha e nevojshme per mergeSorting ne LinkedLists: " + (LinkedMergeTime)+" milisekonda";

    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
