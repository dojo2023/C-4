<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



 //<div>最高気温<span id ='type'></span></div>
//<div>14時の気温<span id ='type2'></span></div>
<form method="POST" action="/hello/WeatherInformationGetServlet" name="minmax_temperture_form">
    <input type="hidden" name="max_temperature"id='maxtemperture'>
    <input type="hidden" name="min_temperature"id='mintemperture' >
    <input type="hidden" name="day_weather"id='day_weather' >




    <!--  <input type="" name="weathercode_0"id='code0'>
    <input type="" name="weathercode_1"id='code1' >
    <input type="" name="weathercode_2"id='code2' >
    <input type="" name="weathercode_3"id='code3' >
    <input type="" name="weathercode_4"id='code4' >
    <input type="" name="weathercode_5"id=''value= >
    <input type="" name="weathercode_6"id=''value= >
    <input type="" name="weathercode_7"id=''value= >
    <input type="" name="weathercode_8"id=''value= >
    <input type="" name="weathercode_9"id=''value= >
    <input type="" name="weathercode_10"id=''value= >
    <input type="" name="weathercode_11"id=''value= >
    <input type="" name="weathercode_12"id=''value= >
    <input type="" name="weathercode_13"id=''value= >
    <input type="" name="weathercode_14"id=''value= >
    <input type="" name="weathercode_15"id=''value= >
    <input type="" name="weathercode_16"id=''value= >
    <input type="" name="weathercode_17"id=''value= >
    <input type="" name="weathercode_18"id=''value= >
    <input type="" name="weathercode_19"id=''value= >
    <input type="" name="weathercode_20"id=''value= >
    <input type="" name="weathercode_21"id=''value= >
    <input type="" name="weathercode_22"id=''value= >
    <input type="" name="weathercode_23"id=''value= >
   <input type="" name="temperture_0"id=''value= >-->

</form>







<script src="/hello/JS/weather_information_get.js">
  </script>
</body>
</html>