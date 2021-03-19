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

import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

/**
 * Generic description
 *
 * @author Fedorov Konstantin (k.fedorov@axitech.ru)
 * @version 0.1.0 [MAJOR.MINOR.PATCH]
 * Created on 19.03.2021.
 */
public class RandomStrings {
    public static String generateRandomStringUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static String generateRandomAlphanumericString() {
        return generateRandomAlphanumericString(15);
    }

    public static String generateRandomAlphanumericString(int symbols) {
        return RandomStringUtils.randomAlphanumeric(symbols);
    }

    public static String generateRandomAlphabeticString() {
        return generateRandomAlphabeticString(15);
    }

    public static String generateRandomAlphabeticString(int symbols) {
        return RandomStringUtils.randomAlphabetic(symbols);
    }

    public static String generateRandomNumericString() {
        return generateRandomNumericString(15);
    }

    public static String generateRandomNumericString(int symbols) {
        return RandomStringUtils.randomNumeric(symbols);
    }
}
