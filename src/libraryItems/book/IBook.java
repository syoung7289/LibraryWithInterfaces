package libraryItems.book;

import libraryItems.common.ILibraryItem;

public interface IBook extends ILibraryItem {
    String getAuthor();
    int getPages();
}
