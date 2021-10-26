<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="http://"+window.location.host+"/daw2-servlets/participante"> participantes</a>
<a href="http://"+window.location.host+"/daw2-servlets/leilao"> leiloes</a>
</body>
<script type="text/javascript">

// 	setInterval(() => {
// 		divs = document.querySelectorAll('div');
// 		divs.forEach(d => {
// 			setInterval(() => {
// 				var ajax = new XMLHttpRequest();
// 				ajax.open("GET", "http://"+window.location.host+"/daw2-servlets/random?div="+d.getAttribute("name"));
// 				ajax.send();	
// 				ajax.onreadystatechange =
// 						function (){//funcao anonima
// 							callBack(ajax, d)
// 						}; 
// 			}, 2000);
		
// 		});
// 	}, 3000);
	
// 	function callBack(ajax, component){
// 		console.log('status de retorno: ' + ajax.status);
// 		if(ajax.readyState == 4 && ajax.status == 200){
// 			var resposta = ajax.responseText;
// 			const arr = resposta.split("  ");
// 			component.innerHTML = arr[1];
// 		}
// 	}
	
	
	
</script>
</html>