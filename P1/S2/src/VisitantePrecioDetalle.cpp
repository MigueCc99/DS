#include "VisitantePrecioDetalle.h"
#include "ComponenteEquipo.h"

VisitantePrecioDetalle::VisitantePrecioDetalle() : VisitanteEquipo(), detalle("") {}

void VisitantePrecioDetalle::visitarBus (Bus *b) {
    detalle += "Nombre Bus: " + b->getNombre() + " Precio Bus: " + to_string(b->getPrecio()) + " ";
}

void VisitantePrecioDetalle::visitarDisco (Disco *d) {
    detalle += "Nombre Disco: " + d->getNombre() + " Precio Disco: " + to_string(d->getPrecio()) + " ";
}

void VisitantePrecioDetalle::visitarTarjeta (Tarjeta *t) {
    detalle += "Nombre Tarjeta: " + t->getNombre() + " Precio Tarjeta: " + to_string(t->getPrecio()) + " ";
}

void VisitantePrecioDetalle::reiniciarVisitante () {
    detalle = "";
}

string VisitantePrecioDetalle::getPrecioDetalle () {
    return detalle;
}
