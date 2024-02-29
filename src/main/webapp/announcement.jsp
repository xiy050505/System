<%--
  Created by IntelliJ IDEA.
  User: 26018
  Date: 2024/2/27
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>公告</title>
</head>
<body>
<div id="app">
    <template>
        <el-table
                :data="tableData"
                style="width: 100%"
                :row-class-name="tableRowClassName"
                @selection-change="handleSelectionChange"
                highlight-current-row
                @current-change="handleCurrentChange">

            <el-table-column
                    type="index"
                    width="50">
            </el-table-column>

            <el-table-column
                    prop="name"
                    label="发布者"
                    align="name">
            </el-table-column>
            <el-table-column
                    prop="date"
                    label="发布时间"
                    align="center"
            >
            </el-table-column>
            <el-table-column
                    prop="content"
                    align="center"
                    label="公告内容">
            </el-table-column>

            <el-table-column
                    align="center"
                    label="操作">

                <el-row>
                    <el-button type="primary" @click="delete1">删除</el-button>
                </el-row>

            </el-table-column>

        </el-table>
    </template>

</div>

</body>
<script src="js/axios-0.18.0.js"></script>
<script src="js/vue.js"></script>
<script src="element-ui/lib/index.js"></script>
<link rel="stylesheet" href="element-ui/lib/theme-chalk/index.css">

<script>
    new Vue({
        el: "#app",
        mounted() {
            this.selectAll();
        },
        data() {
            return {
                tableData: [],
            }
        },
        methods: {
            attend() {
                this.$confirm('是否删除该公告?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    axios({
                        method: "post",
                        url: "http://localhost:8080/System/attendActivityServlet",
                        data: this.activity
                    }).then(function (resp) {
                        var result = resp.data;
                        if (result === "success") {
                            alert("参与成功!");
                            location.href = "http://localhost:8080/System/eHomepageServlet?username=${username}"
                        } else if (result==="timeOut"){
                            alert("该活动已结束");
                        } else {
                            alert("您已参与该活动");
                        }
                    })
                }).catch(() => {
                    this.$message({
                        type: 'info',
                        message: '已取消'
                    });
                });
            },
            selectAll() {
                var _this = this
                axios({
                    method: "post",
                    url: "http://localhost:8080/System/announcementServlet",
                }).then(function (resp) {
                    _this.tableData = resp.data;
                })
            },
            handleCurrentChange(val) {
                this.activity.currentRow = val;
            }
        }
    })
</script>


</html>
