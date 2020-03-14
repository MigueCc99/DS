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
#ifndef EQUIPO_H
#define EQUIPO_H

#include <vector>
#include "ComponenteEquipo.h"
using namespace std;

// Clase Disco
class Equipo {
private:
    vector<ComponenteEquipo> componentes;
public:
   Equipo ();
   Equipo (vector<ComponenteEquipo> componentes);
   int getNumComponentes ();
   ComponenteEquipo getComponente(int i);
};

#endif /* EQUIPO_H */
