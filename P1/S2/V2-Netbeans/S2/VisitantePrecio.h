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

#include "VisitanteEquipo.h"

// Clase VisitantePrecio
class VisitantePrecio : VisitanteEquipo {
private:
	int precio;
public:
    VisitantePrecio ();
    void visitarDisco (Disco d);
    void visitarTarjeta (Tarjeta t);
    void visitarBus (Bus b);
    void reiniciarVisitante ();
    int getPrecio();
};

#endif /* _VISITANTEPRECIO_H_ */

