package com.cdc.service;

import com.cdc.entity.Doctor;

public interface IDoctorService {

	public Iterable<Doctor> showDoctorsBySorting(boolean asc, String... props);

}
