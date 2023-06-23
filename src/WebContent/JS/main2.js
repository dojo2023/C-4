/**
 *
 */
const date = new Date();
const month = date.getMonth() + 1;
const day = date.getDate();
const week = date.getDay();
const hour = date.getHours();
const weekItems = ["日", "月", "火", "水", "木", "金", "土"];
const dayOfWeek = weekItems[week];
window.onload = function(){
document.getElementById("today").innerHTML = `${month}/${day}（${dayOfWeek}）`;
}





// 非同期関数でAPIのデータを取得する
async function fetchData(url) {
    try {
      const response = await fetch(url);
      if (!response.ok) {
        throw new Error('APIからのデータ取得に失敗しました。')
      }
      const jsonData = await response.json();
      return jsonData;
    } catch (error) {
      console.log('エラー:', error);
      throw error;
    }
  }

const long = document.getElementById('long').innerHTML;
const lati = document.getElementById('lati').innerHTML;
const index = document.getElementById('index').innerHTML;
const indexp = document.getElementById('indexp').innerHTML;
const indext = parseInt(indexp);
const btn = document.getElementById('btn');
let newUrl = btn.href;
let newUrl1 = newUrl;
let newUrl2 = newUrl1;
let newUrl3 = newUrl2;



const url='https://api.open-meteo.com/v1/forecast?latitude='+lati+'&longitude='+long+'&hourly=temperature_2m,weathercode&daily=temperature_2m_max,temperature_2m_min&forecast_days=1&timezone=Asia%2FTokyo';


  // データを取得して表示する関数
  async function displayData() {
    try {
      const parsedData = await fetchData(url);

      // 解析されたデータをHTMLに表示する
      //const outputElement = document.getElementById('output');
      const outputTempH = document.getElementById('temphigh');
      const outputTempL = document.getElementById('templow');
      const weatherimg = document.getElementById('weatherimg');
      const images = ['/hello/images/weather_images/weather_快晴.png','/hello/images/weather_images/weather_晴れ.png','/hello/images/weather_images/weather_くもり.png','/hello/images/weather_images/weather_霧雨.png','/hello/images/weather_images/weather_雨.png','/hello/images/weather_images/weather_大雨.png','/hello/images/weather_images/weather_雪.png','/hello/images/weather_images/weather_大雪.png','/hello/images/weather_images/weather_雷.png'];

      //outputElement.innerHTML = JSON.stringify(parsedData);
      const temphigh = parsedData.daily.temperature_2m_max[0];
      const templow = parsedData.daily.temperature_2m_min[0];
	  console.log("max:"+temphigh);
	  console.log("min:"+templow);
      const hourweathercode = parsedData.hourly.weathercode[hour];
      outputTempH.innerHTML = JSON.stringify(temphigh);
      outputTempL.innerHTML = JSON.stringify(templow);
      console.log(hourweathercode);//一時間ごとの天気コード
      console.log(parsedData.hourly.weathercode);//24時間分の天気コード
      console.log(hour);//今の時間



      switch (hourweathercode) {
        case 0:
            weatherimg.src = images[0];
            break;
        case 1:
        case 2:
            weatherimg.src = images[1];
            break;
        case 3:
        case 45:
        case 48:
            weatherimg.src = images[2];
            break;
        case 51:
        case 53:
        case 55:
        case 56:
        case 57:
            weatherimg.src = images[3];
            break;
        case 61:
        case 63:
        case 66:
        case 80:
            weatherimg.src = images[4];
            break;
        case 65:
        case 67:
        case 81:
        case 82:
            weatherimg.src = images[5];
            break;
        case 71:
        case 73:
        case 77:
        case 85:
            weatherimg.src = images[6];
            break;
        case 75:
        case 86:
            weatherimg.src = images[7];
            break;
        case 95:
        case 96:
        case 99:
            weatherimg.src = images[8];
            break;
        default:
            break;
      }
        const tops = document.getElementById('tops');
        const outer = document.getElementById('outer');
        const bottoms = document.getElementById('bottoms');

        //tops判断
        if (temphigh >= (25-indext)) {
        tops.textContent = '半袖';
		newUrl1 = newUrl + '?tops=1';
        }else if (temphigh >= (20-indext) && temphigh < (25-indext)) {
        tops.textContent = '長袖（薄手）';
		 newUrl1 = newUrl + '?tops=2';
        }else if(temphigh < (20-indext)){
        tops.textContent = '長袖';
		newUrl1 = newUrl + '?tops=3';
        };


        //outer判断
        if (templow >= 21+indext) {
        outer.textContent = '';
        }else if (templow < 21+indext && templow > (14+indext)) {
        outer.textContent = '上に羽織るもの（薄手）';
		newUrl2 = newUrl1 + '&outer1=4';
        }else if (templow <= 14+indext && templow > (9+indext)) {
        outer.textContent = '上に羽織るもの';
		newUrl2 = newUrl1 + '&outer1=5';
        }else if(templow <= 9+indext && templow > (5+indext)){
        outer.textContent = '防寒着';
		newUrl2 = newUrl1 + '&outer1=6';
        }else if(templow <= (5+indext)){
        outer.textContent = '防寒着+上に羽織るもの';
		newUrl2 = newUrl1 + '&outer2=9';
        };

        //bottomsの判断
        if(temphigh >= (26-indext)) {
        bottoms.textContent = '長ズボン（薄手）';
		newUrl3 = newUrl2 + '&bottoms=7';
        }else if(temphigh < (26-indext)){
        bottoms.textContent = '長ズボン';
		newUrl3 = newUrl2 + '&bottoms=8';
        };

		btn.addEventListener('click',function(event) {
			    event.preventDefault();
			    window.location.href = newUrl3
			});

    } catch (error) {
      // エラーハンドリング
      console.log('エラー:', error);
    }
  }

  // データを表示する関数を呼び出す
displayData();



