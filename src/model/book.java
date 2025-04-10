package model;

public class book {

    // Adding basic requirments 
    private String id;
    private String Titel;
    private String Author;
    private boolean available = false;


    /**
     * Creating the constructor of the class.
     * @param id Id requirment
     * @param Titel Titel requirment
     * @param Author Author requirment
     */
    public book (String id, String Titel, String Author) {
        this.id = id;
        this.Titel = Titel;
        this.Author = Author;

    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitel() {
        return this.Titel;
    }

    public void setTitel(String Titel) {
        this.Titel = Titel;
    }

    public String getAuthor() {
        return this.Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


    @Override
    public String toString() {
        return ("Author :" + getAuthor() + "Title of Book: " + getTitel() + "Book SSN number: " +
            getId());
    }
}