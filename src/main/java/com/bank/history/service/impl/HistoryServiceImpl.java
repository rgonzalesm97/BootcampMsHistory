package com.bank.history.service.impl;

import org.springframework.stereotype.Service;

import com.bank.history.model.dao.History;
import com.bank.history.repository.HistoryRepository;
import com.bank.history.service.HistoryService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class HistoryServiceImpl implements HistoryService{
	
	private final HistoryRepository historyRepo;

	@Override
	public Flux<History> findAll() {
		return historyRepo.findAll();
	}

	@Override
	public Mono<History> findById(String id) {
		return historyRepo.findById(id);
	}
	
	@Override
	public Mono<History> save(History history) {
		return historyRepo.save(history);
	}

	@Override
	public void delete(String id) {
		historyRepo.deleteById(id).subscribe();
	}

	@Override
	public Flux<History> findByIdProduct(String idProduct) {
		return historyRepo.findByIdProduct(idProduct);
	}

	@Override
	public Flux<History> findAllByIdProductAndType(String idProduct, String type) {
		return historyRepo.findAllByIdProductAndType(idProduct, type);
	}

}
