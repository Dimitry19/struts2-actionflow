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

/**
 * Actions that want to change the flow of actions should implement this
 * interface.
 * 
 * @author Aleksandr Mashchenko
 * 
 */
public interface ActionFlowAware {
    /**
     * Which action from flow will be called after the current action. E.g. if
     * wizard consists of three actions: 'a1' > 'a2' > 'a3' and action 'a2' must
     * be skipped return 'a3' from this method when <code>actionName</code> is
     * 'a1'.
     * 
     * @param currentActionName
     *            Current action name.
     * @return Name of the action to be called on next 'next'. If
     *         <code>null</code> or not an action flow name is returned then
     *         action flow won't be changed (i.e. the configured next action
     *         from the flow will be executed).
     */
    String nextActionFlowAction(String currentActionName);
}
