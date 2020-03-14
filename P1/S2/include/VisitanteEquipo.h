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
#ifndef VISITANTEEQUIPO_H
#define VISITANTEEQUIPO_H

#include "Bus.h"
#include "Disco.h"
#include "Tarjeta.h"

// Clase VisitanteEquipo
class VisitanteEquipo {
public:
    VisitanteEquipo () {}
    virtual void visitarBus (Bus *b) {};
    virtual void visitarDisco (Disco *d) {};
    virtual void visitarTarjeta (Tarjeta *t) {};
    virtual void reiniciarVisitante () {};
};


#endif /* VISITANTEEQUIPO_H */
