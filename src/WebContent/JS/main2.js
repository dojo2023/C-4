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
const r = Math.floor(Math.random()*2 +1);


const url='https://api.open-meteo.com/v1/forecast?latitude='+lati+'&longitude='+long+'&hourly=temperature_2m,weathercode&daily=temperature_2m_max,temperature_2m_min&forecast_days=1&timezone=Asia%2FTokyo';


  // データを取得して表示する関数
  async function displayData() {
    try {
      const parsedData = await fetchData(url);

      // 解析されたデータをHTMLに表示する
      //const outputElement = document.getElementById('output');
      const outputTempH = document.getElementById('temphigh');
      const outputTempL = document.getElementById('templow');
      const weatherimg6 = document.getElementById('weatherimg6');
	  const weatherimg9 = document.getElementById('weatherimg9');
      const weatherimg12 = document.getElementById('weatherimg12');
	  const weatherimg15 = document.getElementById('weatherimg15');
      const weatherimg18 = document.getElementById('weatherimg18');
	  const weatherimg921 = document.getElementById('weatherimg21');
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
      console.log("6時の"+parsedData.hourly.weathercode[6]);//6時間の天気コード
      console.log("9時の"+parsedData.hourly.weathercode[9]);//6時間の天気コード
	  console.log("12時の"+parsedData.hourly.weathercode[12]);//6時間の天気コード
      console.log("15時の"+parsedData.hourly.weathercode[15]);//6時間の天気コード
      console.log("18時の"+parsedData.hourly.weathercode[18]);//6時間の天気コード
      console.log("21時の"+parsedData.hourly.weathercode[21]);//6時間の天気コード
      console.log(parsedData.hourly.weathercode);//24時間分の天気コード

      console.log(hour);//今の時間
	  const gender = document.getElementById('gender').innerHTML;
	  console.log("gen" + gender);

        //6時の天気出力
		switch (parsedData.hourly.weathercode[6]) {
        case 0:
            weatherimg6.src = images[0];
            break;
        case 1:
        case 2:
            weatherimg6.src = images[1];
			break;
        case 3:
        case 45:
        case 48:
            weatherimg6.src = images[2];
			break;
        case 51:
        case 53:
        case 55:
        case 56:
        case 57:
            weatherimg6.src = images[3];
			break;
        case 61:
        case 63:
        case 66:
        case 80:
            weatherimg6.src = images[4];
			break;
        case 65:
        case 67:
        case 81:
        case 82:
            weatherimg6.src = images[5];
			break;
        case 71:
        case 73:
        case 77:
        case 85:
            weatherimg6.src = images[6];
			break;
        case 75:
        case 86:
            weatherimg6.src = images[7];
			break;
        case 95:
        case 96:
        case 99:
            weatherimg6.src = images[8];
			break;
        default:
            break;
      }
        //9時の天気出力
	  	switch (parsedData.hourly.weathercode[9]) {
        case 0:
            weatherimg9.src = images[0];
            break;
        case 1:
        case 2:
            weatherimg9.src = images[1];
            break;
        case 3:
        case 45:
        case 48:
            weatherimg9.src = images[2];
			break;
        case 51:
        case 53:
        case 55:
        case 56:
        case 57:
            weatherimg9.src = images[3];
			break;
        case 61:
        case 63:
        case 66:
        case 80:
            weatherimg9.src = images[4];
			break;
        case 65:
        case 67:
        case 81:
        case 82:
            weatherimg9.src = images[5];
			break;
        case 71:
        case 73:
        case 77:
        case 85:
            weatherimg9.src = images[6];
			break;
        case 75:
        case 86:
            weatherimg9.src = images[7];
            break;
        case 95:
        case 96:
        case 99:
            weatherimg9.src = images[8];
            break;
        default:
            break;
      }
      	 //12時の天気出力
	  	switch (parsedData.hourly.weathercode[12]) {
        case 0:
            weatherimg12.src = images[0];
            break;
        case 1:
        case 2:
            weatherimg12.src = images[1];
            break;
        case 3:
        case 45:
        case 48:
            weatherimg12.src = images[2];
			break;
        case 51:
        case 53:
        case 55:
        case 56:
        case 57:
            weatherimg12.src = images[3];
			break;
        case 61:
        case 63:
        case 66:
        case 80:
            weatherimg12.src = images[4];
			break;
        case 65:
        case 67:
        case 81:
        case 82:
            weatherimg12.src = images[5];
			break;
        case 71:
        case 73:
        case 77:
        case 85:
            weatherimg12.src = images[6];
			break;
        case 75:
        case 86:
            weatherimg12.src = images[7];
            break;
        case 95:
        case 96:
        case 99:
            weatherimg12.src = images[8];
            break;
        default:
            break;
      }
      //15時の天気出力
	  	switch (parsedData.hourly.weathercode[15]) {
        case 0:
            weatherimg15.src = images[0];
            break;
        case 1:
        case 2:
            weatherimg15.src = images[1];
            break;
        case 3:
        case 45:
        case 48:
            weatherimg15.src = images[2];
			break;
        case 51:
        case 53:
        case 55:
        case 56:
        case 57:
            weatherimg15.src = images[3];
			break;
        case 61:
        case 63:
        case 66:
        case 80:
            weatherimg15.src = images[4];
			break;
        case 65:
        case 67:
        case 81:
        case 82:
            weatherimg15.src = images[5];
			break;
        case 71:
        case 73:
        case 77:
        case 85:
            weatherimg15.src = images[6];
			break;
        case 75:
        case 86:
            weatherimg15.src = images[7];
            break;
        case 95:
        case 96:
        case 99:
            weatherimg15.src = images[8];
            break;
        default:
            break;
      }
	  //18時の天気出力
	  	switch (parsedData.hourly.weathercode[18]) {
        case 0:
            weatherimg18.src = images[0];
            break;
        case 1:
        case 2:
            weatherimg18.src = images[1];
            break;
        case 3:
        case 45:
        case 48:
            weatherimg18.src = images[2];
			break;
        case 51:
        case 53:
        case 55:
        case 56:
        case 57:
            weatherimg18.src = images[3];
			break;
        case 61:
        case 63:
        case 66:
        case 80:
            weatherimg18.src = images[4];
			break;
        case 65:
        case 67:
        case 81:
        case 82:
            weatherimg18.src = images[5];
			break;
        case 71:
        case 73:
        case 77:
        case 85:
            weatherimg18.src = images[6];
			break;
        case 75:
        case 86:
            weatherimg18.src = images[7];
            break;
        case 95:
        case 96:
        case 99:
            weatherimg18.src = images[8];
            break;
        default:
            break;
      }//21時の天気出力
	  	switch (parsedData.hourly.weathercode[21]) {
        case 0:
            weatherimg21.src = images[0];
            break;
        case 1:
        case 2:
            weatherimg21.src = images[1];
            break;
        case 3:
        case 45:
        case 48:
            weatherimg21.src = images[2];
			break;
        case 51:
        case 53:
        case 55:
        case 56:
        case 57:
            weatherimg21.src = images[3];
			break;
        case 61:
        case 63:
        case 66:
        case 80:
            weatherimg21.src = images[4];
			break;
        case 65:
        case 67:
        case 81:
        case 82:
            weatherimg21.src = images[5];
			break;
        case 71:
        case 73:
        case 77:
        case 85:
            weatherimg21.src = images[6];
			break;
        case 75:
        case 86:
            weatherimg21.src = images[7];
            break;
        case 95:
        case 96:
        case 99:
            weatherimg21.src = images[8];
            break;
        default:
            break;
      }



        const tops = document.getElementById('tops');
        const outer = document.getElementById('outer');
        const bottoms = document.getElementById('bottoms');



	    switch (gender) {
        case "1":
             //outer判断
	        if (templow >= 21-indext) {
	        outer.textContent = '';
	        newUrl1 = newUrl + '?';
	        }else if (templow < 21-indext && templow > (14-indext)) {
	        outer.textContent = '上に羽織るもの（薄手）';
			newUrl1 = newUrl + '?outer1=5';
	        }else if (templow <= 14-indext && templow > (9-indext)) {
	        outer.textContent = '上に羽織るもの';
			newUrl1 = newUrl + '?outer1=6';
	        }else if(templow <= 9-indext && templow > (5-indext)){
	        outer.textContent = '防寒着';
			newUrl1 = newUrl + '?outer1=4';
	        }else if(templow <= (5-indext)){
	        outer.textContent = '防寒着+上に羽織るもの';
			newUrl1 = newUrl + '?outer1=6&outer2=4';
	        };
	        //tops判断
	        if (temphigh >= (25-indext)) {
	        tops.textContent = '半袖';
			newUrl2 = newUrl1 + '&tops=1';
	        }else if (temphigh >= (20-indext) && temphigh < (25-indext)) {
	        tops.textContent = '長袖（薄手）';
			 newUrl2 = newUrl1 + '&tops=2';
	        }else if(temphigh < (20-indext)){
	        tops.textContent = '長袖';
			newUrl2 = newUrl1 + '&tops=3';
	        };
	        //bottomsの判断
	        if(temphigh >= (26-indext)) {

	        bottoms.textContent = '長ズボン（薄手）';
			newUrl3 = newUrl2 + '&bottoms=7';
	        }else if(temphigh < (26-indext)){
	        bottoms.textContent = '長ズボン';
			newUrl3 = newUrl2 + '&bottoms=8';
	        };
            break;
        case "2":
		case "3":
            //outer判断
	        if (templow >= 21-indext) {
	        outer.textContent = '';
	        newUrl1 = newUrl + '?';
	        }else if (templow < 21-indext && templow > (14-indext)) {
	        outer.textContent = '上に羽織るもの（薄手）';
			newUrl1 = newUrl + '?outer1=5';
	        }else if (templow <= 14-indext && templow > (9-indext)) {
	        outer.textContent = '上に羽織るもの';
			newUrl1 = newUrl + '?outer1=6';
	        }else if(templow <= 9-indext && templow > (5-indext)){
	        outer.textContent = '防寒着';
			newUrl1 = newUrl + '?outer1=4';
	        }else if(templow <= (5-indext)){
	        outer.textContent = '防寒着+上に羽織るもの';
			newUrl1 = newUrl + '?outer1=6&outer2=4';
	        };
	        //tops判断
	        if (temphigh >= (25-indext)) {
	        tops.textContent = '半袖';
			newUrl2 = newUrl1 + '&tops=1';
	        }else if (temphigh >= (20-indext) && temphigh < (25-indext)) {
	        tops.textContent = '長袖（薄手）';
			 newUrl2 = newUrl1 + '&tops=2';
	        }else if(temphigh < (20-indext)){
	        tops.textContent = '長袖';
			newUrl2 = newUrl1 + '&tops=3';
	        };
	        //bottomsの判断

	        if(temphigh >= (26-indext)) {

				if(r === 1){
					bottoms.textContent = '長ズボン（薄手）';
					newUrl3 = newUrl2 + '&bottoms=7';
				}else if (r === 2){
					bottoms.textContent = 'スカート';
					newUrl3 = newUrl2 + '&bottoms=9';
				}
	        }else if(temphigh < (26-indext)){
				if(r === 1){
					bottoms.textContent = '長ズボン';
					newUrl3 = newUrl2 + '&bottoms=7';
				}else if (r === 2){
					bottoms.textContent = 'スカート';
					newUrl3 = newUrl2 + '&bottoms=9';
				}
	        };
            break;
 		default:
            break;
      }
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



