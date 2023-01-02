package libraryItems.common;

import libraryPatrons.IPatron;

import java.time.LocalDate;

public interface IBorrowable {
    int getCheckOutDurationInDays();
    IPatron getBorrower();
    LocalDate getBorrowDate();
    void checkOut(IPatron borrower);
    void checkIn();
    LocalDate getDueDate();
}
