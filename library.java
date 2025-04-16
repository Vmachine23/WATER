public class book {
    String title;
    int serialNumber;
    String author;

  public book(String title, int serialNumber , String author){
    this.title = title;
    this.serialNumber = serialNumber;
    this.author = author; 
  }
  public String getTitle(){
    return title;
  }
  public int getSerialnumber(){
    return serialNumber;
  }
  public String getAuthor(){
    return author;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public void setSerialnumber(int serialnumber){
    this.serialNumber = serialNumber;
  }
  public void setAuthor(String author){
    this.author = author;
  }
}
