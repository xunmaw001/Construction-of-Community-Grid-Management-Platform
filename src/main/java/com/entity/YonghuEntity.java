package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 用户
 *
 * @author 
 * @email
 */
@TableName("yonghu")
public class YonghuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YonghuEntity() {

	}

	public YonghuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @ColumnInfo(comment="账户",type="varchar(200)")
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @ColumnInfo(comment="密码",type="varchar(200)")
    @TableField(value = "password")

    private String password;


    /**
     * 用户姓名
     */
    @ColumnInfo(comment="用户姓名",type="varchar(200)")
    @TableField(value = "yonghu_name")

    private String yonghuName;


    /**
     * 用户手机号
     */
    @ColumnInfo(comment="用户手机号",type="varchar(200)")
    @TableField(value = "yonghu_phone")

    private String yonghuPhone;


    /**
     * 用户身份证号
     */
    @ColumnInfo(comment="用户身份证号",type="varchar(200)")
    @TableField(value = "yonghu_id_number")

    private String yonghuIdNumber;


    /**
     * 用户头像
     */
    @ColumnInfo(comment="用户头像",type="varchar(200)")
    @TableField(value = "yonghu_photo")

    private String yonghuPhoto;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 年龄
     */
    @ColumnInfo(comment="年龄",type="int(11)")
    @TableField(value = "age")

    private Integer age;


    /**
     * 人口状态
     */
    @ColumnInfo(comment="人口状态",type="int(11)")
    @TableField(value = "renkouzhuangtai_types")

    private Integer renkouzhuangtaiTypes;


    /**
     * 小区
     */
    @ColumnInfo(comment="小区",type="int(11)")
    @TableField(value = "xiaoqu_types")

    private Integer xiaoquTypes;


    /**
     * 身体状况
     */
    @ColumnInfo(comment="身体状况",type="int(11)")
    @TableField(value = "shenti_types")

    private Integer shentiTypes;


    /**
     * 单位
     */
    @ColumnInfo(comment="单位",type="int(11)")
    @TableField(value = "danweileixing_types")

    private Integer danweileixingTypes;


    /**
     * 用户邮箱
     */
    @ColumnInfo(comment="用户邮箱",type="varchar(200)")
    @TableField(value = "yonghu_email")

    private String yonghuEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 设置：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 设置：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：用户姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }
    /**
	 * 设置：用户姓名
	 */

    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 获取：用户手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }
    /**
	 * 设置：用户手机号
	 */

    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 获取：用户身份证号
	 */
    public String getYonghuIdNumber() {
        return yonghuIdNumber;
    }
    /**
	 * 设置：用户身份证号
	 */

    public void setYonghuIdNumber(String yonghuIdNumber) {
        this.yonghuIdNumber = yonghuIdNumber;
    }
    /**
	 * 获取：用户头像
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }
    /**
	 * 设置：用户头像
	 */

    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：年龄
	 */
    public Integer getAge() {
        return age;
    }
    /**
	 * 设置：年龄
	 */

    public void setAge(Integer age) {
        this.age = age;
    }
    /**
	 * 获取：人口状态
	 */
    public Integer getRenkouzhuangtaiTypes() {
        return renkouzhuangtaiTypes;
    }
    /**
	 * 设置：人口状态
	 */

    public void setRenkouzhuangtaiTypes(Integer renkouzhuangtaiTypes) {
        this.renkouzhuangtaiTypes = renkouzhuangtaiTypes;
    }
    /**
	 * 获取：小区
	 */
    public Integer getXiaoquTypes() {
        return xiaoquTypes;
    }
    /**
	 * 设置：小区
	 */

    public void setXiaoquTypes(Integer xiaoquTypes) {
        this.xiaoquTypes = xiaoquTypes;
    }
    /**
	 * 获取：身体状况
	 */
    public Integer getShentiTypes() {
        return shentiTypes;
    }
    /**
	 * 设置：身体状况
	 */

    public void setShentiTypes(Integer shentiTypes) {
        this.shentiTypes = shentiTypes;
    }
    /**
	 * 获取：单位
	 */
    public Integer getDanweileixingTypes() {
        return danweileixingTypes;
    }
    /**
	 * 设置：单位
	 */

    public void setDanweileixingTypes(Integer danweileixingTypes) {
        this.danweileixingTypes = danweileixingTypes;
    }
    /**
	 * 获取：用户邮箱
	 */
    public String getYonghuEmail() {
        return yonghuEmail;
    }
    /**
	 * 设置：用户邮箱
	 */

    public void setYonghuEmail(String yonghuEmail) {
        this.yonghuEmail = yonghuEmail;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yonghu{" +
            ", id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", yonghuName=" + yonghuName +
            ", yonghuPhone=" + yonghuPhone +
            ", yonghuIdNumber=" + yonghuIdNumber +
            ", yonghuPhoto=" + yonghuPhoto +
            ", sexTypes=" + sexTypes +
            ", age=" + age +
            ", renkouzhuangtaiTypes=" + renkouzhuangtaiTypes +
            ", xiaoquTypes=" + xiaoquTypes +
            ", shentiTypes=" + shentiTypes +
            ", danweileixingTypes=" + danweileixingTypes +
            ", yonghuEmail=" + yonghuEmail +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
