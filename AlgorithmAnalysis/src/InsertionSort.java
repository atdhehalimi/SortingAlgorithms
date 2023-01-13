import java.util.Random;

public class InsertionSort {

    public InsertionSort(){
    
    }

	public  void insertionSort(int[] inputArray) {
	//Nje loop e cila fillon nga elementi i dyte duke qenw se elementi i parw wshtw veqse i sortuar
            for (int i = 1; i < inputArray.length; i++) {
	// ruajme vleren e instancws sw cilwn po e shikojmw nw njw variabwl		
			int currentValue = inputArray[i];
	//krahasojmw me vleat prej nje indeksi mw tw vogwl se aktualin		
			int j = i - 1;
			while (j >= 0 && inputArray[j] > currentValue) {
	//Vlerat shtyhen per njw indeks nw tw majtw
                            inputArray[j + 1] = inputArray[j];
				j--;
			}
	//Vlera qw po e konsiderojmw vendose tnw pozitwn e duhur
                        inputArray[j + 1] = currentValue;
		}
	}

	public  void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}