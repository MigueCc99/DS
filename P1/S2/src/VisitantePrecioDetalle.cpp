#include "VisitantePrecioDetalle.h"
#include "ComponenteEquipo.h"

VisitantePrecioDetalle::VisitantePrecioDetalle() : VisitanteEquipo(), detalle("") {}

void VisitantePrecioDetalle::visitarBus (Bus *b) {
    detalle += "\n-Nombre Bus: " + b->getNombre() + "\n-Precio Bus: " + to_string(b->getPrecio()) + " ";
}

void VisitantePrecioDetalle::visitarDisco (Disco *d) {
    detalle += "\n-Nombre Disco: " + d->getNombre() + "\n-Precio Disco: " + to_string(d->getPrecio()) + " ";
}

void VisitantePrecioDetalle::visitarTarjeta (Tarjeta *t) {
    detalle += "\n-Nombre Tarjeta: " + t->getNombre() + "\n-Precio Tarjeta: " + to_string(t->getPrecio()) + " ";
}

void VisitantePrecioDetalle::reiniciarVisitante () {
    detalle = "";
}

string VisitantePrecioDetalle::getPrecioDetalle () {
    return detalle;
}
