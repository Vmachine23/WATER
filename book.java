public class book {
    private String title;
    private int serialNumber;
    private Author author;
    private String location;


  public book(String title, int serialNumber, String author) {
    this.title = title;
    this.serialNumber = serialNumber;
    this.author = author; 
    this.location = location;
  }

//Methods

//Getters and Setters

  public String getTitle(){
    return title;
  }

  public int getSerialNumber(){
    return serialNumber;
  }

  public String getAuthor(){
    return author;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public void setSerialNumber(int serialNumber){ this.serialNumber = serialNumber;
  }

  public String getLocation() {
    return location;
  }

  public void setAuthor(String author){
    this.author = author;
  }

}
