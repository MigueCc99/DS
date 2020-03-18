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

#ifndef COMPONENTEEQUIPO_H
#define COMPONENTEEQUIPO_H


#include <string>
using namespace std;

class VisitanteEquipo;

class ComponenteEquipo {

private:
    string nombre;
    int precio;
public:
    ComponenteEquipo ();
    ComponenteEquipo (string nombre, int precio);
    ComponenteEquipo (const ComponenteEquipo &ce);
    ComponenteEquipo& operator=(const ComponenteEquipo &ce);
    int getPrecio();
    string getNombre();
    virtual void aceptar (class VisitanteEquipo &ve) = 0;
};

#endif /* COMPONENTEEQUIPO_H */
