package be.thomasmore.bookserver.controllers;

import be.thomasmore.bookserver.model.dto.BookDTO;
import be.thomasmore.bookserver.model.dto.BookDetailedDTO;
import be.thomasmore.bookserver.model.dto.LibraryDetailedDTO;
import be.thomasmore.bookserver.services.LibraryService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/books")
@Slf4j
public class LibraryController {
    @Autowired
    private LibraryService libraryService;

    @Operation(summary = "get 1 library from the database.",
            description = "library with id is fetched from database - returns detailed inf ")
    @GetMapping("{id}")
    public LibraryDetailedDTO findOne(@PathVariable int id) {
        log.info(String.format("##### findOne library %d", id));
        return libraryService.findOne(id);
    }


}