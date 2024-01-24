# Lab 07 Assignment

> 班级：212113
>
> 学号：21371220
>
> 姓名：杨硕

## Question1

```java
代码文件：template->solution->Question1->Test.java
```

## Question2

```java
代码文件：template->solution->Question2->Test.java
```

## Question3

```java
测试入口：template->solution->Question3->Q3->src->JunitTest.java->运行Test3()
```

测试计划：利用每个形状类中的`factory`的`makeShape`方法共生成五个大小不同的形状，并加入到命名为`shapes`的List中，最后顺序输出List中各形状的面积；另进行测试，输入不合法参数，测试是否抛出异常

## Question4

```java
测试入口：template->solution->Question4->Q4->src->JunitTest.java->运行Test4()
```

测试计划：创造一个`ShapeSequence`类的实例`shapeSequence`，`size`为5，生成五个形状，利用`shapeSequence`的`add`方法加入到`shapeSequence`的`shapes`中，输出这个容器的字符串表达`[Type,Type,...]`;另进行测试，继续`add`形状，输出这个容器的字符串表达，测试`shapes`填满后，`add`不再加入形状。

然后利用内部类`SequenceIterator`实现迭代器，遍历输出`shapes`中的形状名字，输出完后，输出迭代器指向位置的下标，再次进行`moveNext`操作，输出迭代器指向位置的下标，对比测试`isEnd()`为True时，`moveNext`是否继续移动迭代器位置，然后测试`equals`方法