package libraryItems.book;

public class ReferenceBook implements IBook {
    public String libraryId;
    public String title;
    public String author;
    public int pages;

    public ReferenceBook(String libraryId, String title) {
        this.libraryId = libraryId;
        this.title = title;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "ReferenceBook{" +
                "libraryId='" + libraryId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
