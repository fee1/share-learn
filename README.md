# 领域模型说明
```text
Application:主要是多进程管理及调度，多线程管理及调度，多协程调度和状态机管理，等等。
    api:提供给外部调用暴露的服务
        request:入参实体 (DTO结尾表示未应用交互间传输的对象)
        response:出参实体(DTO结尾表示未应用交互间传输的对象)
    service:没有任何复杂的逻辑，用于编排协调服务(例如调用外部第三方服务不需要任何业务逻辑，可以直接到infrastructure.external找到对应的client)
domain:主要是领域模型的实现，包括领域对象的确立，这些对象的生命周期管理及关系，领域服务的定义，领域事件的发布，等等。
    service:应用复杂的业务逻辑主要在此层实现
    common:公共类
    entity:对应数据表实体类对象
infrastructure:主要是业务平台，编程框架，第三方库的封装，基础算法，等等。
    external:外部第三方服务调用在此实现
    mapper:本应用与持久层交互在此实现
```