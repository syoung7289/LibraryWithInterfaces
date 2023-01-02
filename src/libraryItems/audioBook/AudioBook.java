package libraryItems.audioBook;

import libraryPatrons.IPatron;

import java.time.LocalDate;

public class AudioBook implements IBorrowableAudioBook {
    public String libraryId;
    public String title;
    public int checkOutDurationInDays;
    public IPatron borrower;
    public LocalDate borrowDate;
    public int runtimeInMinutes;

    public AudioBook(String libraryId, String title) {
        this.libraryId = libraryId;
        this.title = title;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public String getTitle() {
        return title;
    }

    public int getCheckOutDurationInDays() {
        return 21;
    }

    public IPatron getBorrower() {
        return borrower;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public void checkOut(IPatron borrower)
    {
        this.borrower = borrower;
        borrowDate = LocalDate.now();
    }

    public void checkIn()
    {
        borrower = null;
        borrowDate = null;
    }

    public LocalDate getDueDate()
    {
        return borrowDate.plusDays(getCheckOutDurationInDays());
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "libraryId='" + libraryId + '\'' +
                ", title='" + title + '\'' +
                ", checkOutDurationInDays=" + checkOutDurationInDays +
                ", borrower=" + borrower +
                ", borrowDate=" + borrowDate +
                ", runtimeInMinutes=" + runtimeInMinutes +
                '}';
    }
}
