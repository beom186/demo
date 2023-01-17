package com.eight.service;

import com.eight.domain.member.*;

import com.eight.web.dto.PhoneDTO;
import com.querydsl.jpa.impl.JPAQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberService extends AbstractService<Member, Long> {
	private final MemberRepository memberRepository;

	private final PhoneRepository phoneRepository;

	private final EntityManager entityManager;
	
	@Override
	public JpaRepository<Member, Long> getRepository() {
		return memberRepository;
	}

	@Override
	protected void onUpdateCalled(Member entity, HashMap parameter) {

		if (parameter.containsKey("no"))
			entity.setNo((long) parameter.get("no"));
		if (parameter.containsKey("name"))
			entity.setName((String) parameter.get("name"));
		if (parameter.containsKey("id"))
			entity.setId((String) parameter.get("id"));
		if (parameter.containsKey("ci"))
			entity.setCi((String) parameter.get("ci"));
	}

/*	@Transactional(rollbackFor = Exception.class)
	public String getPhoneNoByCI(String CI) {

		JPAQuery<Member> query = new JPAQuery<>(entityManager);

		QMember qMember = new QMember("m");
		QPhone qPhone = new QPhone("p");

		List<Member> phoneDTOList = query.from(qMember).fetch();
		query.from(qPhone);

*//*		List<Member> phoneDTOList = query.distinct()
				.from(qMember)
				.innerJoin(qMember.phone, qPhone).fetchJoin()
				.fetch();*//*

		phoneDTOList.forEach(member -> {
			System.out.println("Member name: " + member.getName());
			System.out.println("Order Size: " + phoneDTOList.size());
		});
		return "22";
	}*/

	public String getPhoneNoByCI(String CI) {
		System.out.println("444444");
		return CI;
	}






}
