package mall.staringpoint.systemconfig.web.req;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @Author: FengJie
 * @Date: 2020/8/14 0:16
 * @Description: 分页查询字段请求参数
 */
@Data
@ApiModel("分页查询字段请求参数")
public class PageDictionaryRequest {

    /**
     * 模块ID
     */
    private String moduleId;


}
