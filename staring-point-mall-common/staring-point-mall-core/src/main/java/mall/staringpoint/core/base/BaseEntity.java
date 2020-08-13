package mall.staringpoint.core.base;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @Author: FengJie
 * @Date: 2020/7/30 17:16
 * @Description: 基础实体类
 */
@Data
@Accessors(chain = true)
public class BaseEntity {

    public static final Integer ON = 1;
    public static final Integer OFF = 2;

    private Long id;
    private Long createBy;
    private Long updateBy;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Integer enableFlag;
}
