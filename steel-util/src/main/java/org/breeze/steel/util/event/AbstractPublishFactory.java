package org.breeze.steel.util.event;

import lombok.extern.slf4j.Slf4j;
import org.breeze.steel.util.execption.OnlySingletonException;

import java.util.ServiceLoader;

/**
 * 发布者构建工厂
 *
 * @author huangyong
 */
@Slf4j
public abstract class AbstractPublishFactory {
    /**
     * 发布器
     */
    private static final AbstractPublish publish = null;

    protected static AbstractPublish getPublisher() {
        return publish;
    }

    AbstractPublishFactory() {

    }
}
