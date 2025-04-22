public class UtilitySearcher{
        public static int SearchSerialNumber(Books[] arr, int target){
            for (int i=0; i < arr.length; i++){
                if (arr[i].getSerialNumber() == target) {
                    System.out.println("A book was found with the matching serial number!");
                    System.out.println("Title: " + arr[i].getTitle());
                    System.out.println("Author: " + arr[i].getAuthorFirstname() + " " + arr[i].getAuthorLastname());
                    System.out.println("Serial Number: " + arr[i].getSerialNumber());
                    System.out.println();
                    return i;
                }
            }
            System.out.println("Sorry... no current book that matches serial number");
            return -1;
        }
        public static int SearchTitle(Books[] arr, String target){
            for (int i=0; i < arr.length; i++){
                if (arr[i].getTitle().equals(target)) {
                    System.out.println("Title: " + arr[i].getTitle());
                    System.out.println("Author: " + arr[i].getAuthorFirstname() + " " + arr[i].getAuthorLastname());
                    System.out.println("Serial Number: " + arr[i].getSerialNumber());
                    System.out.println();
                    return i;
                }
            }
            return -1;
        }
         public static int SearchFirstName(Books[] arr, String target){
            for (int i=0; i < arr.length; i++){
                if (arr[i].getAuthorFirstname().equals(target)) {
                    System.out.println("Title: " + arr[i].getTitle());
                    System.out.println("Author: " + arr[i].getAuthorFirstname() + " " + arr[i].getAuthorLastname());
                    System.out.println("Serial Number: " + arr[i].getSerialNumber());
                    System.out.println();
                    return i;
                }
            }
            return -1;
        }
        public static int SearchLastName(Books[] arr, String target){
            for (int i=0; i < arr.length; i++){
                if (arr[i].getAuthorLastname().equals(target)) {
                    System.out.println("Title: " + arr[i].getTitle());
                    System.out.println("Author: " + arr[i].getAuthorFirstname() + " " + arr[i].getAuthorLastname());
                    System.out.println("Serial Number: " + arr[i].getSerialNumber());
                    System.out.println();
                    return i;
                }
            }
            return -1;
        }
}
