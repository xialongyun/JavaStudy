# String,StringBuffer,StringBuilder的区别

## 概述

String是字符串常量，不可改变，对该字符串操作都会产生一个新的字符串常量。

StringBuffer和StringBuilder（JDK5.0之后）是字符串变量，每次操作是对本身的字符串操作，前者是线程安全，后者是线程不安全，由这点可以知道，前者的效率会比后者的效率低。

## String

由于每次String是不可变对象，因此每一次都会操作都会产生新的String对象，然后再将指针指向新的String。所以对于那些需要经常需要改变的字符串，不建议用String，多线程下建议StringBuffer，单线程建议使用StringBuilder。

## StringBuffer

字符串变量（Synchronized，即线程安全）。如果要频繁对字符串内容进行修改，出于效率考虑最好使用StringBuffer，如果想转成String类型，可以调用StringBuffer的toString()方法。

在任意时间点上它都包含某种特定的字符序列，但通过某些方法调用可以改变该序列的长度和内容。可将字符串缓冲区安全地用于多个线程。

StringBuffer 上的主要操作是 append 和 insert 方法，可重载这些方法，以接受任意类型的数据。每个方法都能有效地将给定的数据转换成字符串，然后将该字符串的字符追加或插入到字符串缓冲区中。append 方法始终将这些字符添加到缓冲区的末端；而 insert 方法则在指定的点添加字符。

## StringBuilder

StringBuilder和StringBuffer的主要区别就是，前者是线程不安全，效率高，其他的基本一样。