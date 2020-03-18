#include "ComponenteEquipo.h"
#include "VisitanteEquipo.h"
#include "Disco.h"

Disco::Disco (string nombre, int precio) : ComponenteEquipo(nombre, precio) {}

void Disco::aceptar (VisitanteEquipo &ve){
	ve.visitarDisco(this);
}
