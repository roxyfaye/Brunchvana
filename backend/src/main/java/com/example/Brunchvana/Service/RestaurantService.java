package com.example.Brunchvana.Service;

import com.example.Brunchvana.Restaurant;

import java.util.List;

/**
 * Created by phillipdelia on 10/22/17.
 */


public interface RestaurantService {


    Restaurant add(Restaurant restaurant);

    List<Restaurant> findAll();


}
