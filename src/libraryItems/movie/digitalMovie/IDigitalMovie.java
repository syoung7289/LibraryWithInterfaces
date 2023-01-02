package libraryItems.movie.digitalMovie;

import libraryItems.common.ILibraryItem;
import libraryItems.movie.IMovie;

public interface IDigitalMovie extends ILibraryItem, IMovie {
    double getFileSizeInMb();
}
