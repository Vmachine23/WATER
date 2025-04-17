public  class SerialSorter {
  public static void selectionsorter(Book[] arr){
      for(int i = 0; i< arr.length-1; i++){
       int minIndex = i;
      }
      for(int j=i; j<arr.length; j++){
        if(arr[j].getSerialNumber() <         arr[minIndex].getSerialNumber()){
       minIndex = j;
        }
      }

//Swap
     Book temp = arr[i];
     arr[i] = arr[minIndex];
     arr[minIndex] = temp;t
    }
  }
}