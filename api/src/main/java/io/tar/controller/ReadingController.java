package io.tar.controller;

import io.tar.entity.Readings;
import io.tar.service.ReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin
public class ReadingController {
    @Autowired
    ReadingService service;

    @RequestMapping(value = "/readings",method = RequestMethod.POST, headers = "Accept=application/json",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Readings create(@RequestBody Readings R){
        return service.create(R);
    }
}
