/*
 * Copyright 2021-2021 Alfresco Software, Ltd.
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
package org.alfresco.sdk.sample.handler;

import org.alfresco.event.sdk.handling.filter.EventFilter;
import org.alfresco.event.sdk.handling.handler.OnNodeCreatedEventHandler;
import org.alfresco.event.sdk.handling.handler.OnNodeDeletedEventHandler;
import org.alfresco.event.sdk.handling.handler.OnNodeUpdatedEventHandler;
import org.alfresco.event.sdk.model.v1.model.*;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

@Component
public class SampleEventHandler implements OnNodeCreatedEventHandler, OnNodeUpdatedEventHandler, OnNodeDeletedEventHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleEventHandler.class);

    @Override
    public void handleEvent(RepoEvent<DataAttributes<Resource>> repoEvent) {
        NodeResource nodeResource = (NodeResource) repoEvent.getData().getResource();
        LOGGER.info(repoEvent.getType() + " >> " + nodeResource.toString());
    }

    @Override
    public Set<EventType> getHandledEventTypes() {
        Set<EventType> eventTypes = new HashSet<>();
        eventTypes.addAll(OnNodeCreatedEventHandler.super.getHandledEventTypes());
        eventTypes.addAll(OnNodeUpdatedEventHandler.super.getHandledEventTypes());
        eventTypes.addAll(OnNodeDeletedEventHandler.super.getHandledEventTypes());
        return eventTypes;
    }

    @Override
    public EventFilter getEventFilter() {
        return OnNodeCreatedEventHandler.super.getEventFilter();
    }
}
