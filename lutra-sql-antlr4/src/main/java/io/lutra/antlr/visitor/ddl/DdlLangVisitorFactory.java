package io.lutra.antlr.visitor.ddl;

import io.lutra.antlr.visitor.ddl.create.pojo.CreateLangStatementPayload;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@NoArgsConstructor(access=AccessLevel.PRIVATE)
public class DdlLangVisitorFactory {
    public static <T extends DdlLangRuleVisitor> T newVisitor(Class<T> cl, CreateLangStatementPayload payload) {
        try {
            Constructor<T> constructor = cl.getConstructor(CreateLangStatementPayload.class);
            return constructor.newInstance(payload);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
