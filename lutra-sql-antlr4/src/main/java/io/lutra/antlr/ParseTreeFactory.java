package io.lutra.antlr;

import io.lutra.antlr.common.CaseSensitiveCharStream;
import io.lutra.antlr.parser.ddl.DdlLangRuleLexer;
import io.lutra.antlr.parser.ddl.DdlLangRuleParser;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ParseTreeFactory {

    public static ParseTree genParseTree(String sql){
        CharStream stream = CharStreams.fromString(sql);
        DdlLangRuleLexer lexer  = new DdlLangRuleLexer(new CaseSensitiveCharStream(stream,true));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        DdlLangRuleParser parser = new DdlLangRuleParser(tokenStream);
        return parser.root();
    }
}
