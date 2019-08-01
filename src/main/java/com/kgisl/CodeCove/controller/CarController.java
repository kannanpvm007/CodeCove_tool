package com.kgisl.CodeCove.controller;

import java.util.List;

import com.kgisl.CodeCove.model.Car;
import com.kgisl.CodeCove.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CarController
 */
@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    CarService carService;
    @GetMapping("/")
    public List<Car> getallcars(){
    return carService.getCars();
    
    }
    
}
