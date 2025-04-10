package model.interfaces;

import model.Member;

public interface loanable {
    boolean isAvaliable();
    void checkOut(Member member);
    void returnItem();
    void loanDuration();
}
