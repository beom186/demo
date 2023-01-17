package com.eight.domain.member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Phone {

	@Id
	@Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long no;
	
	@Setter
	private String phoneNo;

	@Setter
	private String ci;
	
}
