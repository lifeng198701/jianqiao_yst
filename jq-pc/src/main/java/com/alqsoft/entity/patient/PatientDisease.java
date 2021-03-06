package com.alqsoft.entity.patient;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.alqframework.orm.hibernate.IdEntity;
/**
 * 患者求医向后台传递的实体
 * @Description: TODO
 * @author shenguang
 * @e-mail shenguang044539@163.com
 * @version v1.0
 * @copyright 2010-2015
 * @create-time 2017年3月15日 下午7:43:09
 * Copyright  2013 北京易商通公司 All rights reserved.
 *
 */
public class PatientDisease extends IdEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nickName;//求医昵称
	  
	private Integer age;//求医年纪
	 
	private Integer sex;//求医性别
	  
	private String patientAddress;//求医详细地址
	  
	private String tell;//求医电话
	  
	private String diseaseDesc;//病情描述
	  
	private Integer productTypeId;//项目类型id
	  
	private Long customerId;//求医人
	
	private String customerImage;//求医人的头像
	
	public String getCustomerImage() {
		return customerImage;
	}

	public void setCustomerImage(String customerImage) {
		this.customerImage = customerImage;
	}

	private Integer provId;//所在省id
	
	private Integer cityId;//所在市id
	
	//接口
	private String provName;//省
	private String cityName;//市
	private String[] imgAddress;//求医信息图片列表
	private String logoImg;//患者头像
	
	
	public String getProvName() {
		return provName;
	}

	public void setProvName(String provName) {
		this.provName = provName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getLogoImg() {
		return logoImg;
	}

	public void setLogoImg(String logoImg) {
		this.logoImg = logoImg;
	}

	public String[] getImgAddress() {
		return imgAddress;
	}

	public void setImgAddress(String[] imgAddress) {
		this.imgAddress = imgAddress;
	}
	
	public Integer getProvId() {
		return provId;
	}

	public void setProvId(Integer provId) {
		this.provId = provId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

	public String getDiseaseDesc() {
		return diseaseDesc;
	}

	public void setDiseaseDesc(String diseaseDesc) {
		this.diseaseDesc = diseaseDesc;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
}
