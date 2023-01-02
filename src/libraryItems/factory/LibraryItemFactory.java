package libraryItems.factory;

import libraryItems.ILibraryItemProcessor;
import libraryItems.LibraryItemProcessor;
import libraryItems.audioBook.AudioBook;
import libraryItems.audioBook.IAudioBook;
import libraryItems.book.Book;
import libraryItems.book.IBook;
import libraryItems.book.ReferenceBook;
import libraryItems.movie.digitalMovie.DigitalMovie;
import libraryItems.movie.digitalMovie.IDigitalMovie;
import libraryItems.movie.dvd.DVD;
import libraryItems.movie.dvd.IDVD;
import libraryItems.movie.dvd.ReferenceDVD;
import messaging.ILogger;
import messaging.IMessageSender;

public final class LibraryItemFactory {
    public static IBook createBook(String title) {
        return new Book(generateLibraryId(), title);
    }

    public static IBook createReferenceBook(String title) {
        return new ReferenceBook(generateLibraryId(), title);
    }

    public static IDVD createDVD(String title) {
        return new DVD(generateLibraryId(), title);
    }

    public static IDVD createReferenceDVD(String title) {
        return new ReferenceDVD(generateLibraryId(), title);
    }

    public static IDigitalMovie createDigitalMovie(String title) {
        return new DigitalMovie(generateLibraryId(), title);
    }

    public static IAudioBook createAudioBook(String title) {
        return new AudioBook(generateLibraryId(), title);
    }

    private static String generateLibraryId() {
        String firstNode = Double.toString(Math.random());
        String secondNode = Double.toString(Math.random());
        return String.format("%s-%s", firstNode, secondNode);
    }

    public static ILibraryItemProcessor createProcessor(ILogger logger, IMessageSender messageSender) {
        return new LibraryItemProcessor(logger, messageSender);
    }
}
