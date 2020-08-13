package mall.staringpoint.systemconfig.web.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: FengJie
 * @Date: 2020/8/14 0:13
 * @Description: 字典接口请求参数
 */
@Data
@ApiModel("字典接口请求参数")
public class BaseDictionaryRequest {

    @ApiModelProperty("代码")
    private String code;

    @ApiModelProperty("字典名")
    private String name;

    @ApiModelProperty("模块名")
    private String module;
}
