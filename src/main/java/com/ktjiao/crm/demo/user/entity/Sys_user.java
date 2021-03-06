package com.ktjiao.crm.demo.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author com
 * @since 2021-03-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Sys_user implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "usr_id", type = IdType.AUTO)
    private Long usr_id;

    /**
     * 姓名
     */
    private String usr_name;

    /**
     * 密码
     */
    private String usr_password;

    /**
     * 角色编号
     */
    private Long usr_role_id;

    /**
     * 状态
     */
    private Integer usr_flag;


}
