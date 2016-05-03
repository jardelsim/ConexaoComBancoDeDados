/**
 * 
 */
package com.jems.cbd.anotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * <code>FaltaImplementar</code> em casos de algum recurso nescessario
 * 
 * @author jardel
 * @version 1.0
 */


@Target(ElementType.METHOD)
@Documented
public @interface FaltaImplementar {

	String[] faltaImplementar();

}
