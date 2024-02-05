package org.breeze.steel.util.event;

/**
 * 发布者
 *
 * @author huangyong
 */
public interface Publish {

    /**
     * 发布事件
     *
     * @param event 发布事件
     */
    void publishEvent(Event event);
}
