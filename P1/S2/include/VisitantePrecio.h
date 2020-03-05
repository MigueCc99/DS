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
#ifndef _VISITANTEPRECIO_H_
#define _VISITANTEPRECIO_H_

// Clase VisitantePrecio
class VisitantePrecio : VisitanteEquipo {
	int precio;

	VisitantePrecio ();
	public void visitarDisco (Disco d);
	public void visitarTarjeta (Tarjeta t);
	public void visitarBus (Bus b);
	int getPrecio();
};

#endif /* _VISITANTEPRECIO_H_ */
