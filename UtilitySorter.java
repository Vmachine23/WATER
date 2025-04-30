public class UtilitySorter {
  public static void serialsorter(Books[] arr){ //Selection Sorter for searial number
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

  public static void firstnameSorter(Books[] array) {
        for (int i = 1; i < array.length; i++) { //Insertion sorter for author firstname
            Books key = array[i];
            int j = i - 1;

            
            while(j>=0 && array[j].getAuthorFirstname().compareTo(key.getAuthorFirstname())>0){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
  }

  public static void lastnameSorter(Books[] array) {
    for (int i = 1; i < array.length; i++) { //Insertion sorter for author lastname
        Books key = array[i];
        int j = i - 1;

        
        while(j>=0 && array[j].getAuthorLastname().compareTo(key.getAuthorLastname())>0){ 
            array[j + 1] = array[j];
            j = j - 1;
        }
        array[j + 1] = key;
    }
}

  public static void titleSorter(Books[] array){ //Insertion sorter for title of the book
    for (int i= 1; i< array.length; i++){
      Books key = array[i];
      int j = i-1;

      while(j>=0 && array[j].getTitle().compareTo(key.getTitle())>0){
        array[j +1 ] = array[j];
        j= j-1;
      }
      array[j + 1]= key;
    }
  }
}
    
