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
#ifndef _DISCO_H_
#define _DISCO_H_

#include "ComponenteEquipo.cpp"
#include "VisitanteEquipo.h"
using namespace std;

// Clase Disco
class Disco : public ComponenteEquipo {

	public void aceptar (VisitanteEquipo ve);

};

#endif /* _DISCO_H_ */

