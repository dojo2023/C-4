/**
 *
 */
//APIの情報を一日一回取得するためのページ追加をする案
const type = document.getElementById('type');
let aa = "";
let max = "";
let min = "";
let todaycode="";
var  array1 = new Array();



//latiとlongiの内容を変える方法を模索
const getDate=function(){
fetch("https://api.open-meteo.com/v1/forecast?latitude=35.69&longitude=139.69&hourly=temperature_2m,weathercode&daily=weathercode,temperature_2m_max,temperature_2m_min&forecast_days=1&timezone=Asia%2FTokyo")
.then((res)=>res.json())
//.then((apiData)=>console.log(apiData));
.then(function(apiData) {
	console.log(apiData);
	//document.getElementById('type').innerHTML = apiData['daily']['temperature_2m_max'];
	console.log(apiData['hourly']['temperature_2m']);
	console.log(apiData['hourly']['temperature_2m'][10]);
    aa = apiData['hourly']['temperature_2m'][10];
    max = apiData['daily']['temperature_2m_max'];
    array1 = apiData['hourly']['temperature_2m'];
    console.log(max);
    //document.getElementById('type2').innerHTML=aa;

//フォーム用の値を取得
	max = apiData['daily']['temperature_2m_max'];
    min = apiData['daily']['temperature_2m_min'];
    todaycode = apiData['daily']['weathercode'];
    /*code0 = apiData['hourly']['weathercode'][0];
    code1 = apiData['hourly']['weathercode'][1];
    code2 = apiData['hourly']['weathercode'][2];
    code3 = apiData['hourly']['weathercode'][3];
    code4 = apiData['hourly']['weathercode'][4];
    code5 = apiData['hourly']['weathercode'][5];
    code6 = apiData['hourly']['weathercode'][6];
    code7 = apiData['hourly']['weathercode'][7];
    code8 = apiData['hourly']['weathercode'][8];
    code9 = apiData['hourly']['weathercode'][9];
    code10 = apiData['hourly']['weathercode'][10];
    code11 = apiData['hourly']['weathercode'][11];
    code12 = apiData['hourly']['weathercode'][12];
    code13 = apiData['hourly']['weathercode'][13];
    code14 = apiData['hourly']['weathercode'][14];
    code15 = apiData['hourly']['weathercode'][15];
    code16 = apiData['hourly']['weathercode'][16];
    code17 = apiData['hourly']['weathercode'][17];
    code18 = apiData['hourly']['weathercode'][18];
    code19 = apiData['hourly']['weathercode'][19];
    code20 = apiData['hourly']['weathercode'][20];
    code21 = apiData['hourly']['weathercode'][21];
    code22 = apiData['hourly']['weathercode'][22];
    code23 = apiData['hourly']['weathercode'][23];
    temp0 = apiData['hourly']['temperture_2m'][0];
    temp1 = apiData['hourly']['temperture_2m'][1];
    temp2 = apiData['hourly']['temperture_2m'][2];
    temp3 = apiData['hourly']['temperture_2m'][3];
    temp4 = apiData['hourly']['temperture_2m'][4];
    temp5 = apiData['hourly']['temperture_2m'][5];
    temp6 = apiData['hourly']['temperture_2m'][6];
    temp7 = apiData['hourly']['temperture_2m'][7];
    temp8 = apiData['hourly']['temperture_2m'][8];
    temp9 = apiData['hourly']['temperture_2m'][9];
    temp10 = apiData['hourly']['temperture_2m'][10];
    temp11 = apiData['hourly']['temperture_2m'][11];
    temp12 = apiData['hourly']['temperture_2m'][12];
    temp13 = apiData['hourly']['temperture_2m'][13];
    temp14 = apiData['hourly']['temperture_2m'][14];
    temp15 = apiData['hourly']['temperture_2m'][15];
    temp16 = apiData['hourly']['temperture_2m'][16];
    temp17 = apiData['hourly']['temperture_2m'][17];
    temp18 = apiData['hourly']['temperture_2m'][18];
    temp19 = apiData['hourly']['temperture_2m'][19];
    temp20 = apiData['hourly']['temperture_2m'][20];
    temp21 = apiData['hourly']['temperture_2m'][21];
    temp22 = apiData['hourly']['temperture_2m'][22];
    temp23 = apiData['hourly']['temperture_2m'][23];*/
//フォームに値を入力
	 document.getElementById('maxtemperture').value=max;
	 document.getElementById('mintemperture').value=min;
	 document.getElementById('day_weather').value=todaycode;
	 //document.getElementById('code0').value=code0;




//ここにAPIを使った動作の記述
})

};

getDate();
console.log(aa);
