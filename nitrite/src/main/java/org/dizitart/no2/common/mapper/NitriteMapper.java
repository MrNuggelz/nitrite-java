/*
 * Copyright (c) 2017-2020. Nitrite author or authors.
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

package org.dizitart.no2.common.mapper;

import org.dizitart.no2.common.module.NitritePlugin;

/**
 * Represents a mapper which will convert an object of one type to an object of another type.
 *
 * @author Anindya Chatterjee.
 * @since 4.0
 */
public interface NitriteMapper extends NitritePlugin {
    /**
     * Tries to convert an object of type <code>Source</code> to an object of type <code>Target</code>.
     * If the conversion is not possible, it will return the source object.
     *
     * @param <Source> the type parameter
     * @param <Target> the type parameter
     * @param source   the source
     * @param type     the type
     * @return the target
     */
    <Source, Target> Object tryConvert(Source source, Class<Target> type);
}
