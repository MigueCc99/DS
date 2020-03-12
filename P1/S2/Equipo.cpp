#include "Equipo.h"

Equipo::Equipo () {}

Equipo::Equipo (vector<ComponenteEquipo> componentes){
	this->componentes = componentes;
}

void Equipo::visitarComponentes (VisitanteEquipo ve) {
	for(int i=0; i<componentes.size(); i++)
		componentes(i).aceptar(ve);
}

int Equipo::getNumComponentes (){
	return componentes.size();
}

ComponenteEquipo Equipo::getComponente(int i){
	return componentes[i];
}