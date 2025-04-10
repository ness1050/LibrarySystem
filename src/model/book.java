package model;

import java.util.Date;

import model.interfaces.identifiable;
import model.interfaces.loanable;

public class book implements loanable, identifiable{

    // Adding basic requirments 
    private String id;
    private String Titel;
    private String Author;
    private boolean available = true;


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


    @Override
    public boolean isAvaliable() {
       return available;
    }


    @Override
    public void checkOut(Member member) {
       if(available) {
        available = false;
        System.out.println("Book " +  Titel + "Checked out by" + 
            member.getFirstName());
       } else {
        System.out.println("Book is not available for given Date");
       }
    }


    @Override
    public void returnItem() {
        available = true;
        System.out.println("Book " + Titel + " Returned ");
    }


    @Override
    public void loanDuration() {
       Date start = localDate();
       Date end = localDate();
       System.out.println("Loan Duration is: " + end - start + "Days");
    }
}