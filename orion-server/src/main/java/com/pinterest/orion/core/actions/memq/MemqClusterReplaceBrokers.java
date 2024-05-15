package com.pinterest.orion.core.actions.memq;

import com.pinterest.orion.core.actions.Action;
import com.pinterest.orion.core.actions.generic.GenericClusterWideAction;

public class MemqClusterReplaceBrokers extends
        GenericClusterWideAction.ParallelReplaceNodeAction {

    @Override
    public Action getChildAction() {
        return new MemqTeletraanBrokerReplacementAction();
    }
}