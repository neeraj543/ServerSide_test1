package be.thomasmore.bookserver.repositories;

import be.thomasmore.bookserver.model.Library;
import org.springframework.lang.NonNull;

import java.util.List;

public interface LibraryRepository {
        @NonNull
        List<Library> findAll();
}
