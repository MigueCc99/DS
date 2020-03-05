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
#ifndef _EQUIPO_H_
#define _EQUIPO_H_

#include <vector>
#include "ComponenteEquipo.h"
using namespace std;

// Clase Disco
class Equipo {
	vector<ComponenteEquipo> componentes;

	Equipo ();
	Equipo (vector<ComponenteEquipo> componentes);
	void visitarComponentes ();
	int getNumComponentes ();
	ComponenteEquipo getComponente(int i);
};

#endif /* _EQUIPO_H_ */
