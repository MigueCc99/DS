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
#ifndef VISITANTEPRECIODETALLE_H
#define VISITANTEPRECIODETALLE_H

#include <string>
#include "VisitanteEquipo.h"
using namespace std;

// Clase VisitantePrecioDetalle
class VisitantePrecioDetalle : public VisitanteEquipo {
private:
    string detalle;
public:
    VisitantePrecioDetalle ();
    void visitarBus (Bus b);
    void visitarDisco (Disco d);
    void visitarTarjeta (Tarjeta t);
    void reiniciarVisitante ();
    string getPrecioDetalle ();
};

#endif /* VISITANTEPRECIODETALLE_H */

