package be.thomasmore.bookserver.controllers;

import be.thomasmore.bookserver.model.dto.AuthorDTO;
import be.thomasmore.bookserver.model.dto.BookDTO;
import be.thomasmore.bookserver.model.dto.BookDetailedDTO;
import be.thomasmore.bookserver.services.BookService;
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

    @Operation(summary = "list of books in the database.",
            description = "If Request Parameter <b>titleKeyWord</b> is given: " +
                    "only books where the title contains this titleKeyWord (ignore-case). </br>" +
                    "Otherwise all books are returned. </br>" +
                    "</br>" +
                    "The authors Collection contains only id and name. </br>" +
                    "Use GET api/authors/{id}/authors  to fetch more info about the authors. ")
    @GetMapping("")
    public Iterable<BookDTO> findAll(@RequestParam(required = false) String titleKeyWord) {
        log.info("##### findAll books - titleKeyWord=" + titleKeyWord);
        return bookService.findAll(titleKeyWord);
    }