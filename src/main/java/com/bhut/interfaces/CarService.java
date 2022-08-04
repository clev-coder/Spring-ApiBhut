package com.bhut.interfaces;

import com.bhut.model.Car;
import com.bhut.model.CarPost;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(url= "http://api-test.bhut.com.br:3000/api/" , name = "bhut")
public interface CarService {
	
	@GetMapping("cars")
    List<Car> getCars();

    @PostMapping("cars")
    Car postCar(@RequestBody CarPost car);
}
