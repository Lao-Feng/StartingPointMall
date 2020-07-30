package mall.staringpoint.core.tool.util;

import mall.staringpoint.core.base.BaseEntity;
import mall.staringpoint.core.base.Result;
import mall.staringpoint.core.base.ResultCode;
import mall.staringpoint.core.enums.BaseResultCode;
import mall.staringpoint.core.exception.BaseException;
import org.springframework.util.ObjectUtils;

import java.util.Collection;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * 字段校验工具类
 *
 * @Author: FengJie
 * @Date: 2020/7/30 23:39
 */
public final class CheckUtils {

    private CheckUtils() {
    }

    public static <T extends Result<T>> T checkResponse(T resp) {
        return checkResponse(resp, resp.getCode(), resp.getMessage());
    }

    public static <T extends Result<T>> T checkResponse(T resp, ResultCode status) {
        return checkResponse(resp, status.code(), status.msg());
    }

    public static <T extends Result<T>> T checkResponse(T resp, Integer resultCode, String resultMsg) {
        checkExpression(isSuccess(resp), resultCode, resultMsg);
        return resp;
    }

    public static <T extends BaseEntity> T checkEntity(T entity, ResultCode status) {
        return checkEntity(entity, status.code(), status.msg());
    }

    public static <T extends BaseEntity> T checkEntity(T entity, Integer resultCode, String resultMsg) {
        checkExpression(isEnabled(entity), resultCode, resultMsg);
        return entity;
    }

    public static String checkMatches(String text, String regex, ResultCode status) {
        return checkMatches(text, regex, status.code(), status.msg());
    }

    public static String checkMatches(String text, String regex, Integer resultCode, String resultMsg) {
        checkExpression(Pattern.matches(regex, text), resultCode, resultMsg);
        return text;
    }

    public static <T> T checkValues(T param, Collection<T> values, ResultCode status) {
        return checkValues(param, values, status.code(), status.msg());
    }

    public static <T> T checkValues(T param, Collection<T> values, Integer resultCode, String resultMsg) {
        checkExpression(values.contains(param), resultCode, resultMsg);
        return param;
    }

    public static <T> T checkValue(T param, T value, ResultCode status) {
        return checkValue(param, value, status.code(), status.msg());
    }

    public static <T> T checkValue(T param, T value, Integer resultCode, String resultMsg) {
        checkExpression(Objects.equals(param, value), resultCode, resultMsg);
        return param;
    }

    public static <T> T checkNonEmpty(T param, ResultCode status) {
        return checkNonEmpty(param, status.code(), status.msg());
    }

    public static <T> T checkNonEmpty(T param, Integer resultCode, String resultMsg) {
        checkExpression(!ObjectUtils.isEmpty(param), resultCode, resultMsg);
        return param;
    }

    public static void checkExpression(boolean expression, ResultCode status) {
        checkExpression(expression, status.code(), status.msg());
    }

    public static void checkExpression(boolean expression, Integer resultCode, String resultMsg) {
        if (!expression) {
            BaseException.sneakyThrows(resultCode, resultMsg);
        }
    }

    public static <T extends Result<T>> boolean isSuccess(T resp) {
        return Objects.nonNull(resp) && Objects.equals(resp.getCode(), BaseResultCode.SUCCESS.code());
    }

    public static <T extends BaseEntity> boolean isEnabled(T entity) {
        return Objects.nonNull(entity) && Objects.equals(entity.getEnableFlag(), BaseEntity.ON);
    }
}
