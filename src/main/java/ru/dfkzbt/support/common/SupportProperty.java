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

/**
 * Support methods for operation system properties
 *
 * @author Fedorov Konstantin (mr.fedorov.konstantin@mail.ru)
 * @version 0.1.0 [MAJOR.MINOR.PATCH]
 * Created on 19.03.2021.
 */
public class SupportProperty {
    /**
     * Gets the system property indicated by the specified key.
     *
     * @param key the name of the system property.
     * @param def a default value.
     * @return the string value of the system property,
     * or the default value if there is no property with that key or system property value is null or empty
     */
    public static String getValueProtectedProperty(String key, String def) {
        return (System.getProperty(key, def) != null
                && !System.getProperty(key, def).isEmpty())
                ? System.getProperty(key, def) : def;
    }
}
