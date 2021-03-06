/*
 * ================================================================================
 * Copyright (c) 2018 AT&T Intellectual Property. All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 *
 */

package org.onap.dcae.analytics.model.util.supplier;

import java.util.UUID;
import java.util.function.Supplier;

/**
 * Generates new Request id for Analytics ECOMP Components
 *
 * @author Rajiv Singla
 */
public class AnalyticsRequestIdSupplier implements Supplier<String> {

    @Override
    public String get() {
        return UUID.randomUUID().toString();
    }
}
