package mall.staringpoint.core.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import mall.staringpoint.core.base.ResultCode;

/**
 * @Author: FengJie
 * @Date: 2020/7/30 23:46
 * @Description: 基础异常类
 */
@Getter
@AllArgsConstructor(staticName = "of")
public class BaseException extends RuntimeException {

    private final Integer errorCode;
    private final String errorMsg;

    public static BaseException of(ResultCode error) {
        return of(error.code(), error.msg());
    }

    public static void sneakyThrows(ResultCode error) {
        throw of(error.code(), error.msg());
    }

    public static void sneakyThrows(Integer errorCode, String errorMsg) {
        throw of(errorCode, errorMsg);
    }
}
