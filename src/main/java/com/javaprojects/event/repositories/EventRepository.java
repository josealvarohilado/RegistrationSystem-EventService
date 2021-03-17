package com.javaprojects.event.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javaprojects.event.model.Event;

@RepositoryRestResource(collectionResourceRel = "events", path = "events")
public interface EventRepository extends JpaRepository<Event, Integer>{

	@Query("from Event where eventName like %:eventName%")
	List<Event> findByEventnameWildcard(@Param("eventName") String eventName);
}
