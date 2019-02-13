package com.ukefu.webim.web.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.codec.binary.Base64;
import org.hibernate.annotations.GenericGenerator;

import com.ukefu.util.UKTools;
@Entity
@Table(name = "uk_publishedcube")
@org.hibernate.annotations.Proxy(lazy = false)
public class PublishedCube implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private String id ;
	private String name ;	
	private String code ;
	//private String db = RivuDataContext.TabType.PUB.toString();			//变更用处，区分是个人模型还是公共模型， 个人文件夹 / 公共文件夹
	private String modeltype ;	//模型类型， 虚拟 立方体：立方体
	private String dstype ;	//db , r3
	private String mposleft;	//指标位置
	private String mpostop ;	//指标位置
	private String typeid ;	
	private String orgi ;
	private String createdata ;
	private String dataid ;
	private String dataflag ;			//修改字段用途，改为 数据版本
	private int startindex ;
	private Date startdate ;
	private int dataversion;
	private String creater ;
	private String userid;
	private String username;
	private String useremail ;
	private String cubecontent;
	//private String dbid;
	private String diclocation;
	private Date createtime;
	private Cube cube ;
	
	@Id
	@Column(length = 32)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getModeltype() {
		return modeltype;
	}
	public void setModeltype(String modeltype) {
		this.modeltype = modeltype;
	}
	public String getDstype() {
		return dstype;
	}
	public void setDstype(String dstype) {
		this.dstype = dstype;
	}
	public String getMposleft() {
		return mposleft;
	}
	public void setMposleft(String mposleft) {
		this.mposleft = mposleft;
	}
	public String getMpostop() {
		return mpostop;
	}
	public void setMpostop(String mpostop) {
		this.mpostop = mpostop;
	}
	public String getTypeid() {
		return typeid;
	}
	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}
	public String getOrgi() {
		return orgi;
	}
	public void setOrgi(String orgi) {
		this.orgi = orgi;
	}
	public String getCreatedata() {
		return createdata;
	}
	public void setCreatedata(String createdata) {
		this.createdata = createdata;
	}
	public String getDataid() {
		return dataid;
	}
	public void setDataid(String dataid) {
		this.dataid = dataid;
	}
	public String getDataflag() {
		return dataflag;
	}
	public void setDataflag(String dataflag) {
		this.dataflag = dataflag;
	}
	public int getStartindex() {
		return startindex;
	}
	public void setStartindex(int startindex) {
		this.startindex = startindex;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public int getDataversion() {
		return dataversion;
	}
	public void setDataversion(int dataversion) {
		this.dataversion = dataversion;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getCubecontent() {
		return cubecontent;
	}
	public void setCubecontent(String cubecontent) {
		this.cubecontent = cubecontent;
	}
	public String getDiclocation() {
		return diclocation;
	}
	public void setDiclocation(String diclocation) {
		this.diclocation = diclocation;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Transient
	public Cube getCube() {
		Base64 base64 = new Base64();
		try {
			return cube!=null ? cube : (cube = (this.cubecontent==null?null:(Cube)UKTools.toObject(base64.decode(this.cubecontent))));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cube;
	}
	
}
