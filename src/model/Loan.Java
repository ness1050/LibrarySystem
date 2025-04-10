package model;

public class loan {

    private book book;
    private Member member;
    private localDate loanDate;

    public loan(book book, Member member) {
        this.book = book;
        this.member = member;
        this.loanDate = LocalDate.now();
    }

    public String loanDetails() {
        return (member.get)
    }



}