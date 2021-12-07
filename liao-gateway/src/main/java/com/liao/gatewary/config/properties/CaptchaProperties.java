package com.liao.gatewary.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 验证码配置
 * </p>
 *
 * @author LiAo
 * @since 2021/12/7
 */
@Data
@Configuration
@RefreshScope
@ConfigurationProperties(prefix = "security.captcha")
public class CaptchaProperties {

    // 验证码开关
    private Boolean enabled;

    // 验证码类型（math 数组计算 char 字符）
    private String type;
}