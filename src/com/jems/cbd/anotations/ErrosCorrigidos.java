/**
 * 
 */
package com.jems.cbd.anotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * <code>ErrosCorrigidos</code> en caso de algum erro resolvido
 * 
 * @author jardel
 * @version 1.0
 */


@Target(ElementType.METHOD)
@Documented
public @interface ErrosCorrigidos {

	String[] erros();

}
