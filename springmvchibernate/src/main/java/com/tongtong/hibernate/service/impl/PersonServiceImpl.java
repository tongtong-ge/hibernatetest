package com.tongtong.hibernate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tongtong.hibernate.entity.Person;
import com.tongtong.hibernate.repository.PersonRepository;
import com.tongtong.hibernate.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public Long savePerson() {
		Person person = new Person();
		person.setUsername("XRog");
        person.setPhone("18381005946");
        person.setAddress("chenDu");
        person.setRemark("this is XRog");
        return personRepository.save(person);
	}
}
