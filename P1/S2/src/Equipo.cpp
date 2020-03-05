#include "Equipo.h"

Equipo::Equipo () {}

Equipo::Equipo (vector<ComponenteEquipo> componentes){
	this->componentes = componentes;
}

void Equipo::visitarComponentes () {
	for(int i=0; i<componentes.size(); i++)
		componente(i).aceptar();
}

int Equipo::getNumComponentes (){
	return componentes.size();
}

ComponenteEquipo Equipo::getComponente(int i){
	return componentes[i];
}
