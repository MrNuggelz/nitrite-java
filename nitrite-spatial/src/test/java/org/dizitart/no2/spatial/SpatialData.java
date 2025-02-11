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

package org.dizitart.no2.spatial;

import lombok.Data;
import org.dizitart.no2.repository.annotations.Id;
import org.dizitart.no2.repository.annotations.Index;
import org.locationtech.jts.geom.Geometry;

import static org.dizitart.no2.spatial.SpatialIndexer.SPATIAL_INDEX;

/**
 * @author Anindya Chatterjee
 */
@Data
@Index(fields = "geometry", type = SPATIAL_INDEX)
public class SpatialData {
    @Id
    private Long id;
    private Geometry geometry;
}
