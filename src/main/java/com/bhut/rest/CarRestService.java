package com.bhut.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhut.interfaces.CarService;
import com.bhut.model.Car;
import com.bhut.model.CarCache;
import com.bhut.model.CarPost;

@RestController
public class CarRestService {

	private CarCache carCache = new CarCache();

	@Autowired
	private CarService carService;

	@GetMapping("api/cars")
	public ResponseEntity<List<Car>> getCars() {

		List<Car> cars =  carService.getCars();
		
		return cars != null ? ResponseEntity.ok().body(cars) : ResponseEntity.notFound().build();
	}

	@PostMapping("api/car")
	public ResponseEntity<Car> postCar(@RequestBody CarPost car) {
		Car newCar = carService.postCar(car);
		carCache.getCar().add(newCar);
		return newCar != null ? ResponseEntity.ok().body(newCar) : ResponseEntity.notFound().build();

	}


	@GetMapping("api/logs")
	public ResponseEntity<List<Car>> getLogs() {

		List<Car> cars =  carCache.getCar();

		return cars != null ? ResponseEntity.ok().body(cars) : ResponseEntity.notFound().build();
	}




}
