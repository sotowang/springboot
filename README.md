有时候在本地测试是使用8080端口，可是上线使用的又是80端口。 此时就可以通过多配置文件实现多配置支持与灵活切换
3个配置文件：
核心配置文件：application.properties
开发环境用的配置文件：application-dev.properties
生产环境用的配置文件：application-pro.properties
这样就可以通过application.properties里的spring.profiles.active 灵活地来切换使用哪个环境了