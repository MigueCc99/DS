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
#ifndef TARJETA_H
#define TARJETA_H

#include "ComponenteEquipo.h"
using namespace std;

class VisitanteEquipo;

// Clase Tarjeta
class Tarjeta :  public ComponenteEquipo {
public:
    Tarjeta (string nombre, int precio);
    void aceptar (VisitanteEquipo *ve);
};


#endif /* TARJETA_H */
