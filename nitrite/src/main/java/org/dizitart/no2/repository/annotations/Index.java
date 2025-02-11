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

package org.dizitart.no2.repository.annotations;

import org.dizitart.no2.index.IndexType;

import java.lang.annotation.*;

/**
 * Specifies a field to be indexed.
 *
 * @author Anindya Chatterjee.
 * @since 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Indices.class)
public @interface Index {
    /**
     * The field name to be indexed.
     *
     * @return the field name
     */
    String[] fields();

    /**
     * Type of the index.
     *
     * @return the index type
     */
    String type() default IndexType.UNIQUE;
}
