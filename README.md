# 读源码学设计模式

## 软件模式六大原则
1. 单一职责原则(Single Responsibility Principle)
> 一个类应该有且仅有一个引起它的变化。这里的类不光指类，还适用于接口和方法。
2. 里氏代换原则(Liskov Substitution Principle)
> 继承必须确保超类所拥有的性质在子类中仍然成立。
3. 依赖倒置原则(Dependence Inversion Principle)
> 高层模块不应该依赖底层模块，两者都应该依赖其抽象；抽象不应该依赖细节，细节应该依赖抽象。即：要面向接口编程，不要面向实现编程。
4. 接口隔离原则(Interface Segregation Principle)
> 客户端不应该被迫依赖于它不使用的方法；或一个类对另一个类的依赖应该建立在最小接口上。
5. 迪米特法则(Law of Demeter, 又称最小知道原则)
> 如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，可以通过第三方转发该调用。
6. 开闭原则(Open Close Principle)
> 软件实体应当对外扩展开放，对修改关闭。

## 创建型模式
* [工厂方法模式(Factory Method)](doc/01-create/01-FactoryMethod.md)
* 抽象工厂模式(Abstract Factory)
* 单例模式(Singleton)
* 建造者模式(Builder)
* 原型模式(Prototype)
----------------------

## 结构型模式
* 适配器模式(Adaptor)
* 桥接模式(Bridge)
* 组合模式(Composite)
* 装饰器模式(Decorator)
* 外观模式(Facade)
* 享元模式(Flyweight)
* 代理模式(Proxy)
----------------------

## 行为型模式
* 职责链模式(Chain of Responsibility)
* 命令模式(Command)
* 解释器模式(Interpreter)
* 迭代器模式(Iterator)
* 中介者模式(Mediator)
* 备忘录模式(Memento)
* 观察者模式(Observer)
* 状态模式(State)
* 策略模式(Strategy)
* 模板方法模式(Template Method)
* 访问者模式(Visitor)
----------------------