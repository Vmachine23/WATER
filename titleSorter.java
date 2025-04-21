public class titleSorter{
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
  }
}
