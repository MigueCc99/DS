#include "Equipo.h"

Equipo::Equipo (){}

int Equipo::getNumComponentes (){
	return componentes.size();
}

ComponenteEquipo Equipo::getComponente(int i){
	return componentes[i];
}