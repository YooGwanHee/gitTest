package hello.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import hello.domain.Hello;

public interface HelloRepository extends CrudRepository<Hello, Integer> {

    List<Hello> findByName(String name);
    
    //void save(Param param);
}
