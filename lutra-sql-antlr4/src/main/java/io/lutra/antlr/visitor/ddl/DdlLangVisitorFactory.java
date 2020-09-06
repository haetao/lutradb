package io.lutra.antlr.visitor.ddl;

import io.lutra.sql.pojo.TableCreation;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@NoArgsConstructor(access=AccessLevel.PRIVATE)
public class DdlLangVisitorFactory {
    public static <T extends DdlLangRuleVisitor> T newVisitor(Class<T> cl, TableCreation payload) {
        try {
            Constructor<T> constructor = cl.getConstructor(TableCreation.class);
            return constructor.newInstance(payload);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
