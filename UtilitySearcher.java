public class UtilitySearcher{
    public static int linearSearch(int serialnumber, int target){
        for (int i=0; i < arr.length; i++){
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
