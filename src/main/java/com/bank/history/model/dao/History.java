package com.bank.history.model.dao;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("history")
public class History {

	@Id
	private String id;
	private String type;
	private String idProduct;
	private Double amount;
	private Date date;
}
