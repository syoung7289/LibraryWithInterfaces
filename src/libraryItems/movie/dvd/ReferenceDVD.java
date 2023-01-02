package libraryItems.movie.dvd;

import libraryPatrons.IPatron;

import java.time.LocalDate;
import java.util.List;

public class ReferenceDVD implements IDVD {
    public String libraryId;
    public String title;
    public List<String> actors;
    public int runtimeInMinutes;

    public ReferenceDVD(String libraryId, String title) {
        this.libraryId = libraryId;
        this.title = title;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getActors() {
        return actors;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    @Override
    public String toString() {
        return "ReferenceDVD{" +
                "libraryId='" + libraryId + '\'' +
                ", title='" + title + '\'' +
                ", actors=" + actors +
                ", runtimeInMinutes=" + runtimeInMinutes +
                '}';
    }
}
