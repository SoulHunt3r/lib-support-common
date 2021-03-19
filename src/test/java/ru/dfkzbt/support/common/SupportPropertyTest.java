/*
 *    Copyright 2021 Konstantin Fedorov
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package ru.dfkzbt.support.common;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Generic description
 *
 * @author Fedorov Konstantin (k.fedorov@axitech.ru)
 * @version 0.1.0 [MAJOR.MINOR.PATCH]
 * Created on 19.03.2021.
 */
public class SupportPropertyTest {
    private final static Logger logger = LoggerFactory.getLogger(SupportPropertyTest.class);

    /**
     * no system property is set
     * expected default value
     */
    @Test
    public void getValueProtectedProperty_SystemPropertyIsNotSet() {
        String key = "any.key";
        String def = "default value";

        System.clearProperty(key);
        String expected = def;

        String actual = SupportProperty.getValueProtectedProperty(key, def);

        logger.debug("def: {}", def);
        logger.debug("expected: {}", expected);
        logger.debug("actual: {}", actual);

        assertEquals(expected, actual);
    }

    /**
     * system property is set with value
     * expected property value
     */
    @Test
    public void getValueProtectedProperty_SystemPropertyHasValueNotEmpty() {
        String key = "any.key";
        String def = "default value";
        String prop = "some value";

        System.setProperty(key, prop);

        String expected = prop;

        String actual = SupportProperty.getValueProtectedProperty(key, def);

        logger.debug("def: {}", def);
        logger.debug("prop: {}", prop);
        logger.debug("expected: {}", expected);
        logger.debug("actual: {}", actual);

        assertEquals(expected, actual);
    }

    /**
     * system property is set with empty value
     * expected default value
     */
    @Test
    public void getValueProtectedProperty_SystemPropertyHasValueEmpty() {
        String key = "any.key";
        String def = "default value";
        String prop = "";

        assertTrue("prop is empty", prop.isEmpty());
        System.setProperty(key, prop);

        String expected = def;

        String actual = SupportProperty.getValueProtectedProperty(key, def);

        logger.debug("def: {}", def);
        logger.debug("prop: {}", prop);
        logger.debug("expected: {}", expected);
        logger.debug("actual: {}", actual);

        assertEquals(expected, actual);
    }

}