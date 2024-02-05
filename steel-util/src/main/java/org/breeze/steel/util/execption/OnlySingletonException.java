package org.breeze.steel.util.execption;

/**
 * @author huangyong
 */
public class OnlySingletonException extends RuntimeException {
    public OnlySingletonException(String message) {
        super(message);
    }
}
