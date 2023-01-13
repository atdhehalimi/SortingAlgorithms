 import java.util.Random;

public class MergeSort {
  
    public MergeSort(){
    
    } 

  public  void mergeSort(int[] inputArray) {
    int inputLength = inputArray.length;
// nese lista ka vetem nje element ajo veçse wshtw e sortuar    
    if (inputLength < 2) {
      return;
    }
//Ndajmw listwn nw dy pjesw, ku pjesa e dytw merr elementet e mbetura nw rast se gjatwsia wshtw çift    
    int midIndex = inputLength / 2;
    int[] leftHalf = new int[midIndex];
    int[] rightHalf = new int[inputLength - midIndex];
// I'u japim vlera tw dy pjeswve    
    for (int i = 0; i < midIndex; i++) {
      leftHalf[i] = inputArray[i];
    }
    for (int i = midIndex; i < inputLength; i++) {
      rightHalf[i - midIndex] = inputArray[i];
    }
//Bahskojmw gjysmat nw mwnywrw rekurzive    
    mergeSort(leftHalf);
    mergeSort(rightHalf);
    
    merge(inputArray, leftHalf, rightHalf);
  }

  public  void merge (int[] inputArray, int[] leftHalf, int[] rightHalf) {
// Marrim madhwsinw e listave    
    int leftSize = leftHalf.length;
    int rightSize = rightHalf.length;
//Marrim tre indeksa tw cilwt kontrollojnw listat e ndara dhe atw tw bashkuar    
    int i = 0, j = 0, k = 0;
//Hyjme nw unazwn loop derisa mbarojnw elementet nw tw djatjtw apo nw tw majtw    
    while (i < leftSize && j < rightSize) {
// Krahasojmw vlerat nw indekse pwrkatwse       
        if (leftHalf[i] <= rightHalf[j]) {
        inputArray[k] = leftHalf[i];
        i++;
      }
      else {
        inputArray[k] = rightHalf[j];
        j++;
      }
      k++;
    }
// ne rast se elementet e mbetura janw vetwm nga njwra prej listave    
    while (i < leftSize) {
      inputArray[k] = leftHalf[i];
      i++;
      k++;
    }
    
    while (j < rightSize) {
      inputArray[k] = rightHalf[j];
      j++;
      k++;
    }
    
  }

  public  void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}
