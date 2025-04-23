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

  public static void authorSorter(Books[] array) {
        for (int i = 1; i < array.length; i++) {
            String key = array[i].getAuthor();
            int j = i - 1;

            
            while (j >= 0 && array[j].getAuthor().compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
  public static void titleSorter(Books[]array){
    for (int i= 1; i< array.length; i++){
      String key = array[i].getTitle ();
      int j = i-1;

      while(j>=0&& array [j].getTitle ().compareTo(key)>0){
        array[j +1 ] = array [j];
        j= j-1;
      }
      array[j + 1]= key;
    }
  }
}
    
