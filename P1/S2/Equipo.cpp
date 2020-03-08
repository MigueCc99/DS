#include "Equipo.h"

Equipo::Equipo () {}

Equipo::Equipo (vector<ComponenteEquipo> componentes){
	this->componentes = componentes;
}

int Equipo::getNumComponentes (){
	return componentes.size();
}

ComponenteEquipo Equipo::getComponente(int i){
	return componentes[i];
}
