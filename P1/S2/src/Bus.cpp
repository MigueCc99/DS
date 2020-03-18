#include "ComponenteEquipo.h"
#include "VisitanteEquipo.h"
#include "Bus.h"
#include <iostream>

Bus::Bus (string nombre, int precio) : ComponenteEquipo(nombre, precio) {}

void Bus::aceptar (VisitanteEquipo &ve){
    ve.visitarBus(this);
}
