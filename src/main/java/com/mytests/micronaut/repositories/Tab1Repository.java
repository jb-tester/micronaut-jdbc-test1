package com.mytests.micronaut.repositories;

import com.mytests.micronaut.data.Tab1;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Where;
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
@JdbcRepository(dialect = Dialect.MYSQL)    // https://youtrack.jetbrains.com/issue/IDEA-253932
public interface Tab1Repository extends CrudRepository<Tab1, Integer> {
    @Query(value = "select * from Tab1 t where t.name = 'masha'")   // https://youtrack.jetbrains.com/issue/IDEA-253930
    List<Tab1> findMasha();
    @Query(value = "select * from Tab1 t where t.surname like 'ivanova'", nativeQuery = true)
    List<Tab1> findIvanova();
    
    List<Tab1> findByAgeGreaterThanEquals(int age);
}
