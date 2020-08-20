package mall.staringpoint.core.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: FengJie
 * @Date: 2020/7/26 17:03
 * @Description: 基础响应实体
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
