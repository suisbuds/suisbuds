<h3 align="center">7.13</h3>
----------------------------
----------------------------

## 进度

- 新建RichEditText类，继承自EditText,实现了MainActivity和StyleMethod文本编辑功能的分离，提高代码的复用性
- 实现了文本格式编辑的增加，保存和删除功能，并且新增Style时不会覆盖原有的Style
- 重写onAttachedToWindow和onDetachedFromWindow方法，实现工具栏始终在键盘上方的效果
- 正在实现撤销和反撤销的功能，但是菜单尚存在不显示的问题
- 正在尝试的功能
  - [ ] 美观的界面
  - [ ] 插入图片
  - [ ] 撤销和反撤销
  - [ ] 文档保存
  
## 学习

- 正在学习网络请求和oKhttp
- 学习TextWatcher接口的用法
- 学习了AndroidManifest
- 快速注释的技巧

## 收获 | 解决的问题

- 在自定义EditText中出现NoSuchMethodException的报错，参考[stackoverflow](https://stackoverflow.com/questions/18841072/error-inflating-custom-button-class-nosuchmethodexception)解决
- 使用switch时case必须是public static final int 类型
- CSDN🤬
- 合并两个不同完全不同的分支要用allow-unrelated-histories命令

