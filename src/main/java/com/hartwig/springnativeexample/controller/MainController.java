package com.hartwig.springnativeexample.controller;

import com.hartwig.springnativeexample.client.SWApiClient;
import com.hartwig.springnativeexample.dto.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MainController {

    private final SWApiClient swApiClient;

    public MainController(SWApiClient swApiClient) {
        this.swApiClient = swApiClient;
    }

    @GetMapping("/people")
    public List<Person> getAll(@RequestParam(value = "search", required = false) String search) {
        return swApiClient.getPeople(search).results();
    }

    @GetMapping
    public String status() {
        return "Hello";
    }

}
