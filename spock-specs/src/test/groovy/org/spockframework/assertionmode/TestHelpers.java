package org.spockframework.assertionmode;

import groovy.lang.Closure;
import org.spockframework.lang.ConditionBlock;

public class TestHelpers {
    @ConditionBlock
    void testAndIgnore(Closure<?> conditions) {
        try {
            conditions.call();
        } catch (Throwable ignore) {
        }
    }


    @ConditionBlock
    void testAndThrow(Closure<?> conditions) {
        conditions.call();
    }
}
