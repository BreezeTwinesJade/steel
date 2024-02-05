package org.breeze.steel.util.event;

/**
 * 监听者
 *
 * @author huangyong
 */
public interface Listener {
    /**
     * 消费监听事件
     * @param event 事件
     */
    void accept(Event event);
}
