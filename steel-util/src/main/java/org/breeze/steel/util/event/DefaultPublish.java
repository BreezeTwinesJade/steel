package org.breeze.steel.util.event;

import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;

/**
 * @author huangyong
 */
@Slf4j
public class DefaultPublish extends AbstractPublish {
    /**
     * 发布事件
     *
     * @param event 发布事件
     */
    @Override
    public void publishEvent(Event event) {
        Iterator<Listener> listeners = super.getListeners();

        while (listeners.hasNext()) {
            Listener next = listeners.next();
            try {
                next.accept(event);
            } catch (Exception e) {
                log.error("事件{}，事件内容{}，通知失败:", event.getClass().getSimpleName(), event.getMsg(), e);
            }
        }
    }
}
