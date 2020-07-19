package io.lutra.visitor.ddl;

import io.lutra.visitor.ddl.DdlLangRuleVisitor;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access=AccessLevel.PRIVATE)
public class DdlLangVisitorFactory {
    public static <T extends DdlLangRuleVisitor> T newVisitor(Class<T> cl) {
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
