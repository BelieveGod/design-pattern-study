package com.tj.study.prototype;

public class Citation implements Cloneable{

	protected String name;
	protected String info;
	protected String college;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Citation(String name, String info, String college) {
		super();
		this.name = name;
		this.info = info;
		this.college = college;
	}
	
	@Override
	public String toString(){
		return name+":"+info+"---------"+college;
	}
	
	@Override
	public Object clone(){
		return  new Citation(name, info, college);
		
	}
}
