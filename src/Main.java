import libraryItems.ILibraryItemProcessor;
import libraryItems.book.IBook;
import libraryItems.common.IBorrowableLibraryItem;
import libraryItems.factory.LibraryItemFactory;
import libraryItems.factory.MessengerFactory;
import libraryItems.factory.PersonBuilder;
import libraryItems.movie.digitalMovie.IDigitalMovie;
import libraryItems.movie.dvd.IDVD;
import libraryPatrons.IPatron;
import libraryPatrons.Sex;

public class Main {
    public static void main(String[] args) {
        IDVD harryPotterDVD = LibraryItemFactory.createDVD("Harry Potter and the Sorcerer's Stone");
        IDVD matildaDVD = LibraryItemFactory.createDVD("Matilda");
        IDVD howToCheckoutBooksDVD = LibraryItemFactory.createReferenceDVD("Library works: Checking out books");
        IDVD youveGotMailDVD = LibraryItemFactory.createDVD("You've got Mail");

        IDigitalMovie theMatrixDM = LibraryItemFactory.createDigitalMovie("The Matrix");

        IBook senseAndSensibilityBook = LibraryItemFactory.createBook("Sense and Sensibility");
        IBook lonesomeDoveBook = LibraryItemFactory.createBook("Lonesome Dove");
        IBook webstersDictionary = LibraryItemFactory.createReferenceBook("Webster's Dictionary: Third Edition");

        IPatron hannah = PersonBuilder.createPatron("Hannah", "Young", Sex.FEMALE, 22, "hyoung220@gmail.com");
        IPatron scott = PersonBuilder.createPatron("Scott", "Young", Sex.MALE, 50, "syoung4735@gmail.com");
        IPatron emily = PersonBuilder.createPatron("Emily", "Young", Sex.FEMALE, 49, "youngfam94@gmail.com");
        IPatron tessa = PersonBuilder.createPatron("Tessa", "Young", Sex.FEMALE, 18, "tessa.young@gmail.com");

        ILibraryItemProcessor processor = LibraryItemFactory.createProcessor(
                MessengerFactory.createLogger(), MessengerFactory.createMessageSender()
        );

        processor.checkOutDVD(harryPotterDVD, hannah);
        processor.checkOutBook(senseAndSensibilityBook, hannah);
        processor.checkOutBook(webstersDictionary, hannah);

        processor.checkOutDVD(matildaDVD, tessa);

        processor.checkOutDVD(youveGotMailDVD, emily);

        processor.checkOutDVD(howToCheckoutBooksDVD, scott);
        processor.checkOut((IBorrowableLibraryItem) theMatrixDM, scott);
        processor.checkOutBook(lonesomeDoveBook, scott);
    }
}