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
#ifndef _VISITANTEPRECIODETALLE_H_
#define _VISITANTEPRECIODETALLE_H_

#include <string>
using namespace std;

// Clase VisitantePrecioDetalle
class VisitantePrecioDetalle : VisitanteEquipo {
private:
    string detalle;
public:
    VisitantePrecioDetalle ();
    void visitarDisco (Disco d);
    void visitarTarjeta (Tarjeta t);
    void visitarBus (Bus b);
    void reiniciarVisitante ();
    string getPrecioDetalle();
};

#endif /* _VISITANTEPRECIODETALLE_H_ */

