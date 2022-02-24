# 项目架构
整个项目分为单体应用模式和微服务模式，使用不同的分支区分


##单体应用模式
总共有四个模块
* coupon-template-serv： 创建、查找、克隆、删除优惠券模板；
* coupon-calculation-serv：计算优惠后的订单价格、试算每个优惠券的优惠幅度；
* coupon-customer-serv：通过调用 template 和 calculation 服务，实现用户领取优惠券、模拟计算最优惠的券、删除优惠券、下订单等操作；
* middleware：存放一些与业务无关的平台类组件。

其中，calculation模块是一个计算密集形的模块，在微服务的形势下，这个模块可以单独分出来，进行单独的资源调配

其中每个服务模块（以serv结尾）都还会进行继续拆分
* coupon-template-api：存放公共 POJO 类或者对外接口的子模块；
* coupon-template-dao：存放数据库实体类和 Dao 层的子模块；
* coupon-template-impl：核心业务逻辑的实现层，对外提供 REST API。
