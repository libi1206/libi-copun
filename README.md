## 一个SpringCloud练习项目

主要业务：一个带扣费的业务系统。主要想练习下高负载情况下可用性和一致性之间的取舍

整体框架

![](https://github.com/libi1206/libi-fee/raw/master/doc/%E6%89%A3%E8%B4%B9%E7%B3%BB%E7%BB%9F-%E6%9E%B6%E6%9E%84%E5%9B%BE.png)



### 相关技术栈

* 基础IOC框架：SpringBoot
* ORM框架：MyBatis/MyBatis Plus
* 数据库：MySQL
* 服务治理：Nacos
* 服务调用/负载均衡：OpenFeign + LoadBalancer
* 配置中心：Nacos Config
* 服务容错：Sentinel
* 消息驱动：SpringCloud Stream + RabbitMQ
* 分布式事务：Seata（待接入，等内部的逻辑完善）

