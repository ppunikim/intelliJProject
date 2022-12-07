<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<style>
    #first_header #picture {
        border: 1px solid black;
        border-radius: 15px;
    }
    #first_header img {
        width : 20px;
        height: 20px;
    }
    #first_header #userid {
        font-size: 20px;
    }
    .sun_flower {
        width:330px;
    }
</style>
<script type="application/javascript"></script>
<div id="first_header">
    <div class="left flex" style="margin: 7px 5px;;">
        <div id="picture"><img src="../assets/sunny.jpg"></div>
        <span id="userid" class="margin_left_10">hs._.7s</span>
    <%--    <span>${item.userid}</span>--%>
    </div>
    <div class="right flex"></div>
</div>

<div id="first_body">
    <%-- <div>${item.image}</div> --%>
    <div><img src="../assets/sunflower.jpg" class="sun_flower"></div>
</div>

<div id="first_footer" class="flex">
    <div>♡</div>
    <div class="margin_left_10">♬</div>
</div>