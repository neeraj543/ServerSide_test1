package be.thomasmore.bookserver.model.converters;

import be.thomasmore.bookserver.model.Author;
import be.thomasmore.bookserver.model.Library;
import be.thomasmore.bookserver.model.dto.AuthorDetailedDTO;
import be.thomasmore.bookserver.model.dto.LibraryDetailedDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryDetailedDTOConverter {

    @Autowired
    private ModelMapper modelMapper;

    /**
     * @param author the entity from the db
     * @return AuthorDetailedDTO object to send to the client.
     */
    public LibraryDetailedDTO convertToDto(Library library) {
        return modelMapper.map(library, LibraryDetailedDTO.class);
    }
}
