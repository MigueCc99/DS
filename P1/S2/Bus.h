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

#ifndef BUS_H
#define BUS_H

#include "ComponenteEquipo.h"
using namespace std;

// Clase Bus
class Bus : public ComponenteEquipo {
public:
    Bus (string nombre, int precio);

    //void aceptar (VisitanteEquipo ve);

};

#endif /* BUS_H */

