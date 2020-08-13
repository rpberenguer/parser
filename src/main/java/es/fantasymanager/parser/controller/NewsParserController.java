package es.fantasymanager.parser.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fantasymanager.parser.services.interfaces.NewsParserService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class NewsParserController {

	@Autowired
	private NewsParserService service;

	@PostMapping(value = "/parser/news")
	public String parseNews() throws IOException  {

		log.info("Inicio parseo news");
		service.parseNews();

		log.info("Fin parseo news");

		return "Parseo news OK";
	}
}
