package com.practice;

/**
 * Converts the given speed value into throttle value required to maintain the vehicle at a certain cruise speed
 * @param <Integer>
 */
public interface Quantizer<Integer> {

    /**
     * Converts the given speed value into throttle value required to maintain the vehicle at a certain cruise speed
     *
     * @param speed The speed value that is used to calculate the throttle value
     * @return The calculated throttle value
     */
    Integer quantize(Integer speed);
}
