# PropertyTokenizer 类代码分析  
PropertyTokenizer类处理的数据结构为
itme[0].childrenItem[0].subchildrenItem[0] 这样的数据，实现了Iterator接口，
可以进行迭代遍历操作。主要类变量有：    
* name 前面的例子中的item  
* indexedName 前面的例子中的item[0]  
* index 前面的例子中的item[0]中为0  
* children 前面的例子中的childrenItem[0].subchildrenItem[0]  
将.号分隔的表达式解析处理，可以通过next方法来返回子表达式的解析对象实例