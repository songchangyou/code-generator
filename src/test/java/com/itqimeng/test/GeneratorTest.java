package com.itqimeng.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itqimeng.config.xml.ConfigurationParser;
import com.itqimeng.config.xml.model.Configuration;
import com.itqimeng.generator.CodeGenerator;

public class GeneratorTest {

	private final Logger logger = LoggerFactory.getLogger(GeneratorTest.class);
	
	@Test
	public void CodeGeneratorTest(){
		try{
			ConfigurationParser cp = new ConfigurationParser();
			Configuration conf = cp.parseConfiguration(this.getClass().getClassLoader().getResourceAsStream("generatorConfig.xml"));
			CodeGenerator generator = new CodeGenerator(conf);
			generator.generate();
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		
	}
	
	@Test
	public void wildcardTest(){
		String reg = "*abc*";
		String pattern = "^"+reg.replace("*", ".*")+"$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher("abdcdddd");
		logger.info(m.matches()+"");
	}
	
	
}
