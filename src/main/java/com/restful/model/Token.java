package com.restful.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yuanqiang on 2018/1/12.
 */
@ApiModel
public class Token {

    @ApiModelProperty(value = "刷新令牌")
    String refreshToken; // 刷新令牌
    @ApiModelProperty(value = "授权令牌")
    String accessToken; // 授权令牌
    @ApiModelProperty(value = "令牌类型")
    String tokenType; // 令牌类型
    @ApiModelProperty(value = "超时时间,单位秒")
    int expiresIn; // 超时时间,单位秒

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }
}
