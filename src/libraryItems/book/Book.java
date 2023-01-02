package libraryItems.book;

import libraryPatrons.IPatron;

import java.time.LocalDate;

public class Book implements IBorrowableBook {
    private String libraryId;
    private String title;
    private String author;
    private int pages;
    private int checkoutDurationInDays;
    private IPatron borrower;
    private LocalDate borrowDate;

    public Book(String libraryId, String title) {
        this.libraryId = libraryId;
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getPages() {
        return pages;
    }

    @Override
    public int getCheckOutDurationInDays() {
        return 14;
    }

    @Override
    public IPatron getBorrower() {
        return borrower;
    }

    @Override
    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    @Override
    public void checkOut(IPatron borrower) {
        this.borrower = borrower;
        this.borrowDate = LocalDate.now();
    }

    @Override
    public void checkIn() {
        this.borrower = null;
        this.borrowDate = null;
    }

    @Override
    public LocalDate getDueDate() {
        return getBorrowDate().plusDays(getCheckOutDurationInDays());
    }

    @Override
    public String getLibraryId() {
        return libraryId;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "libraryId='" + libraryId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", checkoutDurationInDays=" + checkoutDurationInDays +
                ", borrower=" + borrower +
                ", borrowDate=" + borrowDate +
                '}';
    }
}
