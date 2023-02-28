package com.tyut.mybatisplus.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName user
*/
@Data
@TableName("user")
public class User implements Serializable {

    /**
    * 主键ID
    */
    @NotNull(message="[主键ID]不能为空")
    @ApiModelProperty("主键ID")
    private Long id;
    /**
    * 姓名
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("姓名")
    @Length(max= 30,message="编码长度不能超过30")
    private String name;
    /**
    * 年龄
    */
    @ApiModelProperty("年龄")
    private Integer age;
    /**
    * 邮箱
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("邮箱")
    @Length(max= 50,message="编码长度不能超过50")
    private String email;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Integer isDeleted;



}
