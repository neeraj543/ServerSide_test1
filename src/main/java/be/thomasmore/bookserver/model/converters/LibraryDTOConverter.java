package be.thomasmore.bookserver.model.converters;

import be.thomasmore.bookserver.model.Library;
import be.thomasmore.bookserver.model.dto.LibraryDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryDTOConverter {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private LibraryDTOConverter libraryDTOConverter;

    /**
     * @param book the entity from the db
     * @return BookDTO object to send to the client.
     * The BookDTO contains an array of  BookDTO.AuthorDto
     * so that the client does not need to do a second request to display this basic info.
     */
    public LibraryDTO convertToDto(Library library) {
        return modelMapper.map(library, LibraryDTO.class);
    }
}
