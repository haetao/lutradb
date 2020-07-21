package io.lutra.visitor.dml;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access=AccessLevel.PRIVATE)
public class DmlLangVisitorFactory {
    public static <T extends DmlLangRuleVisitor> T newVisitor(Class<T> cl) {
        try {
            return cl.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
