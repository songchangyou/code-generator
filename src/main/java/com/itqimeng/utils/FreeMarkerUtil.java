package com.itqimeng.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FreeMarkerUtil {

	public static Configuration getFreeMarkerCfg(String ftlPath) {
		Configuration freemarkerCfg = new Configuration();
		freemarkerCfg.setBooleanFormat("true,false");
		freemarkerCfg.setNumberFormat("#");
		freemarkerCfg.setDefaultEncoding("UTF-8");
		try {
			freemarkerCfg.setDirectoryForTemplateLoading(new File(ftlPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return freemarkerCfg;
	}

	public static boolean generateFile(Configuration cfg, String templateFileName, Map propMap, String relPath,
			String fileName, String rootDir) {
		try {
			Template t = cfg.getTemplate(templateFileName);

			File dir = new File(rootDir + "/" + relPath);
			if (!dir.exists()) {
				dir.mkdir();
			}

			File afile = new File(rootDir + "/" + relPath + "/" + fileName);

			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(afile), "UTF-8"));

			t.process(propMap, out);
			out.close();
		} catch (TemplateException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public static void generateFile(Map<?, ?> root) {
		try {
			Configuration config = new Configuration();
			// 设置要解析的模板所在的目录，并加载模板文件
			config.setDirectoryForTemplateLoading(
					new File("D:/tmp/mybatis/code-generator/src/main/resources/com/itqimeng/generator/template"));
			// 设置包装器，并将对象包装为数据模型
			config.setObjectWrapper(new DefaultObjectWrapper());

			// 获取模板,并设置编码方式，这个编码必须要与页面中的编码格式一致
			// 否则会出现乱码
			Template template = config.getTemplate("/model.ftl", "UTF-8");
			// 合并数据模型与模板
			FileOutputStream fos = new FileOutputStream("D:/tmp/test/a.java");
			Writer out = new OutputStreamWriter(fos, "UTF-8");
			template.process(root, out);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}

}
