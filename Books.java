public class Books {
    private String title;
    private int serialNumber;
    private String authorFirstname;
    private String authorLastname;
    
    public Books(String title, String authorFirstname, String authorLastname, int serialNumber) {
        this.title = title;
        this.authorFirstname = authorFirstname;
        this.authorLastname = authorLastname;
        this.serialNumber = serialNumber;
    }
    //Methods

    //Getters and Setters
    public String getTitle(){
        return title;
    }
    
    public int getSerialNumber(){
        return serialNumber;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setSerialNumber(int serialNumber){ 
        this.serialNumber = serialNumber;
    }
    
    public String getAuthorFirstname() {
        return authorFirstname;
    }
 
    public void setAuthorFirstname(String authorFirstname) {
        this.authorFirstname = authorFirstname;
    }
 
    public String getAuthorLastname() {
        return authorLastname;
    }
    
    public void setAuthorLastname(String authorLastname) {
        this.authorLastname = authorLastname;
    }
}

