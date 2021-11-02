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

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "mulitestProcess", name = "MulitestProcess", hidden = true)
public class MulitestProcessModelOutput implements org.kie.kogito.Model, MapInput, MapInputId, MapOutput, MappableToModel<MulitestProcessModel> {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "output")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "my_collection")
    @javax.validation.Valid()
    private org.acme.myList my_collection;

    public org.acme.myList getMy_collection() {
        return my_collection;
    }

    public void setMy_collection(org.acme.myList my_collection) {
        this.my_collection = my_collection;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "number_of_things")
    @javax.validation.Valid()
    private java.lang.Integer number_of_things;

    public java.lang.Integer getNumber_of_things() {
        return number_of_things;
    }

    public void setNumber_of_things(java.lang.Integer number_of_things) {
        this.number_of_things = number_of_things;
    }

    @Override()
    public MulitestProcessModel toModel() {
        MulitestProcessModel result = new MulitestProcessModel();
        result.setId(getId());
        result.setMy_collection(getMy_collection());
        result.setNumber_of_things(getNumber_of_things());
        return result;
    }
}
