package com.bank.history.service;

import com.bank.history.model.dao.History;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface HistoryService {
	public Flux<History> findAll();
	public Mono<History> findById(String id);
	public Mono<History> save(History history);
	public void delete(String id);
	public Flux<History> findByIdProduct(String idProduct);
	public Flux<History> findAllByIdProductAndType(String idProduct, String type);
}