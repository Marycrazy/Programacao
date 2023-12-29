No [R3] como os utilizadores tem um tipo de serem gestores, farmacêuticos ou clientes na parte do [R6] os clientes e os farmaceuticos herdam da class utilizador e como ele diz "O NIF e contacto telefónico são únicos" 
estas seram 2 variaveis estaticas.
Apesar de tantos os farmaceuticos com os clientes terem os mesmos atributos como eles ja vao herdar de uma class eles nao podem herdar de outra, no maximo o que dava para fazer é tens a class utilizador depois tens outra class com os atributos NIF, morada e contacto telefónico que herda da class utilizador e depois sim as classes farmaceuticos e clientes que herdao dessa class onde depois automaticamente herdam dos utilizadores.

utlizadores-->outra class(nif, morada e contacto)--->class clientes e class farmaceurico

Foram acrescentados os getters e setters necessarios e começada uma classe de registo de utilizador que ainda precisa ser terminada



Referencias:
https://www.javaprogressivo.net/2012/09/aplicativo-menu-simples-usando-metodos.html
https://www.w3schools.com/java/java_files_read.asp
https://www.devmedia.com.br/forum/como-criptografar-senha-em-java/564794
https://www.digitalocean.com/community/tutorials/java-read-file-line-by-line
https://stackoverflow.com/questions/5868369/how-can-i-read-a-large-text-file-line-by-line-using-java
