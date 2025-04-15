public class library {
    String title;
    int serialnumber;
    String author;

  public library(String title, int serialnumber , String author){
    this.title = title;
    this.serialnumber = serialnumber;
    this.author = author; 
  }
  public String getTitle(){
    return title;
  }
  public int getSerialnumber(){
    return serialnumber;
  }
  public String getAuthor(){
    return author;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public void setSerialnumber(int serialnumber){
    this.serialnumber = serialnumber;
  }
  public void setAuthor(String author){
    this.author = author;
  }
}
