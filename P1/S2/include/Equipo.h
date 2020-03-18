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
#include "Bus.h"
#include "Tarjeta.h"
#include "Disco.h"
using namespace std;

// Clase Disco
class Equipo {
private:
    Bus *bus = nullptr;
    Tarjeta *tarjeta = nullptr;
    Disco *disco = nullptr;
public:
   Equipo ();
   void setBus(Bus *b);
   void setTarjeta(Tarjeta *t);
   void setDisco(Disco *d);
   Bus getBus();
   Tarjeta getTarjeta();
   Disco getDisco();
};

#endif /* EQUIPO_H */
