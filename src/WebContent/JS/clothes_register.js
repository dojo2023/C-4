/**
 *
 */

 function previewImage(obj){

		var fileReader = new FileReader();

		// 読み込み後に実行する処理
		fileReader.onload = (function() {

			// canvas にプレビュー画像を表示
			var canvas = document.getElementById('preview');
			var ctx = canvas.getContext('2d');
			var image = new Image();
			image.src = fileReader.result;
			console.log(fileReader.result) // ← (確認用)

			image.onload = (function () {
				canvas.width = image.width;
				canvas.height = image.height;
				ctx.drawImage(image, 0, 0);
			});
		});
		// 画像読み込み
		fileReader.readAsDataURL(obj.files[0]);
		console.log(fileReader.result) // ← (確認用)null
	}


function preview2Image(obj){

		var fileReader2 = new FileReader();

		// 読み込み後に実行する処理
		fileReader2.onload = (function() {

			// canvas にプレビュー画像を表示
			var canvas2 = document.getElementById('preview2');
			var ctx2 = canvas2.getContext('2d');
			var image2 = new Image();
			image2.src = fileReader2.result;
			console.log(fileReader2.result) // ← (確認用)

			image2.onload = (function () {
				canvas2.width = image2.width;
				canvas2.height = image2.height;
				ctx2.drawImage(image2, 0, 0);
			});
		});
		// 画像読み込み
		fileReader2.readAsDataURL(obj.files[0]);
		console.log(fileReader2.result) // ← (確認用)null
	}


function preview3Image(obj){

		var fileReader3 = new FileReader();

		// 読み込み後に実行する処理
		fileReader3.onload = (function() {

			// canvas にプレビュー画像を表示
			var canvas3 = document.getElementById('preview3');
			var ctx3 = canvas3.getContext('2d');
			var image3 = new Image();
			image3.src = fileReader3.result;
			console.log(fileReader3.result) // ← (確認用)

			image3.onload = (function () {
				canvas3.width = image3.width;
				canvas3.height = image3.height;
				ctx3.drawImage(image3, 0, 0);
			});
		});
		// 画像読み込み
		fileReader3.readAsDataURL(obj.files[0]);
		console.log(fileReader3.result) // ← (確認用)null
	}


function preview4Image(obj){

		var fileReader4 = new FileReader();

		// 読み込み後に実行する処理
		fileReader4.onload = (function() {

			// canvas にプレビュー画像を表示
			var canvas4 = document.getElementById('preview4');
			var ctx4 = canvas4.getContext('2d');
			var image4 = new Image();
			image4.src = fileReader4.result;
			console.log(fileReader4.result) // ← (確認用)

			image4.onload = (function () {
				canvas4.width = image4.width;
				canvas4.height = image4.height;
				ctx4.drawImage(image4, 0, 0);
			});
		});
		// 画像読み込み
		fileReader4.readAsDataURL(obj.files[0]);
		console.log(fileReader4.result) // ← (確認用)null
	}


function preview5Image(obj){

		var fileReader5 = new FileReader();

		// 読み込み後に実行する処理
		fileReader5.onload = (function() {

			// canvas にプレビュー画像を表示
			var canvas5 = document.getElementById('preview5');
			var ctx5 = canvas5.getContext('2d');
			var image5 = new Image();
			image5.src = fileReader5.result;
			console.log(fileReader5.result) // ← (確認用)

			image5.onload = (function () {
				canvas5.width = image5.width;
				canvas5.height = image5.height;
				ctx5.drawImage(image5, 0, 0);
			});
		});
		// 画像読み込み
		fileReader5.readAsDataURL(obj.files[0]);
		console.log(fileReader5.result) // ← (確認用)null
	}


function preview6Image(obj){

		var fileReader6 = new FileReader();

		// 読み込み後に実行する処理
		fileReader6.onload = (function() {

			// canvas にプレビュー画像を表示
			var canvas6 = document.getElementById('preview6');
			var ctx6 = canvas6.getContext('2d');
			var image6 = new Image();
			image6.src = fileReader6.result;
			console.log(fileReader6.result) // ← (確認用)

			image6.onload = (function () {
				canvas6.width = image6.width;
				canvas6.height = image6.height;
				ctx6.drawImage(image6, 0, 0);
			});
		});
		// 画像読み込み
		fileReader6.readAsDataURL(obj.files[0]);
		console.log(fileReader6.result) // ← (確認用)null
	}