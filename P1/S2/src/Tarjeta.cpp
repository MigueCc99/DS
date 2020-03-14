#include "ComponenteEquipo.h"
#include "VisitanteEquipo.h"
#include "Tarjeta.h"

Tarjeta::Tarjeta(string nombre, int precio) : ComponenteEquipo(nombre, precio) {}

void Tarjeta::aceptar (VisitanteEquipo *ve){
	ve->visitarTarjeta(this);
}
