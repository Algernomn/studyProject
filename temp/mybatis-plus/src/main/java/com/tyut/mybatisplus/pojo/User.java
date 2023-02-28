package com.tyut.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.ToString;

/**
 * @Description TODO
 * @Author Yangql
 * @Date 2023/2/27 10:04
 * @Version 1.0
 */
@ToString
@Data
public class User {
    @TableId
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableLogic
    private Integer isDeleted;
}
