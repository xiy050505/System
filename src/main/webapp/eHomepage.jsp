<%--
  Created by IntelliJ IDEA.
  User: 26018
  Date: 2024/2/24
  Time: 23:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>员工主页</title>
    <link href="css/ehomepage.css" rel="stylesheet">
</head>
<body>
<div id="app">
    <el-menu
            :default-active="activeIndex"
            class="el-menu-demo"
            mode="horizontal"
            @select="handleSelect">
        <el-menu-item index="1">主页</el-menu-item>
        <el-submenu index="2">
            <template slot="title">基本信息</template>
            <el-menu-item index="2-1" @click="eInformation">个人信息</el-menu-item>
            <el-menu-item index="2-2" @click="salaryInformation">工资信息</el-menu-item>
            <el-menu-item index="2-3" @click="attendanceInformation">考勤信息</el-menu-item>
        </el-submenu>
        <el-submenu index="3">
            <template slot="title">工作台</template>
            <el-menu-item index="3-1" @click="afl">请假申请</el-menu-item>
            <el-menu-item index="3-2" @click="activity">培训活动</el-menu-item>
        </el-submenu>
        <el-menu-item index="4" >公告</el-menu-item>
        <el-menu-item index="5" @click="dimission">离职申请</el-menu-item>
        <el-menu-item index="6" @click="avatar">头像设置</el-menu-item>

        <div class="demo-image">
            <div class="block" :key="fit">
                <el-image
                        class="img"
                        style="width: 50px; height: 50px"
                        :src="squareUrl"
                        :fit="fit"></el-image>
            </div>
        </div>

        <div id="username">${user.username}</div>
        <el-row>
            <el-button type="danger" class="button" @click="elogout" round>登出</el-button>
        </el-row>

    </el-menu>

</div>

</body>

<script src="js/axios-0.18.0.js"></script>
<script src="js/vue.js"></script>
<script src="element-ui/lib/index.js"></script>
<link rel="stylesheet" href="element-ui/lib/theme-chalk/index.css">

<script>
    new Vue({
        el:"#app",
        data(){
            return{
                activeIndex: '1',
                fits:'scale-down',
                squareUrl: "http://localhost:8080/System/img/a.jpg",
                username:""
            }
        },
        methods:{
            elogout(){
                location.href="index.html"
            },
            eInformation(){
                location.href="http://localhost:8080/System/eInformationSelectServlet?username=${user.username}"
            },
            salaryInformation(){
                location.href="http://localhost:8080/System/currentSalaryServlet?username=${user.username}"
            },
            attendanceInformation(){
                location.href="http://localhost:8080/System/yearServlet?username=${user.username}"
            },
            afl(){
                location.href="http://localhost:8080/System/aflLoadingServlet?username=${user.username}"
            },
            dimission(){
                location.href="http://localhost:8080/System/dimissionLoadingServlet?username=${user.username}"
            },
            activity(){
                location.href="http://localhost:8080/System/activityLoadingServlet?username=${user.username}"
            },
            avatar(){

            }
        },

    })

    document.getElementsByClassName("avatar").onclick = function () {
        location.href="updateAvatar.html"
    }
</script>
</html>

</html>
