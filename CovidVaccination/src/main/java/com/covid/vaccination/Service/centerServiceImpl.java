package com.covid.vaccination.Service;

import com.covid.vaccination.Entity.Center;
import com.covid.vaccination.Exception.UserException;
import com.covid.vaccination.Repository.CenterRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class centerServiceImpl implements centerService {

    @Autowired
    private CenterRepository centerRepository;

    @Override
    public Center saveCenter(Center center) {
        return centerRepository.save(center);
    }

    @Override
    public Center getCenterById(Integer id) throws UserException {
        return centerRepository.findById(id).orElseThrow(() -> new UserException("Address does not exist with this Id :" + id));
    }
}
