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
	private String idProduct;
	private String type;
	private Double amount;
	private String idThirdPartyProduct;
	private Date date;
}
