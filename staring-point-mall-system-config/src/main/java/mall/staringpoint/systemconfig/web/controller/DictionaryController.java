package mall.staringpoint.systemconfig.web.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 字典目录 前端控制器
 * </p>
 *
 * @author FengJie
 * @since 2020-08-13
 */
@Api("字典相关接口")
@Controller
@RequestMapping("/dictionary")
public class DictionaryController {

    @PostMapping
    @ApiOperation("新增字典")
    public void add() {
    }

    @PutMapping
    @ApiOperation("修改字典")
    public void update() {
    }

    @GetMapping
    @ApiOperation("分页查询字典列表")
    public void page() {
    }

    @PostMapping("value")
    @ApiOperation("新增字典")
    public void addValue() {
    }

    @PutMapping("value")
    @ApiOperation("修改字典")
    public void updateValue() {
    }

    @GetMapping("value")
    @ApiOperation("分页查询字典列表")
    public void pageValueValue() {
    }

}


