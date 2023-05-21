# student_management_back_end
学生综合测评系统后端

## 已完成功能（前后端已完成连接）
### 基本部分
1. 使用token实现**姓名**及**角色**（学生/老师）的基本信息传递
2. 注销token退出系统
3. 登录用户和非登录用户的**权限控制**
### 学生部分
1. GPA：学生信息显示
2. 志愿服务：学生信息显示
### 评分老师部分
1. GPA:上传EXCEL表格，汇总信息名单显示，打分
2. 志愿服务：上传EXCEL表格，汇总信息名单显示，打分
### 学工部分
1. **已测评学生**和**未测评学生**的汇总信息名单分别显示并导出EXCEL文件
2. **学生个人信息**的上传和导出

### 备注
1. 项目数据库部署在阿里云服务器上，目前（2023.5.21）前后端还未部署在云端，因此只能在本地运行
2. 项目目前只进行了规范数据测试，除登录功能和上传GPA外，对于失败情况直接在控制台打印
