package org.breeze.steel.util.event;

import com.google.common.collect.Sets;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * @author huangyong
 */
public abstract class AbstractPublish implements Publish {
    /**
     * 存储的监听器集合
     */
    private final Set<Listener> listenerSet = Sets.newLinkedHashSet();

    public void addListener(Listener listener) {
        listenerSet.add(listener);
    }

    public void addAllListeners(Collection<Listener> listeners) {
        listenerSet.addAll(listeners);
    }

    public void removeListener(Listener listener) {
        listenerSet.remove(listener);
    }

    public void removeAllListeners(Collection<Listener> listeners) {
        listenerSet.removeAll(listeners);
    }

    /**
     * 获得当前时点的监听者
     *
     * @return 当前拥有的监听者的迭代器
     */
    protected Iterator<Listener> getListeners() {
        return listenerSet.iterator();
    }
}
