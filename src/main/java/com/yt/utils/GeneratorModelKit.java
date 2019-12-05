package com.yt.utils;

import com.jfinal.plugin.activerecord.generator.Generator;
import com.yt.plugin.TestPlugin;

import java.io.File;

public class GeneratorModelKit {

    private static String getNowPath() {

        File file = new File("");

        return file.getAbsolutePath();

    }

    public static void main(String... args) {

        // base model 所使用的包名
        String baseModelPkg = "com.yt.model.base";

        // base model 文件保存路径
        String baseModelDir = getNowPath() + "/src/main/java/com/yt/model/base";

        // model 所使用的包名
        String modelPkg = "com.yt.model";
        // model 文件保存路径
        String modelDir = baseModelDir + "/..";

        Generator generator = new Generator(new TestPlugin(true)
                .getDateSource(),
                baseModelPkg, baseModelDir, modelPkg, modelDir);
        // 在 getter、setter 方法上生成字段备注内容
        generator.setGenerateRemarks(true);
        // 生成链式结构类似builder
        generator.setGenerateChainSetter(true);
        // 在 生成字典  一个txt文件 可以查看表数据
        generator.setGenerateDataDictionary(true);
        //生成查询dao
        generator.setGenerateDaoInModel(true);
        generator.generate();


    }


}
