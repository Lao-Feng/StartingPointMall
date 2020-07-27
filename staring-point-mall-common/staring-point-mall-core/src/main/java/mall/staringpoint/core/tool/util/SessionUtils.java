package mall.staringpoint.core.tool.util;

import lombok.experimental.UtilityClass;
import mall.staringpoint.core.base.UserSession;

/**
 * @Author: FengJie
 * @Date: 2020/7/26 17:46
 * @Description: session工具类
 */
@UtilityClass
public class SessionUtils {

    private static final ThreadLocal<UserSession> USER_SESSION_THREAD_LOCAL = new ThreadLocal<>();

    public static UserSession get() {
        return USER_SESSION_THREAD_LOCAL.get();
    }

    public static void set(UserSession session) {
        USER_SESSION_THREAD_LOCAL.set(session);
    }

    public static void remove() {
        USER_SESSION_THREAD_LOCAL.remove();
    }
}
