package dev.snowdrop.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.snowdrop.example.service.Greeting;

@Repository
public interface GreetingRepository extends CrudRepository<Greeting, String> {}

