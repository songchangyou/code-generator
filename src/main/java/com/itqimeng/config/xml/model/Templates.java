package com.itqimeng.config.xml.model;

import java.util.ArrayList;
import java.util.List;

public class Templates {

	/**
	 * 如果文件已存在是否重写
	 */
	private boolean overwrite;
	/**
	 * 如果存放目录不存在是否创建
	 */
	private boolean markDirIfNotExists;
	
	/**
	 * 模版文件
	 */
	private List<Template> templates = new ArrayList<Template>();

	/**
	 * 如果文件已存在是否重写
	 */
	public boolean isOverwrite() {
		return overwrite;
	}

	/**
	 * 如果文件已存在是否重写
	 */
	public void setOverwrite(boolean overwrite) {
		this.overwrite = overwrite;
	}
	/**
	 * 如果存放目录不存在是否创建
	 */
	public boolean isMarkDirIfNotExists() {
		return markDirIfNotExists;
	}
	/**
	 * 如果存放目录不存在是否创建
	 */
	public void setMarkDirIfNotExists(boolean markDirIfNotExists) {
		this.markDirIfNotExists = markDirIfNotExists;
	}

	/**
	 * 模版文件
	 */
	public List<Template> getTemplates() {
		return templates;
	}

	/**
	 * 模版文件
	 */
	public void setTemplates(List<Template> templates) {
		this.templates = templates;
	}
	
}
