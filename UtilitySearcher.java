public class UtilitySearcher {
public static int binarySerialNumberSearch(Books[] arr, int targetScore) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
             int mid = (low + high) / 2;
             if (arr[mid].getSerialNumber() == targetScore) {
                 System.out.println("Title: " + arr[mid].getTitle());
                 System.out.println("Author: " + arr[mid].getAuthorFirstname() + " " + arr[mid].getAuthorLastname());
                 System.out.println("Serial Number: " + arr[mid].getSerialNumber());
                 System.out.println();
                 return mid;
                }
                else if (arr[mid].getSerialNumber() < targetScore) {
                    low = mid + 1;
                    }
                    else {
                        high = mid - 1;
                        }
                        }
                        return -1;
                        }

            System.out.println("Sorry... no current book that matches your serial number...");
            return -1;
        }
        public static int SearchTitle(Books[] arr, String target){
            for (int i=0; i < arr.length; i++){
                if (arr[i].getTitle().equals(target)) {
                    System.out.println("A book was found with the matching title!");
                    System.out.println("Title: " + arr[i].getTitle());
                    System.out.println("Author: " + arr[i].getAuthorFirstname() + " " + arr[i].getAuthorLastname());
                    System.out.println("Serial Number: " + arr[i].getSerialNumber());
                    System.out.println();
                    return i;
                }
            }
            System.out.println("Sorry... no current book that matches your title...");
            return -1;
        }
         public static int SearchFirstName(Books[] arr, String target){
            for (int i=0; i < arr.length; i++){
                if (arr[i].getAuthorFirstname().equals(target)) {
                    System.out.println("A book was found with the matching first name!");   
                    System.out.println("Title: " + arr[i].getTitle());
                    System.out.println("Author: " + arr[i].getAuthorFirstname() + " " + arr[i].getAuthorLastname());
                    System.out.println("Serial Number: " + arr[i].getSerialNumber());
                    System.out.println();
                    return i;
                }
            }
            System.out.println("Sorry... no current book that matches this author's first name...");
            return -1;
        }
        public static int SearchLastName(Books[] arr, String target){
            for (int i=0; i < arr.length; i++){
                if (arr[i].getAuthorLastname().equals(target)) {
                    System.out.println("A book was found with the matching last name!");
                    System.out.println("Title: " + arr[i].getTitle());
                    System.out.println("Author: " + arr[i].getAuthorFirstname() + " " + arr[i].getAuthorLastname());
                    System.out.println("Serial Number: " + arr[i].getSerialNumber());
                    System.out.println();
                    return i;
                }
            }
            System.out.println("Sorry... no current book that matches this author's last name...");
            return -1;
        }
}
