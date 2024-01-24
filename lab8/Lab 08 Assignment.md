# Lab 08 Assignment

>班级：212113
>
>学号：21371220
>
>姓名：杨硕

## Question1

1. 数据结构不同

   `ArrayList`是Array（动态数组）的数据结构，`LinkedList`是Link（链表）双向链表的数据结构

2. 空间灵活性

   `ArrayList`最好指定初始容量；`LinkedList`比`ArrayList`灵活，根本不需要指定初始容量

3. 线程安全性

   `ArrayList`是线程不安全的，而`LinkedList`是线程安全的

4. 效率不同

   当随机访问List（get和set操作）时，`ArrayList`比`LinkedList`的效率更高，因为`LinkedList`是链表的数据结构，需要移动指针从前往后依次查找；
   当对数据进行增加和删除的操作（add和remove操作）时，`LinkedList`的效率更高

5. 主要控件开销不同

   `ArrayList`主要控件开销在于需要在List列表预留一定空间；而`LinkList`主要控件开销在于需要存储节点信息以及节点指针

## Question2

程序输出为：

```java
I am a dog
I am an animal
I am type T and my type is Animal
I am type S and my type is Dog
```

## Question3

程序输出为：

```java
I am an animal
I am a dog
I am an animal
My type is Dog
My type is Animal
```

## Question4

```java
程序入口：solution->Question4->Lab8Q4->src->MyStack.java
```

## Question5

```java
程序入口：solution->Question5->Lab8Q5->src->EmailSplit.java
```

## Question6

```java
程序入口：solution->Question6->Lab8Q6->src->TwoColorBall.java
```

