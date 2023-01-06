package Artical.Articles;

public class Articles {
    private String title;
    private String content;
    private String author;

   public Articles (String title,String content,String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public void  changeAuthor(String newAuthor){
       this.author = newAuthor;
    }
    public void  rename(String newName){
       this.title = newName;
    }




    @Override
    public String toString(){
        return this.title + " -" + this.content + ":" + this.author ;
    }


    }
