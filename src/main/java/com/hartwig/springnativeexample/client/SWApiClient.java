package com.hartwig.springnativeexample.client;

import com.hartwig.springnativeexample.dto.Person;
import com.hartwig.springnativeexample.dto.ResponseWrapper;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface SWApiClient {

    @GetExchange("/people")
    ResponseWrapper<Person> getPeople(@RequestParam(value = "search", required = false) String search);
}
