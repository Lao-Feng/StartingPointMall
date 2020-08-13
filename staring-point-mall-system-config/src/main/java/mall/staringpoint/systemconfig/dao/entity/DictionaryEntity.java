package mall.staringpoint.systemconfig.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import mall.staringpoint.core.base.BaseEntity;

/**
 * <p>
 * 字典目录
 * </p>
 *
 * @author FengJie
 * @since 2020-08-13
 */
@Data
@TableName("dictionary")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class DictionaryEntity extends BaseEntity {

    /**
     * 代码
     */
    private String code;

    /**
     * 字典名
     */
    private String name;

    private String module;
}
