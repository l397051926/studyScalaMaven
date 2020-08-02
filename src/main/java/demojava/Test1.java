package demojava;

import java.lang.reflect.Field;

/**
 * @author: lmx
 * @create: 2020/7/30
 **/
public class Test1 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        final String a = "a";
        Field value = a.getClass().getDeclaredField("value");
        value.setAccessible(true);
        char[] cs = (char[]) value.get(a);
        cs[0] = 'b';
        System.out.println(cs);
    }

}
