package com.mytests.micronaut.controllers;

import com.mytests.micronaut.data.Tab1;
import com.mytests.micronaut.data.Tab1Females;
import com.mytests.micronaut.repositories.Tab1FemaleRepository;
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
@Controller("/tab1Fems")
public class Tab1FemalesController {
    @Inject
    Tab1FemaleRepository repository;
    @Get("/adults")
    public List<Tab1Females> adults() {
        
        return repository.findByAgeGreaterThanEquals(18);
    }

    @Get("/explicitQuery")
    public List<Tab1Females> explicitQuery() {
        return repository.findMasha();
    }
    @Get("/nativeQuery")
    public List<Tab1Females> nativeQuery() {
        return repository.findIvanova();
    }
}
