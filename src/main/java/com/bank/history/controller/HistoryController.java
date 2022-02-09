package com.bank.history.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.history.model.dao.History;
import com.bank.history.service.HistoryService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/history")
public class HistoryController {
	
	private final HistoryService historyService;

	@GetMapping
	public Flux<History> getHistorys() {
		return historyService.findAll();
	}
	
	@GetMapping("/{id}")
	public Mono<History> getHistory(@PathVariable("id") String id) {
		return historyService.findById(id);
	}
	
	@PostMapping
	public Mono<History> saveHistory(@RequestBody History history){
		return historyService.save(history);
	}
	
	@PutMapping
	public Mono<History> updateHistory(@RequestBody History history){
		return historyService.save(history);
	}
	
	@DeleteMapping("/{id}")
	public void deleteHistory(@PathVariable("id") String id) {
		historyService.delete(id);
	}
	
}
