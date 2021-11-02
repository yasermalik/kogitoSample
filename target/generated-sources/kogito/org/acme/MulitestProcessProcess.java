package org.acme;

import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.drools.core.util.KieFunctions;

@org.springframework.stereotype.Component("mulitestProcess")
public class MulitestProcessProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.MulitestProcessModel> {

    @org.springframework.beans.factory.annotation.Autowired()
    public MulitestProcessProcess(org.kie.kogito.app.Application app, org.kie.kogito.process.ProcessInstancesFactory factory) {
        super(app, java.util.Arrays.asList(), factory);
        activate();
    }

    public MulitestProcessProcess() {
    }

    @Override()
    public org.acme.MulitestProcessProcessInstance createInstance(org.acme.MulitestProcessModel value) {
        return new org.acme.MulitestProcessProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.MulitestProcessProcessInstance createInstance(java.lang.String businessKey, org.acme.MulitestProcessModel value) {
        return new org.acme.MulitestProcessProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    @Override()
    public org.acme.MulitestProcessModel createModel() {
        return new org.acme.MulitestProcessModel();
    }

    public org.acme.MulitestProcessProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.MulitestProcessModel) value);
    }

    public org.acme.MulitestProcessProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.MulitestProcessModel) value);
    }

    public org.acme.MulitestProcessProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.MulitestProcessProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.MulitestProcessProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.MulitestProcessProcessInstance(this, this.createModel(), wpi);
    }

    public org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("mulitestProcess");
        factory.variable("number_of_things", new ObjectDataType("java.lang.Integer", org.acme.MulitestProcessProcess.class.getClassLoader()), "customTags", null);
        factory.variable("my_collection", new ObjectDataType("org.acme.myList", org.acme.MulitestProcessProcess.class.getClassLoader()), "customTags", "output");
        factory.name("mulitestProcess");
        factory.packageName("org.acme");
        factory.dynamic(false);
        factory.version("1.0");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode1 = factory.endNode(1);
        endNode1.name("End");
        endNode1.terminate(false);
        endNode1.metaData("UniqueId", "_63D9DF49-DCB8-450B-9DD2-784BEE4D3CCF");
        endNode1.metaData("x", 728);
        endNode1.metaData("width", 56);
        endNode1.metaData("y", 126);
        endNode1.metaData("height", 56);
        endNode1.done();
        org.jbpm.ruleflow.core.factory.ForEachNodeFactory<?> forEachNode2 = factory.forEachNode(2);
        forEachNode2.name("ForEach");
        forEachNode2.metaData("UniqueId", "_3B3A8D0A-53F1-432C-BCAC-51BBD4773835");
        forEachNode2.metaData("x", 494);
        forEachNode2.metaData("width", 154);
        forEachNode2.metaData("y", 103);
        forEachNode2.metaData("MICollectionInput", "_3B3A8D0A-53F1-432C-BCAC-51BBD4773835_IN_COLLECTIONInputX");
        forEachNode2.metaData("height", 102);
        forEachNode2.collectionExpression("my_collection");
        forEachNode2.variable("thing", new ObjectDataType("java.lang.String"));
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode2 = forEachNode2.humanTaskNode(2);
        humanTaskNode2.name("Do Thing");
        humanTaskNode2.workParameter("TaskName", "Task");
        humanTaskNode2.workParameter("Skippable", "false");
        humanTaskNode2.workParameter("NodeName", "Do Thing");
        humanTaskNode2.inMapping("IN_COLLECTION", "my_collection");
        humanTaskNode2.inMapping("thing", "thing");
        humanTaskNode2.done();
        humanTaskNode2.metaData("UniqueId", "_3B3A8D0A-53F1-432C-BCAC-51BBD4773835:1");
        humanTaskNode2.metaData("elementname", "Do Thing");
        forEachNode2.linkIncomingConnections(2);
        forEachNode2.linkOutgoingConnections(2);
        forEachNode2.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode3 = factory.actionNode(3);
        actionNode3.name("Prepare List");
        actionNode3.action(kcontext -> {
            java.lang.Integer number_of_things = (java.lang.Integer) kcontext.getVariable("number_of_things");
            org.acme.myList my_collection = (org.acme.myList) kcontext.getVariable("my_collection");
            // 
            java.util.List my_collection_tmp = new org.acme.myList();
            kcontext.setVariable("my_collection", my_collection_tmp);
            for (int i = number_of_things; i > 0; i = i - 1) {
                my_collection_tmp.add(String.valueOf(i));
            }
        });
        actionNode3.metaData("UniqueId", "_1CB69408-4A41-448A-82E4-27A02DEBF902");
        actionNode3.metaData("elementname", "Prepare List");
        actionNode3.metaData("NodeType", "ScriptTask");
        actionNode3.metaData("x", 260);
        actionNode3.metaData("width", 154);
        actionNode3.metaData("y", 103);
        actionNode3.metaData("height", 102);
        actionNode3.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode4 = factory.startNode(4);
        startNode4.name("Start");
        startNode4.interrupting(false);
        startNode4.metaData("UniqueId", "_8DD74CF0-9508-4307-B373-5A798B421205");
        startNode4.metaData("x", 124);
        startNode4.metaData("width", 56);
        startNode4.metaData("y", 126);
        startNode4.metaData("height", 56);
        startNode4.done();
        factory.connection(2, 1, "_77D4D1DA-CAE2-497A-8834-CD8B5FBE0C5B");
        factory.connection(3, 2, "_C08A761E-1FEB-49A5-AA1F-94A549A88168");
        factory.connection(4, 3, "_DDD10D6D-C1B3-40B9-994A-640337158093");
        factory.validate();
        return factory.getProcess();
    }
}
