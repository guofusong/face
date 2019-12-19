package fun.hijklmn.face.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * json工具类
 */
public class JSONUtil {

    public static String toJsonString(Object object) {

        return JSONObject.toJSONString(object);

    }

    public static <T> T toBean(String dest, Class<T> tClass) {

        if (dest == null || dest.trim().length()  == 0)

            return null;

        return JSONObject.toJavaObject(JSON.parseObject(dest), tClass);

    }

}
