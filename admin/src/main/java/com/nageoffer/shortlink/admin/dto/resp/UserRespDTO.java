package com.nageoffer.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * @projectName: shortlink
 * @package: com.nageoffer.shortlink.admin.dto.resp
 * @className: UserRespDTO
 * @author: Feng Jingting
 * @description: TODO
 * @date: 2024/7/19 15:10
 * @version: 1.0
 */

//用户返回参数响应
@Data
public class UserRespDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 注销时间戳
     */
    private Long deletionTime;
}
