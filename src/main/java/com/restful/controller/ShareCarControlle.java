package com.restful.controller;

import com.restful.mybatis.mapper.UserMapper;
import com.restful.mybatis.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yuanqiang on 2017/12/22.
 */
@Api(value="共享汽车API",tags={""})
@RestController
@RequestMapping(value="/shareCar")
public class ShareCarControlle {

    @Resource
    UserMapper userMapper;

//    @ApiOperation(value="国家平台，初次建立连接，并且登录一次", notes="")
//    @ApiImplicitParams({
//            @ApiImplicitParam(paramType = "query", name = "url", value = "国家平台url:0.0.0.1:8080", dataType = "String"),
//            @ApiImplicitParam(paramType = "query", name = "maxAgentNum", value = "连接池数量", dataType = "Long"),
//            @ApiImplicitParam(paramType = "query", name = "transferType", value = "国家平台类型", dataType = "String"),
//            @ApiImplicitParam(paramType = "query", name = "uniqueCode", value = "国家平台，唯一标识码", dataType = "String"),
//            @ApiImplicitParam(paramType = "query", name = "uname", value = "国家平台登录用户名", dataType = "String"),
//            @ApiImplicitParam(paramType = "query", name = "psword", value = "国家平台登录密码", dataType = "String")
//    })
//    @RequestMapping(value={"/conntion"}, method= RequestMethod.GET)
//    public String conntion(@RequestParam String url , @RequestParam Long maxAgentNum , @RequestParam String transferType , @RequestParam String uniqueCode ,
//                            @RequestParam String uname , @RequestParam String psword ){
//        return "message";
//    }

    @ApiOperation(value="查询所有用户", notes="")
    @RequestMapping(value={"/userall"}, method= RequestMethod.GET)
    public String user(){

//        List<User> list = userMapper.findUserAll();

//        User user = userMapper.login("1");

        userMapper.findUserById();

        return "true";
    }

//    @ApiOperation(value="国家平台，初次建立连接，并且登录一次", notes="")
//    @ApiImplicitParams({
//            @ApiImplicitParam(paramType = "query", name = "url", value = "国家平台url:0.0.0.1:8080", dataType = "String"),
//            @ApiImplicitParam(paramType = "query", name = "maxAgentNum", value = "连接池数量", dataType = "Long"),
//            @ApiImplicitParam(paramType = "query", name = "transferType", value = "国家平台类型", dataType = "String"),
//            @ApiImplicitParam(paramType = "query", name = "uniqueCode", value = "国家平台，唯一标识码", dataType = "String"),
//            @ApiImplicitParam(paramType = "query", name = "uname", value = "国家平台登录用户名", dataType = "String"),
//            @ApiImplicitParam(paramType = "query", name = "psword", value = "国家平台登录密码", dataType = "String")
//    })
//    @RequestMapping(value={"/conntion"}, method= RequestMethod.GET)
//    public DataObject conntion(@RequestParam String url , @RequestParam Long maxAgentNum , @RequestParam String transferType , @RequestParam String uniqueCode ,
//                            @RequestParam String uname , @RequestParam String psword ){
//
//        DataObject object = new DataObject();
//        object.offer("code" , "200");
//
//        String key = uniqueCode.concat(":").concat(uname).concat(":").concat(psword);
//
//        ChannelCache cache = SourceAgentCach.getInstance().poll(key); // 通道缓存
//
//        // 当前登录信息存在缓存，先退出。再登录！
//        if(cache != null && cache.getChannel() != null && cache.getChannel().isActive()) {
//            object.offer("msg" , key.concat(" : 已存在，不能重复登录！"));
//            return object;
//        }
//
//        new Thread(()->{
//            try {
//                TransferSourceMgr.getInstance().initCasheParameter(maxAgentNum.intValue(),url,transferType,uniqueCode,uname,psword);
//                TransferSourceAgent agent = TransferSourceMgr.getInstance().initSource();
//                TransferSourceMgr.getInstance().releaseSource(agent);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }).start();
//
//        object.offer("msg" , "登录成功！");
//
//        object.offer("系统时间" , new Date());
//
//        return object;
//
//    }

}
