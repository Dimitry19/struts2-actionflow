/*
 * Copyright 2013-2015 Aleksandr Mashchenko.
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
package com.amashchenko.struts2.actionflow;

import com.amashchenko.struts2.actionflow.entities.ActionFlowStepsData;

/**
 * Actions that want to get hold of action flow steps data should implement this
 * interface.
 * 
 * @author Aleksandr Mashchenko
 * 
 */
public interface ActionFlowStepsAware {
    /**
     * Sets the action flow steps data in the implementing class.
     * 
     * @param stepsData
     *            action flow steps data.
     */
    void setActionFlowSteps(ActionFlowStepsData stepsData);
}
