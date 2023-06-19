/**
 *
 */
//APIの情報を一日一回取得するためのページ追加をする案
const type = document.getElementById('type');
let aa = "";
let max = "";
var  array1 = new Array();
const getDate=function(){
fetch("https://api.open-meteo.com/v1/forecast?latitude=35.69&longitude=139.69&hourly=temperature_2m,weathercode&daily=temperature_2m_max,temperature_2m_min&forecast_days=1&timezone=Asia%2FTokyo")
.then((res)=>res.json())
//.then((apiData)=>console.log(apiData));
.then(function(apiData) {
	console.log(apiData);
	document.getElementById('type').innerHTML = apiData['daily']['temperature_2m_max'];
	console.log(apiData['hourly']['temperature_2m']);
	console.log(apiData['hourly']['temperature_2m'][10]);
    aa = apiData['hourly']['temperature_2m'][10];
    max = apiData['daily']['temperature_2m_max'];
    array1 = apiData['hourly']['temperature_2m'];
    console.log(max);
    document.getElementById('type2').innerHTML=aa;
   // document.getElementById('maxtemperture')=max;






//ここにAPIを使った動作の記述
})

};

getDate();
console.log(aa);
