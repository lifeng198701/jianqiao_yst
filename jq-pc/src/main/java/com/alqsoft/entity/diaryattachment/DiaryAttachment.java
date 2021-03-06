package com.alqsoft.entity.diaryattachment;


import org.alqframework.orm.hibernate.IdEntity;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.alqsoft.entity.diary.Diary;

/**
 *
 * @author 黄鑫
 * @e-mail abc12707058@hotmail.com
 * @version v1.0
 * @copyright 2010-2015
 * @create-time 2017年3月10日 上午10:49:16
 * 
 */
public class DiaryAttachment extends IdEntity{
	
	@NotBlank(message = "附件名称不能为空")
	@Length(min = 2, max = 50, message = "附件名称必须在2到50之间，请重新输入")
	private String name;//附件名称
	@NotBlank(message = "附件地址不能为空")
	@Length(min = 2, max = 200, message = "附件地址必须在2到200之间，请重新输入")
	private String address;//附件地址
	
	private Double memory;//记录文件大小；
	
	private Integer field;//记录文件上传的唯一标识
	
	private Long diaryId;//日记id
	
	
	public Long getDiaryId() {
		return diaryId;
	}
	public void setDiaryId(Long diaryId) {
		this.diaryId = diaryId;
	}
	public Integer getField() {
		return field;
	}
	public void setField(Integer field) {
		this.field = field;
	}
	public Double getMemory() {
		return memory;
	}
	public void setMemory(Double memory) {
		this.memory = memory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
