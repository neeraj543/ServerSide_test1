package be.thomasmore.bookserver.services;

import be.thomasmore.bookserver.model.Book;
import be.thomasmore.bookserver.model.Library;
import be.thomasmore.bookserver.model.converters.*;
import be.thomasmore.bookserver.model.dto.*;
import be.thomasmore.bookserver.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepository libraryRepository;
    @Autowired
    private LibraryDTOConverter libraryDTOConverter;
    @Autowired
    private LibraryDetailedDTOConverter libraryDetailedDTOConverter;


    public static List<LibraryDTO> findAll(String titleKeyWord) {
        final List<Library> libraries = titleKeyWord == null ?
                libraryRepository.findAll() :
                libraryRepository.findByTitleContainingIgnoreCase(titleKeyWord);

        return libraries.stream()
                .map(l -> libraryDTOConverter.convertToDto(l))
                .collect(Collectors.toList());
    }

    public LibraryDetailedDTO findOne(int id) {
        final Optional<Library> library = libraryRepository.findById(id);
        if (library.isEmpty())
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
                    String.format("Library with id %d does not exist.", id));

        return libraryDetailedDTOConverter.convertToDto(library.get());
    }

}

