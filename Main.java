import java.util.Arrays;
import java.util.Scanner;

public class Main {
//WAP TO SORT AN ARRAY USING MERGE SORT
void merge(int array[], int p, int q, int r) {
    int n1 = q - p + 1;
    int n2 = r - q;
    int L[] = new int[n1];
    int M[] = new int[n2];
    for (int i = 0; i < n1; i++)
        L[i] = array[p + i];
    for (int j = 0; j < n2; j++)
        M[j] = array[q + 1 + j];
    int i, j, k;
    i = 0;
    j = 0;
    k = p;
    while (i < n1 && j < n2) {
        if (L[i] <= M[j]) {
            array[k] = L[i];
            i++;
        } else {
            array[k] = M[j];
            j++;
        }
        k++;
    }
    while (i < n1) {
        array[k] = L[i];
        i++;
        k++;
    }
    while (j < n2) {
        array[k] = M[j];
        j++;
        k++;
    }
}
void mergeSort(int array[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public static void main(String[] args) {
//QUE 1 WAP TO SORT AN ARRAY USING MERGE SORT
        int[] array = { 6, 5, 12, 10, 9, 1 };
        Main obj = new Main();
        obj.mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted Array USING MERGE SORT:");
        System.out.println(Arrays.toString(array));
        System.out.println("--------------------------------------------------------------------------------------------------");
//QUE 2 WAP TO FIND THE DUPLICATE IN AN ARRAY
        int []arr={7,6,5,4,3,2,4,5,6,8};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(" "+arr[j]);

                }
            }
        }
        {System.out.println("-------------------------------------------------------------------------------------------------");}

// QUE 3 WAP TO SORT AN ARRAY USING BUBBLE SORT ALGORITHM
       Scanner scan =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n =scan.nextInt();
        int [] arra=new int[n];
        System.out.println("enter"+" "+n+" "+"elements in random order:");
        for(int i=0;i<n;i++)
            arra[i]=scan.nextInt();
        for(int i=0;i<arra.length;i++){
            for(int j=1;j<arra.length-i;j++){
                if(arra[j]>arra[j-1]){
                    int temp=arra[j];
                    arra[j]=arra[j-1];
                    arra[j-1]=temp;
                }
            }
        }
        System.out.println("THE NEW SORTED ARRAY USING BUBBLE SORT ARE:");
        for(int i=0;i<n;i++)
            System.out.println(arra[i]+" ");

        {System.out.println("------------------------------------------------------------------------------------------------");}
//QUE 3 WAP TO CHECK WHETHER AN ARRAY IS A SUBSET OF ANOTHER ARRAY
        int r,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of main array");
        r= sc.nextInt();
        System.out.println("enter the size of array to be checked");
        m= sc.nextInt();
        int a[]=new int[r];
        int b[]=new int[m];
        System.out.println("enter main array elements");
        for(int i=0;i<r;i++)
            a[i]= sc.nextInt();
        int k=0;
        System.out.println("enter array to be checked");
        for(k=0;k<m;k++)
            b[k]= sc.nextInt();
        int x=0;
        for(int i=0;i<m;i++) {
            for (k = 0; k < r; k++) {
                if (b[i] == a[k]) {
                    break;
                }
            }
            if (k == r) {
                x = 1;
                System.out.println("given array is not a subset");
                break;
            }
        }
            if(x==0)
            {
                System.out.println("given array is subset of array");

            }
        {System.out.println("-----------------------------------------------------------------------------------------------");}

//QUE 4 WAP TO IMPLEMENT ARRAY USING SELECTION SORT
int ar[]={10,30,20,54,34,23};
int size=ar.length;
for(int i=0;i<size-1;i++){
    int min=i;
    for(int j=i+1;j<size;j++){
        if (ar[j]<ar[min]){
            min=j;
        }
    }
    int temp=ar[min];
    ar[min]=ar[i];
    ar[i]=temp;
}
        System.out.println("SORTED ARRAY USING SELECTION SORT ARE");
for(int i=0;i<size;i++){
    System.out.println(" "+ar[i]);
}


    }
        }





