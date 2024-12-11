package be.thomasmore.bookserver.repositories;

import be.thomasmore.bookserver.model.Book;
import be.thomasmore.bookserver.model.Library;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.List;

public interface LibraryRepository  extends CrudRepository<Library, Integer> {
        @NonNull
        List<Library> findAll();
}
