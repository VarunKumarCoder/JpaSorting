package com.cdc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.cdc.entity.Doctor;
import com.cdc.repository.IDoctorRepository;

public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepository doctorRepo;

	@Override
	public Iterable<Doctor> showDoctorsBySorting(boolean asc, String... props) {
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, props);
		Iterable<Doctor> it = doctorRepo.findAll(sort);
		return it;
	}

}
