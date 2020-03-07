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
#ifndef _COMPONENTEEQUIPO_H_
#define _COMPONENTEEQUIPO_H_

#include <string>
#include "VisitanteEquipo.h"
using namespace std;

// Clase ComponenteEquipo
class ComponenteEquipo {
private:
    string nombre;
    int precio;
public:
    ComponenteEquipo ();
    ComponenteEquipo (string nombre, int precio);
    int getPrecio();
    string getNombre();
    virtual void aceptar (VisitanteEquipo ve) = 0;

};

#endif /* _COMPONENTEEQUIPO_H_ */


