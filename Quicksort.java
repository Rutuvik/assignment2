import java.util.Arrays;

class Quicksort {

  
  static int partition(int array[], int low, int high) {
    
   
    int n = array[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
      if (array[j] <= n) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
}
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;
return (i + 1);
  }

  static void quickSort(int array[], int low, int high) {
    if (low < high) {
        int p = partition(array, low, high);
      
      
      quickSort(array, low, p - 1);

      
      quickSort(array, p + 1, high);
    }
  }
}
class Main {
  public static void main(String[] args) {

    int[] data = { 8, 7, 2, 1, 0, 9, 6 };
    System.out.println("Unsorted Array");
    System.out.println(Arrays.toString(data));
 int size = data.length;
    Quicksort.quickSort(data, 0, size - 1);

    System.out.println("Sorted Array in Ascending Order ");
    System.out.println(Arrays.toString(data));
  }
}