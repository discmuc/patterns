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
 * An underpowered motor.
 *
 * @since 2017-10-03
 * @author Dieter Scholz
 */
public class UnderpoweredMotor implements Motor {

    /**
     * Class logger.
     */
    private static final Log LOG = LogFactory.getLog(UnderpoweredMotor.class);

    /**
     * Run the motor.
     *
     * @see org.code2bytes.patterns.strategy.Motor#drive()
     */
    @Override
    public void drive() {
        LOG.info("This motor runs with the following sound: IIIIIIIIIIIIIIIIIIIIII");
    }
}
