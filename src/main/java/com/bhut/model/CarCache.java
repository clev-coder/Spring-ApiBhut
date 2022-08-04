package com.bhut.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class CarCache {
    private List<Car> car = new ArrayList<Car>();
}
