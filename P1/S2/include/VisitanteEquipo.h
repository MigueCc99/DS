/**
 * Universidad de Granada - Grado en Informatica : 2020
 *
 * Asignatura: Desarrollo de Software
 * Practica 1 - S2
 *
 * @author Miguel Ángel Campos Cubillas
 * @email miguecc99@correo.ugr.es
 *
 */
#ifndef _VISITANTEEQUIPO_H_
#define _VISITANTEEQUIPO_H_

// Clase VisitanteEquipo
class VisitanteEquipo {
	public virtual void visitarDisco (Disco d) = 0;
	public virtual void visitarTarjeta (Tarjeta t) = 0;
	public virtual void visitarBus (Bus b) = 0;
};

#endif /* _VISITANTEEQUIPO_H_ */
