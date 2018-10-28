package util;

import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class VariableUtil {
    public static boolean isEmpty(CharSequence cs){
        return StringUtils.isEmpty(cs);
    }
    public static boolean isEmpty(Collection collection){
        return collection==null||collection.isEmpty();
    }
    public static boolean isEmpty(Map map){
        return map==null||map.isEmpty();
    }
}
