/**
 * 
 */
package com.jems.cbd.anotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * <code>Cabecalho</code> contem o cabeçalho do projeto.
 * 
 * @author jardel
 * @version 1.0
 */


@Target(ElementType.TYPE)
@Documented
public @interface Cabecalho {

	String instituicao() default "Jems";

	String projeto() default "Conexao com banco de dados";

	String dataCriacao();

	String criador() default "Jardel Cavalcante";

	int revisao() default 1;

}
