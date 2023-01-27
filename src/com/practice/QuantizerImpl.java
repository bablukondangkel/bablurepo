package com.practice;

/**
 * Core Implementation of the Quantizer Interface.
 * <p>
 * Converts the given speed value into throttle value required to maintain the vehicle at a certain cruise speed
 */
public class QuantizerImpl implements Quantizer<Integer> {

    /*
    * Specifies the speed range around a given speed to account for sudden throttle change using hysteresis phenomena.
    */
    private final Integer hysteresisConstant;

    /*
    * Specifies the constant value around which there is a change in throttle value.
    * The throttle value changes around the multiples of quantizerConstant too.
    */
    private final Integer quantizerConstant;

    /*
    * Specifies the maximum throttle value that is achievable.
    */
    private final Integer maxThrottleNumber;

    /*
    * Historical speed to adjust throttle value by hysteresis phenomena.
     */
    private Integer prevSpeed;

    public QuantizerImpl() {
        hysteresisConstant = 2;
        quantizerConstant = 10;
        maxThrottleNumber = 7;
        prevSpeed = null;
    }

    @Override
    public Integer quantize(Integer speed) {
        if (speedUnderHysteresisRange(speed)) {
            Integer throttleValue = calculateThrottleValue(prevSpeed);
            prevSpeed = speed;
            return throttleValue;
        }

        prevSpeed = speed;

        return calculateThrottleValue(speed);
    }

    /**
     * Checks if the current speed and the historical speed fall under the hysteresis range.
     * <p>
     * Hysteresis range is the range that determines whether the throttle value can be changed to a
     * new value while considering the physical design of the throttle system. If the current speed and
     * previous speed input are in the hysteresis range, calculated by the hysteresis constant and the
     * quantizer constant, the throttle value will not change.
     *
     * @param speed The speed value used to calculate the throttle value
     * @return true if previous speed and current speed fall under hysteresis range, else false.
     */
    private boolean speedUnderHysteresisRange(Integer speed) {
        if (prevSpeed == null)
            return false;

        if (Math.abs(speed - prevSpeed) > 2 * hysteresisConstant)
            return false;

        for (int i = quantizerConstant; i <= quantizerConstant * maxThrottleNumber; i += 10) {
            int hysteresisRangeLowerBound = i - hysteresisConstant;
            int hysteresisRangeUpperBound = i + hysteresisConstant;
            if ((speed >= hysteresisRangeLowerBound && speed <= hysteresisRangeUpperBound) &&
                (prevSpeed >= hysteresisRangeLowerBound && prevSpeed <= hysteresisRangeUpperBound))
                return true;
        }

        return false;
    }

    /**
     * Implementation that calculates the throttle value for the given speed input.
     *
     * @param speed The speed value that is used to calculate the throttle value
     * @return The required throttle value
     */
    private Integer calculateThrottleValue(Integer speed) {
        Integer throttleValue = speed/quantizerConstant;
        if (throttleValue < 0) throttleValue = 0;
        if (throttleValue > maxThrottleNumber) throttleValue = maxThrottleNumber;
        if (speed % quantizerConstant <= 0 || throttleValue == maxThrottleNumber) return throttleValue;
        return throttleValue + 1;
    }
}
