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
#ifndef _TARJETA_H_
#define _TARJETA_H_

#include "ComponenteEquipo.cpp"
#include "VisitanteEquipo.h"
using namespace std;

// Clase Tarjeta
class Tarjeta : public ComponenteEquipo {

	public void aceptar (VisitanteEquipo ve);

};

#endif /* _TARJETA_H_ */
