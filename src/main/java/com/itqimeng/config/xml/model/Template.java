package com.itqimeng.config.xml.model;

/**
 * 模版文件
 * @author songchangyou
 *
 */
public class Template {

	/**
	 * 标识
	 */
	private String id;
	/**
	 * 模版文件路径
	 */
	private String tplFile;
	/**
	 * 生成文件的存放路径
	 */
	private String targetDirectory;
	/**
	 * 生成文件的类型(后缀）
	 */
	private String fileType;
	/**
	 * 标识
	 */
	public String getId() {
		return id;
	}
	/**
	 * 标识
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 模版文件路径
	 */
	public String getTplFile() {
		return tplFile;
	}
	/**
	 * 模版文件路径
	 */
	public void setTplFile(String tplFile) {
		this.tplFile = tplFile;
	}

	/**
	 * 生成文件的存放路径
	 * @return
	 */
	public String getTargetDirectory() {
		return targetDirectory;
	}

	/**
	 * 生成文件的存放路径
	 */
	public void setTargetDirectory(String targetDirectory) {
		this.targetDirectory = targetDirectory;
	}

	/**
	 * 生成文件的类型(后缀）
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * 生成文件的类型(后缀）
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
}
