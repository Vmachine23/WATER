public class book {
    private String title;
    private int serialNumber;
    private Author author;

  public book(String title, int serialNumber , String author){
    this.title = title;
    this.serialNumber = serialNumber;
    this.author = author; 
  }
  public String getTitle(){
    return title;
  }
  public int getserialNumber(){
    return serialNumber;
  }
  public String getAuthor(){
    return author;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public void setserialNumber(int serialNumber){
    this.serialNumber = serialNumber;
  }
  public void setAuthor(String author){
    this.author = author;
  }
}
