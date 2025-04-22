public class UtilitySearcher{
    public static int linearSearch(book arr, int target){
        for (int i=0; i < arr.length; i++){
            if (arr[i].getSerialNumber() == target) {
                return i;
            }
        }
        return -1;
    }
    public static int linearSearch(book arr, int target){
        for (int i=0; i < arr.length; i++){
            if (arr[i].getTitle() == target) {
                return i;
            }
        }
        return -1;
    }
     public static int linearSearch(book arr, int target){
        for (int i=0; i < arr.length; i++){
            if (arr[i].getAuthor() == target) {
                return i;
            }
        }
        return -1;
    }
        
}
