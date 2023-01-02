package libraryItems;

import libraryItems.book.IBook;
import libraryItems.common.IBorrowable;
import libraryItems.common.IBorrowableLibraryItem;
import libraryItems.movie.dvd.IDVD;
import libraryPatrons.IPatron;

import java.util.List;

public interface ILibraryItemProcessor {
    List<IBorrowableLibraryItem> getCheckedOutItems();

    void checkOut(IBorrowableLibraryItem item, IPatron patron);

    void checkOutBook(IBook book, IPatron patron);

    void checkOutDVD(IDVD dvd, IPatron patron);

    void checkIn(IBorrowable item);
}
