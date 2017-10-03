/**
 * Copyright 2017 code2bytes.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.code2bytes.patterns.strategy;

/**
 * A car that can be build from different components.
 *
 * @since 2017-10-03
 * @author Dieter Scholz
 */
public class Car {

    /**
     * Model name.
     */
    private final CarModel model;

    /**
     * The motor of the car.
     */
    private Motor motor;

    /**
     * A car initialized with a model name.
     *
     * @param model
     *            model name
     * @param motor
     *            motor of the car
     */
    public Car(final CarModel model, final Motor motor) {
        this.model = model;
        this.motor = motor;
    }

    /**
     * Returns the model name.
     *
     * @return model name
     */
    public CarModel getModel() {
        return model;
    }

    /**
     * Returns the motor.
     *
     * @return motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * Sets the car's motor.
     *
     * @param motor
     *            motor of the car
     */
    public void setMotor(final Motor motor) {
        this.motor = motor;
    }

    /**
     * Drive the car.
     */
    public void drive() {
        motor.drive();
    }
}
