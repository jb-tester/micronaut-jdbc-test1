package com.mytests.micronaut.controllers;

import com.mytests.micronaut.data.Tab1;
import com.mytests.micronaut.repositories.Tab1Repository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;
import java.util.List;

/**
 * *
 * <p>Created by irina on 27.10.2020.</p>
 * <p>Project: micronaut-jdbc-test1</p>
 * *
 */
@Controller("/tab1")
public class Tab1Controller {
    @Inject
    Tab1Repository repository;
    @Get("/adults")
    public List<Tab1> adults() {
        
        return repository.findByAgeGreaterThanEquals(18);
    }

    @Get("/explicitQuery")
    public List<Tab1> explicitQuery() {
        return repository.findMasha();
    }
    @Get("/nativeQuery")
    public List<Tab1> nativeQuery() {
        return repository.findIvanova();
    }
}
