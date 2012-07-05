package com.thoughtworks.homework.trains.strategy;

import java.util.List;

public interface IContext {
    void setCountRouteStrategy(ICountRouteStrategy strategy);
    ICountRouteStrategy getCountRouteStrategy();
    void setAttribute(String param, Object value);
    Object getAttribute(String param);
    List<String> getNodeNames();
}