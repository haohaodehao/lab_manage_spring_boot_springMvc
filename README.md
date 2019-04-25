# lab_manage_spring_boot_springMvc
springboot 创建实验室设备检测系统

## 开发教程
## 创建项目
### 使用的工具：
* 操作系统：windows10系统
* JDK版本：jdk8
* 编码工具：IntelliJ IDEA

### IntelliJ IDEA创建项目
* 点击Create New Project按钮
![create new project](images/1/create_new_project.png)
* 选择Spring Initializr, 选择你的JDK（点击New），然后点击Next
![spring initializr](images/1/spring_initializr.png)
* 填写Artifact选项，然后Type选项选择Maven, 点击Next
![project name](images/1/project_name.PNG)
* 选择项目依赖的库
点击Web, 然后打勾Web
![project dependencies](images/1/maven-package1.PNG)
然后点击Template Engines, 打勾Thymeleaf; 然后点击SQL, 打勾JPA和MySQL, 最后点击Next
* 选择你想放的文件夹位置，然后finish
![finish](images/1/finish.PNG)

### 添加网页模板

* 首先选择模板

网上有很多开源的网页admin（管理）模板，我选择了[startbootstrap-sb-admin-2](https://github.com/BlackrockDigital/startbootstrap-sb-admin-2)

我把项目用的sb admin 2模板的文件压缩到了admin_template.zip文件，并加入到了git版本管理中。
你可以下载该[zip文件](https://github.com/haohaodehao/lab_manage_spring_boot_springMvc/raw/add_a_admin_template/admin_template.zip)。

* 创建layout文件(布局文件)和网站首页文件

在src/resources目录下新建templates文件夹

然后在templates文件夹创建index.html文件，并写入以下代码：

```html
<!DOCTYPE html>
<html
        xmlns:th="http://www.thymeleaf.org"
        xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
        layout:decorate="~{layouts/admin_layout}">

<head>
    <title>index</title>
    <meta name="description" content="index">
</head>

<body>
<div layout:fragment="contents">
    <P>欢迎</P>
    <div id="hello-text"></div>
</div>
</body>
</html>
```

