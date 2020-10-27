package com.mytests.micronaut.repositories;

import com.mytests.micronaut.data.Tab1;
import com.mytests.micronaut.data.Tab1Females;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 27.10.2020.</p>
 * <p>Project: micronaut-jdbc-test1</p>
 * *
 */
@JdbcRepository(dialect = Dialect.MYSQL)
public interface Tab1FemaleRepository extends CrudRepository<Tab1Females, Integer> {
    @Query(value = "select * from tab1 t where t.name = 'masha'", nativeQuery = false) 
    List<Tab1Females> findMasha();
    @Query(value = "select * from tab1 t where t.surname like 'ivanova'", nativeQuery = true)
    List<Tab1Females> findIvanova();
    
    List<Tab1Females> findByAgeGreaterThanEquals(int age);
}
