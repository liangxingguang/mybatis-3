##xpath学习笔记  

---  

###Xpath是什么  

在XSLT的标准中,Xpath是其中一个主要部分。Xpath用于访问XML文档中的属性和元素。通过使用
“path Expression”的表达式去确定和访问xml文档中的节点。“path Expression”
是一种类似于计算机文件系统目录路径的语法表达式。  

###XPath中的术语    

####Nodes    
在Xpath中，有7种类型的的Nodes:element(元素),attribute(属性),text(文本)
,namespace(命名空间),process-instruction(操作指令),comment(注释),
document nodes(文档节点)。例如:  
```xml
<?xml version="1.0" encoding="UTF-8"?>

<class> (root element node)
  <student>
    <name xingbie="男">小明</name>   (element node)
    <age>10</age>
  </student>
</class>

xingbie="男"  (attribute node)

```

####Atomic value  
Atomic value是没有父或子的节点  

####Item  
Atomic value是基本或者Nodes组成.   

###节点关系  

####父(Parent)  
每一个元素或者属性有一个父节点  

####子(Children)  
元素可能有0个，1个或者多个子  


####同胞(sibling)  
拥有相同的父的节点  

####先辈(Ancestor)  
某个节点的父，父的父，所有上级节点。  

####后代(Descendant)  
某个节点的子，子的子，所有下级节点。  


###常用表达式描述  
nodename选取此节点的所有子节点
/从当前节点选取直接子节点  
//从当前节点选取子孙节点  
.选取当前节点  
..选取当前节点的父节点  
@选取属性 

###参考  
[XPath Tutorial](https://www.w3schools.com/xml/xpath_intro.asp)  
[学爬虫利器XPath,看这一篇就够了](https://zhuanlan.zhihu.com/p/29436838) 
