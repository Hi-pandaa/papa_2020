/**
 * 像netty当中的各个handler就是一个责任链 会按顺序执行
 * 在springmvc 当匹配url 所命中的那个adapter以后 获取到的其实是一个责任链
 * 会按顺序的执行filer messageconverter 等方法 最终执行目标controller的方法 最后返回对应的参数
 *
 * 以next指針作爲下一個要執行的處理的屬性
 *
 */
package com.zhaoqi.设计模式.行为型.责任链模式Chain;