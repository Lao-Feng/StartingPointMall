package mall.staringpoint.core.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import mall.staringpoint.core.base.ResultCode;

/**
 * 基础异常类
 * 所有的异常信息全部继承该类,实现异常统一管理
 *
 * @Author: FengJie
 * @Date: 2020/7/26 16:46
 */
@Getter
@NoArgsConstructor
public class ServiceException extends RuntimeException {

    private Integer errorCode;
    private String errorMsg;

    public ServiceException(String message) {
        super(message);
        errorMsg = message;
    }

    public ServiceException(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ServiceException(ResultCode error) {
        errorCode = error.code();
        errorMsg = error.msg();
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}
