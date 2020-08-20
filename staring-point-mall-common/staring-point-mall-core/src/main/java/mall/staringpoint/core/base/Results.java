package mall.staringpoint.core.base;


import mall.staringpoint.core.enums.BaseResultCode;

/**
 * 响应工具
 *
 * @Author: FengJie
 * @Date: 2020/7/26 14:15
 */
public class Results {

    public static Result success() {
        return success(null);
    }

    public static <T> Result success(T data) {
        return Result.builder()
                .resultCode(BaseResultCode.SUCCESS)
                .data(data)
                .build();
    }

    public static Result fail(ResultCode status) {
        return Result.builder()
                .resultCode(status)
                .build();
    }

    // TODO: 2020/8/20 待完善
    
    public static Result fail(Throwable error) {
        return Result.builder()
                .resultCode(BaseResultCode.FAILED)
                .build();
    }

    public static Result fail(Integer code, String resultMsg) {
        // BaseResultCode baseResultCode = new BaseResultCode(code, resultMsg);
        return Result.builder()
                .build();
    }
}
