# proyecto-conversor-alura
<h1 align = "center">Conversor de monedas con ExchangeRate - API</h1>
![LOGO-CONVERSOR](https://github.com/sam17m2005/proyecto-conversor-alura/assets/137258353/ee839012-37d8-46f7-9dce-b8ff00c642d3)

Conversor de monedas con conexión a una API (ExchageRate-API) como parte de la formación  de Java Orientado a Objetos.
- Estado del proyecto: Finalizado.<br><br>

<h4>Paquete principal</h4>
En este se manejan las clases relacionadas con el desarrollo principal del porgrama, como la impresión en consola del menu principal, el manejo de la opción seleccionada por el usuario y el llamado de los objetos para el flujo del porgrama.<br><br>
Cuenta con las clases: Principal.java y MonedaPrin.java

<h4>Paquete de consulta</h4>
En este se tienen las clases que se encargan de realizar la consulta a la API y de capturar los datos para utilizarlos en las clases principales, asi como obtener una respuesta que será imprimida para que el usuario pueda visualizarla.<br><br>
Cuenta con la clase: ExchangeConsultaApi.java, Moneda.java y MonedaRecord.java

<h4>Clase Principal</h4>
Esta se encarga de la ejecución del programa y cuenta con el método "buclePrincipal" el cual se llama desde el métddo main de esta clase. Este método se encarga de imprimir el menú de usuario ademas de manejar todas las opciones que se necesitan para hacer las consultas. Tambien en caso de que se cometa algún error a la hora de ingresar los datos, este método se continuará ejecutando, esto permite que la única forma de salir del programa sea por medio de la elección del usuario.

<h4>Clase MonedaPrin</h4>
Esta se encarga de manejar las unidas de las monedas que van a hacer parte de la conversión. Cuenta con métodos setters y getters para sus atributos. <br>Para sus métodos se tienen en cuenta: la unidad de la moneda inicial, la unidad de moneda a la que se quiere hacer la conversión y la cantidad de dinero que se quiere convertir.

<h4>Clase ExchangeConsultaApi</h4>
Realiza la consulta a la API por medio del método "hacerConsulta()". Para que cumpla con esta función se hizo uso de la libresia GSON para convertir los objetos de formato JSON a objetos java utilizables en el código.

<h4>Clase Moneda</h4>
Esta clase es un record que se encarga de capturar el nombre de los atributos utilizados en la API para, en conjunto con la clase ExchangeConsultaApi, poder obtener el valor que hara parte de la respuesta final. En esta clase se reescribió el método toString().

<h4>Clase MonedaRecord</h4>
Esta clase es otro record que recibe un objeto de tipo Moneda, ademas de la cantidad para realizar la conversión de monedas (todo esto desde la clase Principal).
En esta clase se reescribió el método toString().

