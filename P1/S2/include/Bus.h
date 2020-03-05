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
#ifndef _BUS_H_
#define _BUS_H_

#include "ComponenteEquipo.cpp"
#include "VisitanteBus.h"
using namespace std;

// Clase Bus
class Bus : public ComponenteEquipo {

	public void aceptar (VisitanteEquipo ve);

};

#endif /* _BUS_H_ */
