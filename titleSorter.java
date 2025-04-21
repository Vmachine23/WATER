public class titleSorter{
  //sorting in ascending order
  public static void selectionsorter(Book[]arr){
    for(int i=0; i < book.size() -1; i++){
      int minIndex=i;

      //Compare the current book with the rest of the books
      for(int j= i+1; j < book.size(); j++){
        if(books.get(j).getTitle.compareTo(books.get(minIndex).getTitle) <0){
          minIndex = j;
        }
      }

      //swap
      Book temp= books.get(i);
      books.set(i,books.get(minIndex));
      books.set(minIndex,temp);
    }
    System.out.println("\nSorted List in ascending order:");
        for (Book book : books) {
            System.out.println(book);
        }
  }
}

//sorting in descending order
public class titleSorter2{
  public static void selectionsorter(Book[]arr){
    for(int i = 0; i<book.size()-1; i++{
      int maxIndex= i;
      for(int j= i+1; <books.size(); j++{
        if(books.get(j)getTitle().compareTo(books.get(maxIndex).getTitle())>0){
          maxIndex=j;
        }
      }
        //swap
        Book temp= books.get(i);
        books.set(i, books.get(maxIndex));
        book.set(maxIndex,temp);
    }
      System.out.println("\nSorted List in descending order:");
      for(Book book : books){
        System.out.println(book);
      }
    }
}

