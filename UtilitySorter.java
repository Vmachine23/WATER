public class UtilitySorter {
  public static void serialsorter(Books[] arr){
    for(int i = 0; i< arr.length-1; i++){
      int minIndex = i;
      
      for(int j=i; j<arr.length; j++){
        if(arr[j].getSerialNumber() < arr[minIndex].getSerialNumber()){
          minIndex = j;
        }
      }
    //Swap
      Books temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }

}
    
