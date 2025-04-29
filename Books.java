public class Books {
    private String title;
    private int serialNumber;
    private String authorFirstname;
    private String authorLastname;
    private String age;
    
    public Books(String title, String authorFirstname, String authorLastname, int serialNumber, String age) {
        this.title = title;
        this.authorFirstname = authorFirstname;
        this.authorLastname = authorLastname;
        this.serialNumber = serialNumber;
        this.age = age;
    }
    //Methods
    //Getters and Setters
    public String getTitle(){
        return this.title;
    }
    
    public int getSerialNumber(){
        return this.serialNumber;
    }
    
    public void setTitle(String newtitle){
        this.title = newtitle;
    }
    
    public void setSerialNumber(int newserialNumber){ 
        this.serialNumber = newserialNumber;
    }
    
    public String getAuthorFirstname() {
        return this.authorFirstname;
    }
 
    public void setAuthorFirstname(String newauthorFirstname) {
        this.authorFirstname = newauthorFirstname;
    }
 
    public String getAuthorLastname() {
        return this.authorLastname;
    }
    
    public void setAuthorLastname(String newauthorLastname) {
        this.authorLastname = newauthorLastname;
    }
    
    public String getAge() {
        return this.age;
    }

    public void setAge(String newage){
        this.age = newage;
    }
}

