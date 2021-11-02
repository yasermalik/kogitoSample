/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme;

import java.util.Map;
import org.kie.kogito.UserTask;
import org.kie.kogito.UserTaskParam.ParamType;
import org.kie.kogito.UserTaskParam;

@UserTask(taskName = "Task", processName = "mulitestProcess")
public class MulitestProcess_2_TaskInput {

    public static MulitestProcess_2_TaskInput fromMap(Map<String, Object> params) {
        MulitestProcess_2_TaskInput item = new MulitestProcess_2_TaskInput();
        item.IN_COLLECTION = (org.acme.myList) params.get("IN_COLLECTION");
        item.thing = (java.lang.String) params.get("thing");
        return item;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private org.acme.myList IN_COLLECTION;

    public org.acme.myList getIN_COLLECTION() {
        return IN_COLLECTION;
    }

    public void setIN_COLLECTION(org.acme.myList IN_COLLECTION) {
        this.IN_COLLECTION = IN_COLLECTION;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private java.lang.String thing;

    public java.lang.String getThing() {
        return thing;
    }

    public void setThing(java.lang.String thing) {
        this.thing = thing;
    }
}
// Task input for user task 'Do Thing' in process 'mulitestProcess'
