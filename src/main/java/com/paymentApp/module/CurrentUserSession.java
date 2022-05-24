package com.paymentApp.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.UniqueElements;

import lombok.Data;

@Entity
@Data
public class CurrentUserSession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(unique = true)
	private Integer customerId;
	
}
