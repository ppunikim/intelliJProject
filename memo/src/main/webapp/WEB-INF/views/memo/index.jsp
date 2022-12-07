<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="/css/component.css" type="text/css" >
<script src='./js/jquery-3.6.1.min.js'></script>

<style type="text/css">
    #subContainer {
        border: 1px solid black;
        width: 330px;
        height: 620px;
        margin: 20px auto;
        padding: 7px 0;
        display: flex;
        flex-direction: column;
    }
    #header {
        border-bottom: 1px solid black;
        padding-bottom: 5px;
    }
    .circle {
        width: 21px;
        border: 1px solid black;
        border-radius: 8px;
        margin: 0 auto;
        margin-left: 3px;
    }
    #body {
    }
    #footer {
        border-top: 1px solid black;
        display: flex;
        justify-content: space-between;
    }
</style>

<script type="application/javascript">
    let subContainer,
        gridMain;

    $(document).ready(function () {
        subContainer = $("#subContainer");
        gridMain     = subContainer.find("#grid_main");

        // body 피드 보이는 곳
        selMainContent();
    });
    function setParam() {

    }

    function selMainContent() {
        const url = "memo/first.test";
        console.log(url)
        $.post(url, function (data) {
            gridMain.html(data);
        })
    }

</script>
<h1 class="none">인스타 화면 만들어보자.</h1>
<div id="subContainer" class="container">
    <div style="height: 100vh">
        <!-- header 추가, 좋아요 누른 리스트, 메세지 보내기 -->
        <div id="header" class="flex">
            <div class="left flex">
                <span>Instagram</span>
            </div>
            <div class="right flex">
                <div class="circle"><a>+</a></div>
                <div class="circle"><a>♡</a></div>
                <div class="circle"><a>♬</a></div>
            </div>
        </div>

        <div id="body" class="flex" style="height: 570px;">
            <div id="grid_main" style="flex:1"></div>
        </div>

        <!-- footer 홈화면, 검색화면, 마이페이지 -->
        <div id="footer">
            <a>home</a>
            <a>look</a>
            <a>mypage</a>
        </div>
    </div>
    </div>
