package libraryItems;

import libraryItems.book.IBook;
import libraryItems.common.IBorrowable;
import libraryItems.common.IBorrowableLibraryItem;
import libraryItems.common.ILibraryItem;
import libraryItems.movie.dvd.IDVD;
import libraryPatrons.IPatron;
import messaging.Emailer;
import messaging.ILogger;
import messaging.IMessageSender;
import messaging.Logger;

import java.util.ArrayList;
import java.util.List;

public class LibraryItemProcessor implements ILibraryItemProcessor {
    private List<IBorrowableLibraryItem> checkedOutItems;
    private ILogger _logger;
    private IMessageSender _messageSender;

    @Override
    public List<IBorrowableLibraryItem> getCheckedOutItems() {
        if (checkedOutItems == null) {
            checkedOutItems = new ArrayList<>();
        }
        return checkedOutItems;
    }

    public LibraryItemProcessor(ILogger _logger, IMessageSender _messageSender) {
        this._logger = _logger;
        this._messageSender = _messageSender;
    }

    @Override
    public void checkOut(IBorrowableLibraryItem item, IPatron patron) {
        System.out.println(item);
        item.checkOut(patron);
        getCheckedOutItems().add(item);
        _messageSender.sendMessage(
                patron,
                String.format("\"%s\" has been checked out and is due back by %s", item.getTitle(), item.getDueDate().toString())
        );
        _logger.log(String.format("\"%s\" was successfully checked out", item.getTitle()));
        System.out.println("");
    }

    @Override
    public void checkOutBook(IBook book, IPatron patron) {
        try {
            checkOut((IBorrowableLibraryItem) book, patron);
        } catch (Exception e) {
            logUnsuccessfulCheckOut(book);
        }
    }

    @Override
    public void checkOutDVD(IDVD dvd, IPatron patron) {
        try {
            checkOut((IBorrowableLibraryItem) dvd, patron);
        } catch (Exception e) {
            logUnsuccessfulCheckOut(dvd);
        }
    }

    private void logUnsuccessfulCheckOut(ILibraryItem item) {
        _logger.log(String.format("!!WARNING!!: \"%s\" could not be checked out", item.getTitle()));
        System.out.println("");
    }

    @Override
    public void checkIn(IBorrowable item) {
        item.checkIn();
        checkedOutItems.remove(item);
    }
}
