package com.eight.web;


import com.eight.domain.member.Member;
import com.eight.exception.EightTypeException;
import com.eight.exception.NoResourceException;
import com.eight.result.Result;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import com.eight.service.MemberService;
import org.springframework.data.domain.Pageable;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class MemberApiController {

    private final MemberService service;

	@GetMapping("/api/v1.0/member/all")
	public HashMap findAll() {return Result.SUCCESS(service.findAll("no"));}

	@GetMapping("/api/v1.0/member/phone")
	public HashMap findPhone(@RequestParam @Nullable String CI) {
		return Result.SUCCESS(service.getPhoneNoByCI(CI));
	}

	@GetMapping("/api/v1.0/member/{no}")
	public HashMap findById(@PathVariable Long no) throws NoResourceException {
		return Result.SUCCESS(service.findById(no));
	}

	@PostMapping("/api/v1.0/member/create")
	public HashMap create(@RequestBody Member parameter) {
		try {
			return Result.SUCCESS(service.create(parameter));
		} catch (EightTypeException e) {
			return e.toResult();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
    
    @DeleteMapping("/api/v1.0/member/{id}")
    public HashMap delete(@PathVariable Long id) {
    	try {
    		//org.springframework.dao.EmptyResultDataAccessException ee;
    		service.delete(id);//org.springframework.dao.EmptyResultDataAccessException: No class kr.co.gocamp.domain.bank.Banks entity with id 1111 exists!
    	} catch (EightTypeException e) {
			return e.toResult();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
    	return Result.SUCCESS;
    }
}
