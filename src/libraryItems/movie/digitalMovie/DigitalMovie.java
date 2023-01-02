package libraryItems.movie.digitalMovie;

import libraryPatrons.IPatron;

import java.time.LocalDate;
import java.util.List;

public class DigitalMovie implements IBorrowableDigitalMovie{
    public String libraryId;
    public String title;
    public int checkOutDurationInDays;
    public IPatron borrower;
    public LocalDate borrowDate;
    public List<String> actors;
    public int runtimeInMinutes;
    public double fileSizeInMb;

    public DigitalMovie(String libraryId, String title) {
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
        return 7;
    }

    public IPatron getBorrower() {
        return borrower;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public List<String> getActors() {
        return actors;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public double getFileSizeInMb() {
        return fileSizeInMb;
    }

    public void checkOut(IPatron borrower)
    {
        this.borrower = borrower;
        borrowDate = LocalDate.now();
    }

    public void checkIn()
    {
        borrower = null;
        this.borrowDate = null;
    }

    public LocalDate getDueDate()
    {
        return borrowDate.plusDays(getCheckOutDurationInDays());
    }

    @Override
    public String toString() {
        return "DigitalMovie{" +
                "libraryId='" + libraryId + '\'' +
                ", title='" + title + '\'' +
                ", checkOutDurationInDays=" + checkOutDurationInDays +
                ", borrower=" + borrower +
                ", borrowDate=" + borrowDate +
                ", actors=" + actors +
                ", runtimeInMinutes=" + runtimeInMinutes +
                ", fileSizeInMb=" + fileSizeInMb +
                '}';
    }
}
