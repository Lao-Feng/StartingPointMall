package mall.staringpoint.core.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: FengJie
 * @Date: 2020/7/26 17:03
 * @Description: 基础响应实体
 */
@Data
public class Result<T> implements Serializable {

    /**
     * 响应状态
     */
    private ResultCode resultCode;

    /**
     * 响应对象
     */
    private T data;
}
