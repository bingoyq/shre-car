package com.restful.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yuanqiang on 2018/1/12.
 */
@ApiModel
public class TokenParameter {

    @ApiModelProperty(value = "认证方式：authorization_code、client_credentials、token_client_credentials、access_token、refresh_token \n" +
            "目前只支持 access_token 认证方式，传入 username password")
    String grantType; // 认证方式：authorization_code、client_credentials、token_client_credentials、access_token、refresh_token
    @ApiModelProperty(value = "oauth2 授权码，授权码模式下")
    String code;
    @ApiModelProperty(value = "客户端ID")
    String clientId;
    @ApiModelProperty(value = "客户端授权码")
    String clientSecret;
    @ApiModelProperty(value = "登录名称")
    String username;
    @ApiModelProperty(value = "用户密码")
    String password;
    @ApiModelProperty(value = "刷新令牌")
    String refreshToken;
    @ApiModelProperty(value = "授权令牌")
    String accessToken;

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
}
