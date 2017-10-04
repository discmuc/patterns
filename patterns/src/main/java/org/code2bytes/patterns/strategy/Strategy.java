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
     * The strategy pattern allows to define different algorithms (strategies, policies) for a given
     * behavior. A class encapsulates this behavior by using an interface. The strategy is
     * changeable at runtime. The concrete strategy can optionally use context data if necessary.
     *
     * @param args
     *            command line arguments
     */
    public static void main(final String[] args) {
        final Car porsche = new Car(CarModel.PORSCHE, new StrongMotor());
        final Car vw = new Car(CarModel.VW, new AverageMotor());
        final Car fiat = new Car(CarModel.FIAT, new UnderpoweredMotor());

        porsche.drive();
        vw.drive();
        fiat.drive();

        LOG.info("Tuning the Fiat");
        fiat.setMotor(new StrongMotor());
        fiat.drive();
    }
}
