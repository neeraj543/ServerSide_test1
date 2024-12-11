package be.thomasmore.bookserver.controllers;

import be.thomasmore.bookserver.model.dto.*;
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
            description = "library with id is fetched from database  ")
    @GetMapping("{id}")
    public LibraryDetailedDTO findOne(@PathVariable int id) {
        log.info(String.format("##### findOne library %d", id));
        return libraryService.findOne(id);
    }


    @Operation(summary = "get a library member with paramters, numberOfDaysLate, numberOfBooks, payMembership.",
            description = "Libary with id is fetched from database. ")
    @GetMapping("")
    public Iterable<LibraryDTO> findAll(@PathVariable(required = false) String titleKeyWord, int id, int numberOfDaysLate, int numberOfBooks, boolean payMembership) {
        log.info(String.format("##### find number of books borrowed, number of days late and if the member payed their membership %d", id));
        return LibraryService.findAll(titleKeyWord);
    }

}