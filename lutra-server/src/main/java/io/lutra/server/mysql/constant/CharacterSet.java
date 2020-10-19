package io.lutra.server.mysql.constant;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class  CharacterSet {
    private static final Map<Integer, String> SET = new ConcurrentHashMap<>(41);

    private static final Map<String, Integer> SET_CODE = new ConcurrentHashMap<>(41);

    static {
        SET.put(1, "big5");//big5#1
        SET.put(3, "dec8");//dec8#3
        SET.put(4, "cp850");//cp850#4
        SET.put(6,"hp8");//hp8#6
        SET.put(7,"koi8r");//koi8r#7
        SET.put(8,"latin1");//latin1#8
        SET.put(9,"latin2");//latin2#9
        SET.put(10,"swe7");//swe7#10
        SET.put(11,"ascii");//ascii#11
        SET.put(12,"ujis");//ujis#12
        SET.put(13,"sjis");//sjis#13
        SET.put(16,"hebrew");//hebrew#16
        SET.put(18,"tis620");//tis620#18
        SET.put(19,"euckr");//euckr#19
        SET.put(22,"koi8u");//koi8u#22
        SET.put(24,"gb2312");//gb2312#24
        SET.put(25,"greek");//greek#25
        SET.put(26,"cp1250");//cp1250#26
        SET.put(28,"gbk");//gbk#28
        SET.put(30,"latin5");//latin5#30
        SET.put(32,"armscii8");//armscii8#32
        SET.put(33,"utf8");//utf8#33
        SET.put(35,"ucs2");//ucs2#35
        SET.put(36,"cp866");//cp866#36
        SET.put(37,"keybcs2");//keybcs2#37
        SET.put(38,"macce");//macce#38
        SET.put(39,"macroman");//macroman#39
        SET.put(40,"cp852");//cp852#40
        SET.put(41,"latin7");//latin7#41
        SET.put(51,"cp1251");//cp1251#51
        SET.put(54,"utf16");//utf16#54
        SET.put(56,"utf16le");//utf16le#56
        SET.put(57,"cp1256");//cp1256#57
        SET.put(59,"cp1257");//cp1257#59
        SET.put(60,"utf32");//utf32#60
        SET.put(63,"binary");//binary#63
        SET.put(92,"geostd8");//geostd8#92
        SET.put(95,"cp932");//cp932#95
        SET.put(97,"eucjpms");//eucjpms#97
        SET.put(248,"gb18030");//gb18030#248
        SET.put(255,"utf8mb4");//utf8mb4#255

        SET_CODE.put("big5",1);//big5#1
        SET_CODE.put("dec8",3);//dec8#3
        SET_CODE.put("cp850",4);//cp850#4
        SET_CODE.put("hp8",6);//hp8#6
        SET_CODE.put("koi8r",7);//koi8r#7
        SET_CODE.put("latin1",8);//latin1#8
        SET_CODE.put("latin2",9);//latin2#9
        SET_CODE.put("swe7",10);//swe7#10
        SET_CODE.put("ascii",11);//ascii#11
        SET_CODE.put("ujis",12);//ujis#12
        SET_CODE.put("sjis",13);//sjis#13
        SET_CODE.put("hebrew",16);//hebrew#16
        SET_CODE.put("tis620",18);//tis620#18
        SET_CODE.put("euckr",19);//euckr#19
        SET_CODE.put("koi8u",22);//koi8u#22
        SET_CODE.put("gb2312",24);//gb2312#24
        SET_CODE.put("greek",25);//greek#25
        SET_CODE.put("cp1250",26);//cp1250#26
        SET_CODE.put("gbk",28);//gbk#28
        SET_CODE.put("latin5",30);//latin5#30
        SET_CODE.put("armscii8",32);//armscii8#32
        SET_CODE.put("utf8",33);//utf8#33
        SET_CODE.put("ucs2",35);//ucs2#35
        SET_CODE.put("cp866",36);//cp866#36
        SET_CODE.put("keybcs2",37);//keybcs2#37
        SET_CODE.put("macce",38);//macce#38
        SET_CODE.put("macroman",39);//macroman#39
        SET_CODE.put("cp852",40);//cp852#40
        SET_CODE.put("latin7",41);//latin7#41
        SET_CODE.put("cp1251",51);//cp1251#51
        SET_CODE.put("utf16",54);//utf16#54
        SET_CODE.put("utf16le",56);//utf16le#56
        SET_CODE.put("cp1256",57);//cp1256#57
        SET_CODE.put("cp1257",59);//cp1257#59
        SET_CODE.put("utf32",60);//utf32#60
        SET_CODE.put("binary",63);//binary#63
        SET_CODE.put("geostd8",92);//geostd8#92
        SET_CODE.put("cp932",95);//cp932#95
        SET_CODE.put("eucjpms",97);//eucjpms#97
        SET_CODE.put("gb18030",248);//gb18030#248
        SET_CODE.put("utf8mb4",255);//utf8mb4#255
    }
    public static String getCharacterSet(int code){
        return SET.get(code);
    }

    public static int getCharacterSetCode(String characterSet){
        return SET_CODE.get(characterSet);
    }
}