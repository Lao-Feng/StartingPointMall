package mall.staringpoint.generate;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @date 2020年8月13日
 * Description: 代码生成器演示
 *
 * 官网: https://mybatis.plus/guide/generator.html#%E4%BD%BF%E7%94%A8%E6%95%99%E7%A8%8B
 * https://mybatis.plus/config/generator-config.html#entitylombokmodel
 */
public class MybatisGenerator {

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        // 选择 freemarker 引擎，默认 Veloctiy
        //mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        // 全局配置
        GlobalConfig gc = new GlobalConfig();

        //TODO  自定义配置一
        gc.setOutputDir("E:\\StartingPointMall\\StartingPointMall_All\\StartingPointMall\\staring-point-mall-system-config\\src\\main\\java");
        gc.setFileOverride(true);
        gc.setActiveRecord(false);
        // XML 二级缓存
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columList
        gc.setBaseColumnList(true);
        // .setKotlin(true) 是否生成 kotlin 代码
        gc.setAuthor("FengJie");
        //gc.setIdType(IdType.ID_WORKER);
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sController");
        gc.setServiceImplName("%sServiceImpl");
        gc.setServiceName("%sService");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setEntityName("%sEntity");
        mpg.setGlobalConfig(gc);
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        //dsc.setTypeConvert(new MySqlTypeConvert(){
        //    // 自定义数据库表字段类型转换【可选】
        //    @Override
        //    public DbColumnType processTypeConvert(String fieldType) {
        //        System.out.println("转换类型：" + fieldType);
        //        // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
        //        return super.processTypeConvert(fieldType);
        //    }
        //});
        dsc.setDriverName("com.mysql.jdbc.Driver");  //新的地址： com.mysql.cj.jdbc.Driver
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://localhost:3306/system-config?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        mpg.setDataSource(dsc);
        // 策略配置

        //todo 自定义配置二
        StrategyConfig strategy = new StrategyConfig();
        // 此处可以修改为您的表前缀
        // strategy.setTablePrefix("t_");
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 需要包含的表
        strategy.setInclude("dictionary","dictionary_value");
        // 排除生成的表
        //strategy.setExclude(new String[]{"test"});

        // 自定义实体父类
        strategy.setSuperEntityClass("com.framework.mysql.base.BaseEntity");
        // 自定义实体，公共字段
        strategy.setSuperEntityColumns(new String[]{"id", "create_by", "update_by", "create_time", "update_time", "version", "deleted"});

        // 自定义 mapper 父类
        strategy.setSuperMapperClass(ConstVal.SUPER_MAPPER_CLASS);
        // 自定义 service 父类
        strategy.setSuperServiceClass(ConstVal.SUPER_SERVICE_CLASS);
        // 自定义 service 实现类父类
        strategy.setSuperServiceImplClass(ConstVal.SUPER_SERVICE_IMPL_CLASS);

        // 【实体】是否为构建者模型（默认 false）
        //public User setName(String name) {this.name = name; return this;}
        //lombok模式
        strategy.setEntityLombokModel(true);
        //构建者模式
        strategy.setEntityBuilderModel(true);
        mpg.setStrategy(strategy);
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("");

        //todo 自定义配置三 这里替换成自己的项目结构
        pc.setController("mall.staringpoint.systemconfig.web.controller");
        pc.setEntity("mall.staringpoint.systemconfig.dao.entity");
        pc.setMapper("mall.staringpoint.systemconfig.dao.mapper");
        pc.setService("mall.staringpoint.systemconfig.service.api");
        pc.setServiceImpl("mall.staringpoint.systemconfig.service.impl");
        pc.setXml("resources.mapper");
        mpg.setPackageInfo(pc);
        // 执行生成
        mpg.execute();
    }
}