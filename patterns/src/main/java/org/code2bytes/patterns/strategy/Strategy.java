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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Example for strategy pattern.
 *
 * @since 2017-10-03
 * @author Dieter Scholz
 */
public final class Strategy {

    /**
     * Class logger.
     */
    private static final Log LOG = LogFactory.getLog(Strategy.class);

    /**
     * Empty private constructor.
     */
    private Strategy() {
        // empty
    }

    /**
     * Main method to test the pattern.
     *
     * @param args
     *            command line arguments
     */
    public static void main(final String[] args) {
        Car car;
        car = new Car("Porsche");
        LOG.info("Car model -> " + car.getModel());
        car = new Car("BMW");
        LOG.info("Car model -> " + car.getModel());
        car = new Car("Mercedes");
        LOG.info("Car model -> " + car.getModel());
    }
}
