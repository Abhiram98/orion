package com.pinterest.orion.utils;

public abstract class EC2Helper {
    public abstract int getRunningBrokerCount(String prefix);

    public abstract String getInstanceIdUsingHostName(String fullHostName, String region);
}
