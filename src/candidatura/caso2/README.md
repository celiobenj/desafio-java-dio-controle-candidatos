# Caso 2

**Case 2:** Foi solicitado, que nosso sistema garanta que, diante das inúmeras candidaturas sejam selecionados apenas no máximo, 5 candidatos para entrevista, onde o salário pretendido seja menor ou igual ao salário base.

~~~java  
// Array com a lista de candidatos
String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"}; 
~~~

~~~java
// Método que simula o valor pretendido
import java.util.concurrent.ThreadLocalRandom;
static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
}
~~~