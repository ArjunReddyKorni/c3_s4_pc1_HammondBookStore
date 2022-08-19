package base;

public class Author  {

    private String authorName;
    private String penName;



    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    @Override
    public String toString(){
        return "authorName" + authorName + "penName" + penName;
    }


}
