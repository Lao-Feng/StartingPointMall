package mall.staringpoint.systemconfig.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import mall.staringpoint.core.base.BaseEntity;

/**
 * <p>
 * 字典值
 * </p>
 *
 * @author FengJie
 * @since 2020-08-13
 */
@Data
@Accessors(chain = true)
@TableName("dictionary_value")
@EqualsAndHashCode(callSuper = true)
public class DictionaryValueEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String dictionaryId;

    /**
     * 代码
     */
    private String code;

    /**
     * 字典值
     */
    private String value;

    private Integer sort;
}
