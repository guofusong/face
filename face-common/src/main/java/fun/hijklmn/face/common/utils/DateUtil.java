package fun.hijklmn.face.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 */
public class DateUtil {

    private static final ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal(){

        protected SimpleDateFormat initialValue() {

            return new SimpleDateFormat();

        }

    };

    public static String date2String(Date date, String pattern){

        SimpleDateFormat simpleDateFormat = threadLocal.get();

        simpleDateFormat.applyPattern(pattern);

        return simpleDateFormat.format(date);

    }

    public static Date string2Date(String string, String pattern) throws Exception{

        SimpleDateFormat simpleDateFormat = threadLocal.get();

        simpleDateFormat.applyPattern(pattern);

        return simpleDateFormat.parse(string);

    }

}
