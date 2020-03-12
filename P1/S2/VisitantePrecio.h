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
#ifndef VISITANTEPRECIO_H
#define VISITANTEPRECIO_H

#include "VisitanteEquipo.h"

// Clase VisitantePrecio
class VisitantePrecio : public VisitanteEquipo {
private:
    int precio;
public:
    VisitantePrecio ();
    void visitarBus (Bus b);
    void visitarDisco (Disco d);
    void visitarTarjeta (Tarjeta t);
    void reiniciarVisitante ();
    int getPrecio ();
};

#endif /* VISITANTEPRECIO_H */

