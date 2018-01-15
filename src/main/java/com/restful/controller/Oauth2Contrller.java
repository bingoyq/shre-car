package com.restful.controller;

import com.restful.model.Token;
import com.restful.model.TokenParameter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by yuanqiang on 2018/1/12.
 */
@Api(value="授权API",tags={""})
@RestController
@RequestMapping(value="/oauth2")
public class Oauth2Contrller {

    @ApiOperation(value="获取 access token 接口", notes="")
    @ApiImplicitParam(paramType = "header", name = "Authorization" , value = "应用校验请求头，值是`Basic {clientId}:{clientSecret}`的base64编码", dataType = "String")
    @RequestMapping(value={"/token"}, method= RequestMethod.POST)
    public @ResponseBody Token token(@RequestBody TokenParameter parameter , @RequestHeader String Authorization){

        Token token = new Token();
        token.setAccessToken(UUID.randomUUID().toString());
        token.setRefreshToken(UUID.randomUUID().toString());
        token.setTokenType("Bearer");
        token.setExpiresIn(3600);

        return token;
    }

}
