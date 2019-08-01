package com.kgisl.CodeCove.service;

import java.util.List;

import com.kgisl.CodeCove.model.*;
import com.kgisl.CodeCove.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CarServiceImpl
 */
@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarRepository carRepository;
    public List<Car> getCars()

    {
        System.out.println(""+carRepository.findAll());
        return carRepository.findAll();
    }
    

    
}