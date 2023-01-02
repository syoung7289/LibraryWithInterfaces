package libraryItems.movie;

import libraryItems.common.IMedia;

import java.util.List;

public interface IMovie extends IMedia {
    List<String> getActors();
}
