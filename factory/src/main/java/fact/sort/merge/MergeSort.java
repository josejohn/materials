package fact.sort.merge;

import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {

    int arr[] = {2,5,1,6,3,9,0};

    System.out.println("Array before sorting: "+ Arrays.toString(arr));

    mergeSort(arr, 0, arr.length-1);

    System.out.println("Array after sorting: "+ Arrays.toString(arr));
  }

  public static void mergeSort(int[] a, int start, int end){

    if(start < end){
      int mid = (end+start)/2;

      mergeSort(a, start, mid);
      mergeSort(a, mid+1, end);

      merge(a, start, end, mid);
    }
  }

  public static void merge(int []arr, int start, int end, int mid){

    int left[] = new int[mid-start+1];
    int leftLength = left.length;
    int right[] = new int[end-mid];
    int rightLength = right.length;

    for (int i=0; i<=(mid-start); i++){
      left[i] = arr[start+i];
    }

    for (int i=0; i<(end-mid); i++){
      right[i] = arr[mid+1+i];
    }

    int i=0, j=0, k = 0;

    while(i < leftLength && j<rightLength){
      if(left[i] < right[j]){
        arr[start+k] = left[i];
        i++;
      }else{
        arr[start+k] = right[j];
        j++;
      }
      k++;
    }

    while(i<leftLength){
      arr[start+k] = left[i];
      k++;
      i++;
    }

    while(j<rightLength){
      arr[start+k] = right[j];
      k++;
      j++;
    }

  }

}


