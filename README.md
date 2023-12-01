# servlet-demo

# 打包
通过执行`mvn package` 打包出target目录下的demo.war

# 部署到tomcat9下运行
1. 将demo.war拷贝到tomcat的webapps目录
2. 访问 http://localhost:8080/demo/

# 使用tomcat运行并使用idea调试
1. idea社区版本菜单File-Settings, plugins中搜索Smart Tomcat安装；
2. 菜单Run - Edit Configuration 中增加使用Smart Tomcat的的启动。
