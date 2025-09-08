package pattern.creational.prototype;

public class Document implements Cloneable{

    private String text;

    public Document(String text){
        this.text = text;
    }

    public Document clone(){
        try{
            return (Document) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }

    public String toString(){
        return text;
    }
}
