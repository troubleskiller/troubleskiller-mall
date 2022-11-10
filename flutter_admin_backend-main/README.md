# flutter_admin_backend


![GitHub](https://img.shields.io/github/license/cairuoyu/flutter_admin)
![GitHub release (latest by date)](https://img.shields.io/github/v/release/cairuoyu/flutter_admin_backend)
![GitHub repo size](https://img.shields.io/github/repo-size/cairuoyu/flutter_admin_backend?color=yellow)
![Flutter version](https://img.shields.io/badge/java-1.8-red)

>  简体中文 | [English](./README.en.md)

> 使用Java、Flutter实现的一个后台管理系统。本项目为后端，对应的前端为 https://github.com/cairuoyu/flutter_admin。

---
## 功能
* 用户注册
* 登录登出
* 功能菜单
* Dashboard
* 角色管理
* 用户管理
* 部门管理
* 菜单管理
* 文章管理
* 图片上传
* 视频上传
* 人员管理
* 数据字典管理
* 留言
* 我的信息
* 图表
* 国际化
* 语言切换
* 主题切换
* 字体切换
* 独立配置文件
* 组件封装
* 导入导出Excel

## 技术
| 名称   | 技术                |
| ------ | ------------------- |
| 语言   | Java                |
| 通用包 | Spring、Spring Boot |
| 数据   | Mybatis-plus        |
| 环境   | Maven               |
| 权限   | JWT                 |

## 代码结构
```
├─src
│  └─main
│      │  └─com
│      │      └─cry
│      │          └─flutter
│      │              └─admin
│      │                  ├─common	公共类
│      │                  ├─config	配置
│      │                  ├─constants	常量类
│      │                  ├─controller	控制类
│      │                  ├─entity	实体类
│      │                  ├─mapper	映射
│      │                  ├─service	服务
│      │                  │  └─impl
│      │                  ├─utils	工具
│      │                  ├─vo
│      │                  └─wrapper	对象封装
│      └─resources
│          └─mapper	映射配置文件
```

## 配置application.yml
```bash
server:
  port: 8081

spring:
  datasource:
    driver-class-name: com.mysql.jdbc.Driver
#    配置数据库连接
    url: jdbc:mysql://ip:3306/sid?serverTimezone=GMT%2B8&useSSL=false&allowPublicKeyRetrieval=true
    username: us
    password: ps
    hikari:
      max-lifetime: 60000
  jackson:
    date-format: yyyy-MM-dd HH:mm:ss
  servlet:
    multipart:
      max-file-size: 10000000
      max-request-size: 10000000

debug: true
mybatis-plus:
  configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
  mapper-locations: classpath:/mapper/**.xml

file:
#  文件上传地址
  upload-path: G:\apache-tomcat-9.0.34-8093\webapps\download\
#  文件下载地址
  downloadPath: http://localhost:8093/download/


```

## 打包
```bash
mvn package
```

## 运行

```bash
java -jar .\target\flutter-admin-backend.jar
```

## live demo

http://www.cairuoyu.com/flutter_admin

更多图片请访问：https://github.com/cairuoyu/flutter_admin

![image](http://cairuoyu.com/screenshots/flutter_admin1.gif)


## 加入讨论组
### 加我微信拉你入群
![image](http://cairuoyu.com/screenshots/qrcode_wechat_cry.png)

### QQ
851796663

