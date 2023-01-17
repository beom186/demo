package com.eight.domain.member;

import javax.persistence.*;

import lombok.*;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Getter
@NoArgsConstructor
@Entity
public class Member {

	@Id
	@Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long no;
	
	@Setter
	private String name;
	
	@Setter
	private String id;
	
	@Setter
	private String ci;

/*	@ManyToOne(targetEntity=Phone.class)
	@NotFound(action= NotFoundAction.IGNORE)
	@JoinColumn(name="phone_ci")
	protected Phone phone;
	public void setPhone(Phone phone) {
		this.phone = phone;
	}*/
	
}
