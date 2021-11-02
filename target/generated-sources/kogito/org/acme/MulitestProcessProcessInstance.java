package org.acme;

public class MulitestProcessProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<MulitestProcessModel> {

    public MulitestProcessProcessInstance(org.acme.MulitestProcessProcess process, MulitestProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public MulitestProcessProcessInstance(org.acme.MulitestProcessProcess process, MulitestProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public MulitestProcessProcessInstance(org.acme.MulitestProcessProcess process, MulitestProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public MulitestProcessProcessInstance(org.acme.MulitestProcessProcess process, MulitestProcessModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    protected java.util.Map<String, Object> bind(MulitestProcessModel variables) {
        return variables.toMap();
    }

    protected void unbind(MulitestProcessModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
