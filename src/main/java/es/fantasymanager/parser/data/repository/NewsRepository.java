package es.fantasymanager.parser.data.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.fantasymanager.parser.data.entity.News;

public interface NewsRepository extends CrudRepository<News, Integer> {

	List<News> findByDateTime(LocalDateTime dateTime);
}