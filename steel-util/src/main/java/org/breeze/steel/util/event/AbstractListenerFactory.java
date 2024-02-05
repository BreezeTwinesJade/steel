package org.breeze.steel.util.event;

/**
 * 监听者构造工厂
 *
 * @author huangyong
 */
public abstract class AbstractListenerFactory {

    public AbstractListenerFactory() {
        Publish publisher = AbstractPublishFactory.getPublisher();
    }
}
